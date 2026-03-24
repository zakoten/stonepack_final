from pathlib import Path
import json

RECIPES_DIR = Path("src/main/resources/data/stonepack/recipe")

fixed = 0
skipped = 0
errors = 0

for path in RECIPES_DIR.glob("*.json"):
    try:
        text = path.read_text(encoding="utf-8")
        data = json.loads(text)

        if data.get("type") != "minecraft:stonecutting":
            skipped += 1
            continue

        ingredient = data.get("ingredient")

        if isinstance(ingredient, dict) and "item" in ingredient and isinstance(ingredient["item"], str):
            data["ingredient"] = ingredient["item"]
            path.write_text(json.dumps(data, indent=2, ensure_ascii=False) + "\n", encoding="utf-8")
            fixed += 1
        else:
            skipped += 1

    except Exception as e:
        errors += 1
        print(f"Errore in {path}: {e}")

print(f"Fixed: {fixed}")
print(f"Skipped: {skipped}")
print(f"Errors: {errors}")
