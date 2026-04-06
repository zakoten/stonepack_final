from pathlib import Path
import json
from PIL import Image

ROOT = Path("src/main/resources/assets/stonepack")
TEXTURES = ROOT / "textures" / "block"
BLOCKSTATES = ROOT / "blockstates"
BLOCK_MODELS = ROOT / "models" / "block"
ITEM_MODELS = ROOT / "models" / "item"

BLOCKSTATES.mkdir(parents=True, exist_ok=True)
BLOCK_MODELS.mkdir(parents=True, exist_ok=True)
ITEM_MODELS.mkdir(parents=True, exist_ok=True)

NAMESPACE = "stonepack"


def write_json(path: Path, data: dict):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(data, indent=2) + "\n", encoding="utf-8")


def load_rgba(path: Path) -> Image.Image:
    return Image.open(path).convert("RGBA")


def save_rgba(path: Path, img: Image.Image):
    path.parent.mkdir(parents=True, exist_ok=True)
    img.save(path)


def alpha_composite(base_path: Path, overlay_path: Path, out_path: Path):
    base = load_rgba(base_path)
    overlay = load_rgba(overlay_path)

    if base.size != overlay.size:
        overlay = overlay.resize(base.size, Image.NEAREST)

    out = Image.alpha_composite(base, overlay)
    save_rgba(out_path, out)


def overlay_type_for_mossy(name_without_prefix: str) -> str:
    # order matters
    if name_without_prefix.endswith("_cracked_bricks"):
        return "cracked_bricks"
    if name_without_prefix.endswith("_bricks"):
        return "bricks"
    if name_without_prefix.endswith("_tiles"):
        return "tiles"
    if name_without_prefix.endswith("_smooth"):
        return "smooth"
    if name_without_prefix.endswith("_polished"):
        return "polished"
    if name_without_prefix.startswith("cobbled_"):
        return "cobbled"
    return "base"


def generate_mossy_textures():
    pngs = {p.stem for p in TEXTURES.glob("*.png")}

    # moss overlays available in your pack
    overlays = {
        "base": TEXTURES / "moss_overlay_base.png",
        "cobbled": TEXTURES / "moss_overlay_cobbled.png",
        "smooth": TEXTURES / "moss_overlay_smooth.png",
        "polished": TEXTURES / "moss_overlay_polished.png",
        "bricks": TEXTURES / "moss_overlay_bricks.png",
        "cracked_bricks": TEXTURES / "moss_overlay_cracked_bricks.png",
        "tiles": TEXTURES / "moss_overlay_tiles.png",
    }

    created = []

    for stem in sorted(pngs):
        # skip overlays themselves
        if stem.startswith("moss_overlay_"):
            continue

        # skip chiseled special textures
        if stem.endswith("_top") or stem.endswith("_side"):
            continue

        # we only auto-build mossy_* files if they don't already exist as real textures
        mossy_name = f"mossy_{stem}"
        mossy_path = TEXTURES / f"{mossy_name}.png"

        if mossy_name in pngs:
            continue

        overlay_kind = overlay_type_for_mossy(stem)
        overlay_path = overlays.get(overlay_kind)
        base_path = TEXTURES / f"{stem}.png"

        if not base_path.exists():
            continue
        if overlay_path is None or not overlay_path.exists():
            continue

        alpha_composite(base_path, overlay_path, mossy_path)
        created.append(mossy_name)

    return created


def generate_jsons():
    pngs = {p.stem for p in TEXTURES.glob("*.png")}

    # normal full cube blocks
    normal_blocks = sorted(
        stem for stem in pngs
        if not stem.startswith("moss_overlay_")
        and not stem.endswith("_top")
        and not stem.endswith("_side")
    )

    # chiseled blocks
    chiseled_blocks = sorted(
        stem[:-4] for stem in pngs
        if stem.endswith("_top") and f"{stem[:-4]}_side" in pngs
    )

    # generate normal cube_all assets
    for name in normal_blocks:
        blockstate = {
            "variants": {
                "": {"model": f"{NAMESPACE}:block/{name}"}
            }
        }

        block_model = {
            "parent": "minecraft:block/cube_all",
            "textures": {
                "all": f"{NAMESPACE}:block/{name}"
            }
        }

        item_model = {
            "parent": f"{NAMESPACE}:block/{name}"
        }

        write_json(BLOCKSTATES / f"{name}.json", blockstate)
        write_json(BLOCK_MODELS / f"{name}.json", block_model)
        write_json(ITEM_MODELS / f"{name}.json", item_model)

    # generate chiseled cube_column assets
    for name in chiseled_blocks:
        blockstate = {
            "variants": {
                "": {"model": f"{NAMESPACE}:block/{name}"}
            }
        }

        block_model = {
            "parent": "minecraft:block/cube_column",
            "textures": {
                "end": f"{NAMESPACE}:block/{name}_top",
                "side": f"{NAMESPACE}:block/{name}_side"
            }
        }

        item_model = {
            "parent": f"{NAMESPACE}:block/{name}"
        }

        write_json(BLOCKSTATES / f"{name}.json", blockstate)
        write_json(BLOCK_MODELS / f"{name}.json", block_model)
        write_json(ITEM_MODELS / f"{name}.json", item_model)

    return normal_blocks, chiseled_blocks


if __name__ == "__main__":
    created_mossy = generate_mossy_textures()
    normal_blocks, chiseled_blocks = generate_jsons()

    print("Done.")
    print(f"Generated mossy textures: {len(created_mossy)}")
    print(f"Generated normal block jsons: {len(normal_blocks)}")
    print(f"Generated chiseled block jsons: {len(chiseled_blocks)}")
