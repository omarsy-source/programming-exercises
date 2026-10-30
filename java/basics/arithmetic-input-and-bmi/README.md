# Arithmetic Input And Bmi

[Collection](../../../README.md) / [Java index](../../README.md) / [basics](../README.md) · [Compiler source list](sources.txt)

Arithmetic expressions, swapping values, addition, and BMI input.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Exercise04.java](src/Exercise04/Exercise04.java) | `Exercise04.Exercise04` |
| [Exercise01.java](src/Package01/Exercise01.java) | `Package01.Exercise01` |
| [Exercise02.java](src/Package02/Exercise02.java) | `Package02.Exercise02` |
| [A7mona.java](src/addition/A7mona.java) | `addition.A7mona` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Exercise04.Exercise04
```

## Choose an entry point

All four programs are independent. After compiling, select the class for the exercise you want:

| Command | Behavior and input |
| --- | --- |
| `java -cp out Package01.Exercise01` | Evaluates `x - (x + 1.0) / (2 * x)` for the built-in value `x = 6`; no input is requested. |
| `java -cp out Package02.Exercise02` | Swaps the built-in strings and prints `x =Tee` and `y =Coffee`; no input is requested. |
| `java -cp out addition.A7mona` | Reads two numbers and prints their sum. Inputs `2` and `3` produce `z = 5.0`. |
| `java -cp out Exercise04.Exercise04` | Reads weight in kilograms, then height in metres, calculates `weight / (height * height)`, and prints a category message. It does not print the numeric BMI. |

The input programs do not validate numeric ranges or handle malformed numeric input. These descriptions document the current exercises rather than changing their calculations.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/AufgabenBaltt3`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
