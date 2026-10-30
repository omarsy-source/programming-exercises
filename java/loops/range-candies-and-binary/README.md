# Range Candies And Binary

[Collection](../../../README.md) / [Java index](../../README.md) / [loops](../README.md) · [Compiler source list](sources.txt)

Descending ranges, increasing candy prices, and decimal-to-binary conversion.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Exercise02.java](src/Exercise05/Exercise02.java) | `Exercise05.Exercise02` |
| [Exercise03.java](src/Exercise05/Exercise03.java) | `Exercise05.Exercise03` |
| [Exercise04.java](src/Exercise05/Exercise04.java) | `Exercise05.Exercise04` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Exercise05.Exercise02
```

## Choose an exercise

After compiling, run the corresponding class:

| Command | Input | Expected behavior |
| --- | --- | --- |
| `java -cp out Exercise05.Exercise02` | `2`, then `5` | Prints `5`, `4`, `3`, and `2` on separate lines. Reversing the input order produces the same range. |
| `java -cp out Exercise05.Exercise03` | `100` | Buys four candies for a total of 100 cents and leaves zero cents. |
| `java -cp out Exercise05.Exercise04` | `13` | Prints `Ergebnis: 1101`. |

The candy program treats the budget as cents, starts at 10 cents per candy, increases the price by 10 cents after each purchase, and buys at most ten candies. The binary program prints an empty result after `Ergebnis:` for zero or negative input. Input-format errors are not handled by these examples.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/Pro 1/src/omars/git/repository/AufgabenBlatt05`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
