# Calculator And Patterns

[Collection](../../../README.md) / [Java index](../../README.md) / [loops](../README.md) · [Compiler source list](sources.txt)

A repeated console calculator and nested-loop patterns.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Exercise02.java](src/worksheet06/Exercise02.java) | `worksheet06.Exercise02` |
| [Exercise03.java](src/worksheet06/Exercise03.java) | `worksheet06.Exercise03` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out worksheet06.Exercise02
```

## Calculator input

`worksheet06.Exercise02` reads an operator first (`+`, `-`, `*`, `/`, or `%`), followed by two integers. For example, enter `/`, then `7`, then `2` to obtain `n1 / n2 = 3.5`. Division casts the first operand to `float`; `%` uses integer remainder.

After each calculation, enter exactly `yes` to repeat. Any other response ends the program. An unknown operator still consumes both numbers but prints no calculation result because the switch has no default branch. Malformed integer input is not handled.

## Star pattern

The second program runs without input:

```bash
java -cp out worksheet06.Exercise03
```

Its fixed value `n = 4` produces:

```text
*
**
***
****
```

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/AufgabeBlatte06`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
