# Number Sequence

[Collection](../../../README.md) / [Java index](../../README.md) / [loops](../README.md) · [Compiler source list](sources.txt)

Prints the integers from 1 to the supplied upper limit.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [NumberSequence.java](src/gitHub/NumberSequence.java) | `gitHub.NumberSequence` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out gitHub.NumberSequence
```

## Input and output

Enter a whole number when prompted with `Geben Sie eine Zahl ein:`.

| Input | Numbers printed after the prompt |
| --- | --- |
| `5` | `1 2 3 4 5` |
| `1` | `1` |
| `0` or a negative integer | No numbers |

The program prints each number followed by a space. It does not calculate a sum. Nonnumeric input is not handled by the program and causes `Scanner.nextInt()` to throw an input-mismatch exception.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/gitHub2`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
