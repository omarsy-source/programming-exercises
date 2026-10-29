# Digits And Letter Replacement

[Collection](../../../README.md) / [Java index](../../README.md) / [strings](../README.md) · [Compiler source list](sources.txt)

Number-to-word conversion and case-insensitive letter replacement.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Exercise02.java](src/Exercise07/Exercise02.java) | `Exercise07.Exercise02` |
| [Exercise03.java](src/Exercise07/Exercise03.java) | `Exercise07.Exercise03` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Exercise07.Exercise02
```

## Letter-replacement example

The compile command above builds both exercises. To run the letter-replacement program instead of the number-to-word program, use:

```bash
java -cp out Exercise07.Exercise03
```

Enter a sentence first, then the letter to replace. For the sentence `Anna` and letter `a`, the program counts two matches and produces `XnnX`. Matching ignores letter case, and every replacement uses an uppercase `X`.

Only the first character of the second input token is used as the target letter.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/AufgabenBaltt07`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
