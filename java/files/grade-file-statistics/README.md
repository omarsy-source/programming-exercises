# Grade File Statistics

[Collection](../../../README.md) / [Java index](../../README.md) / [files](../README.md) · [Compiler source list](sources.txt)

Reads grade data from an external text file.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Exercise01.java](src/exercises/Exercise01.java) | `exercises.Exercise01` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out exercises.Exercise01
```

Run from this folder so the supplied `NotenListe.txt` can be found. The sample uses decimal commas, so its interpretation depends on the Scanner locale.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/AufgabeBlatt11`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
