from pathlib import Path
import json

ROOT = Path("src/main/resources/assets/stonepack")
TEXTURES = ROOT / "textures" / "block"
BLOCKSTATES = ROOT / "blockstates"
BLOCK_MODELS = ROOT / "models" / "block"
ITEM_MODELS = ROOT / "models" / "item"

BLOCKSTATES.mkdir(parents=True, exist_ok=True)
BLOCK_MODELS.mkdir(parents=True, exist_ok=True)
ITEM_MODELS.mkdir(parents=True, exist_ok=True)


def write_json(path: Path, data: dict):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(data, indent=2) + "\n", encoding="utf-8")


# raccoglie texture "base"
pngs = {p.stem for p in TEXTURES.glob("*.png")}

# blocchi normali: ogni png singolo diventa cube_all
# escludiamo i chiseled top/side, che trattiamo dopo
normal_blocks = sorted(
    name for name in pngs
    if not name.endswith("_top") and not name.endswith("_side")
)

# genera modelli normali
for name in normal_blocks:
    blockstate = {
        "variants": {
            "": {"model": f"stonepack:block/{name}"}
        }
    }

    block_model = {
        "parent": "minecraft:block/cube_all",
        "textures": {
            "all": f"stonepack:block/{name}"
        }
    }

    item_model = {
        "parent": f"stonepack:block/{name}"
    }

    write_json(BLOCKSTATES / f"{name}.json", blockstate)
    write_json(BLOCK_MODELS / f"{name}.json", block_model)
    write_json(ITEM_MODELS / f"{name}.json", item_model)


# genera i chiseled come cube_column se esistono top+side
chiseled_names = sorted(
    stem[:-4] for stem in pngs
    if stem.endswith("_top") and f"{stem[:-4]}_side" in pngs
)

for base in chiseled_names:
    blockstate = {
        "variants": {
            "": {"model": f"stonepack:block/{base}"}
        }
    }

    block_model = {
        "parent": "minecraft:block/cube_column",
        "textures": {
            "end": f"stonepack:block/{base}_top",
            "side": f"stonepack:block/{base}_side"
        }
    }

    item_model = {
        "parent": f"stonepack:block/{base}"
    }

    write_json(BLOCKSTATES / f"{base}.json", blockstate)
    write_json(BLOCK_MODELS / f"{base}.json", block_model)
    write_json(ITEM_MODELS / f"{base}.json", item_model)

print("Done.")
print(f"Normal blocks: {len(normal_blocks)}")
print(f"Chiseled blocks: {len(chiseled_names)}")
