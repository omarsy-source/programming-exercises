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

## Sample file and output

The supplied [NotenListe.txt](NotenListe.txt) contains six records. Each record has a student number followed by a grade, separated by whitespace, for example:

```text
500123   2,0
```

When the decimal commas are read using a compatible locale, the six sample grades have a mean of approximately `1.7833`. The program prints the record count twice before the mean because both `main` and `createList` call `getQuantity`, and that method prints its result.

Keep one pair of numeric values per line without blank lines: the program counts file lines to size the array, then reads two numbers per record. A missing file prints `404`; malformed numeric data is not caught by the existing error handler.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/AufgabeBlatt11`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
