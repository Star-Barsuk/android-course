# Project Agent Rules

Local rules for this Android course monorepo. They extend the global rules in
`~/.config/opencode/AGENTS.md`; on conflicts, this file wins.

## Repository layout

- `counter/` — minimal counter app (learning exercise).
- `tip-calculator/` — tip calculator app.

Each subfolder is an independent Gradle/Android project. There is no root
Gradle build; run Gradle from inside a project folder.

## Language policy (D1)

- All user-facing UI text in this folder is written in **Russian**.
- This is the only exception to the global "everything in English" rule: it
  applies to product copy only.
- Keep code, identifiers, comments, commit messages, and documentation in
  English.
- Russian UI strings are product content, not documentation, and are allowed.

## Sync copies

- `tip-calculator/materials/` mirrors source assets (layout, drawable, values,
  code) as reference material.
- When a mirrored source file changes, update the matching file under
  `materials/` too, and keep both copies consistent.
- `counter/` has no `materials/` folder.
