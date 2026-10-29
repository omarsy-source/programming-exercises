# Matrix Generation

[Collection](../../../README.md) / [Java index](../../README.md) / [arrays](../README.md) · [Compiler source list](sources.txt)

Creates and displays a square matrix.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Exercise10.java](src/exercise/Exercise10.java) | `exercise.Exercise10` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out exercise.Exercise10
```

## Input and existing behavior

Enter an integer at the console prompt. For a positive even size, the matrix is filled row by row with even numbers, starting at the supplied size.

| Input | Matrix printed |
| --- | --- |
| `2` | `[[2, 4], [6, 8]]` |
| `1` | `[[0]]` |
| `0` | `[]` |

Positive odd sizes leave every element at its initial value of zero. A negative size causes array allocation to fail before the filling condition is checked. Nonnumeric input is not handled.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/AufgabeBaltt10`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
