# Arithmetic And Arrays

[Collection](../../../README.md) / [Java index](../../README.md) / [basics](../README.md) · [Compiler source list](sources.txt)

Arithmetic, even/odd checks, averages, and multiplication.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Exercise01.java](src/Exercise01/Exercise01.java) | `Exercise01.Exercise01` |
| [Exercise03.java](src/Exercise01/Exercise03.java) | `Exercise01.Exercise03` |
| [Exercise04.java](src/Exercise01/Exercise04.java) | `Exercise01.Exercise04` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Exercise01.Exercise01
```

## Built-in examples

These programs use fixed values and do not request console input. After compiling, choose one of the following commands:

| Command | Calculation | Output |
| --- | --- | --- |
| `java -cp out Exercise01.Exercise01` | Adds `14` and `3`, then checks whether the sum is even or odd. | `Die summe ist eine ungerade Zahle und beträgt 17` |
| `java -cp out Exercise01.Exercise03` | Averages the five values `3, 5, 9, 18, 29`. | `Der Durchschnitt beträgt = 12.8` |
| `java -cp out Exercise01.Exercise04` | Calls `multiply(4, 5)`. | `20` |

The average uses floating-point division because the sum is cast to `double` before dividing by the array length.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/aufgabe01`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
