# Bubble Sort

[Collection](../../../README.md) / [Java index](../../README.md) / [algorithms](../README.md) · [Compiler source list](sources.txt)

Bubble sort and related practice code.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [BubbleSort.java](src/exercises01/BubbleSort.java) | `exercises01.BubbleSort` |
| [Practice.java](src/exercises01/Practice.java) | `exercises01.Practice` |
| [module-info.java](src/module-info.java) | Supporting class, interface, test, or module descriptor |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out exercises01.BubbleSort
```

## Current implementation

`BubbleSort.bubbleSort(int[] array)` is an empty method. Its `main` method creates ten random integers from 1 through 100 but does not call the sorting method or print the array. Running `exercises01.BubbleSort` therefore produces no console output; successful compilation does not mean the sorting algorithm is implemented.

The separate practice program can be run with:

```bash
java -cp out exercises01.Practice
```

It prints `5` for its built-in array. Its `countHighAlerts` method currently overwrites the supplied threshold with `5`, starts checking at index `1`, and counts values greater than or equal to that threshold. These existing limitations are retained.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/aufgaben`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
