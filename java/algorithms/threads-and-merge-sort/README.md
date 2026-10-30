# Threads And Merge Sort

[Collection](../../../README.md) / [Java index](../../README.md) / [algorithms](../README.md) · [Compiler source list](sources.txt)

Threads, a countdown, and merge sort.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Bell.java](src/Exercise01/Bell.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Exercise01/Main.java) | `Exercise01.Main` |
| [Countdown.java](src/Exercise02/Countdown.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Exercise02/Main.java) | `Exercise02.Main` |
| [Main.java](src/Exercise03/Main.java) | `Exercise03.Main` |
| [MergeSort.java](src/Exercise03/MergeSort.java) | Supporting class, interface, test, or module descriptor |
| [module-info.java](src/module-info.java) | Supporting class, interface, test, or module descriptor |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Exercise01.Main
```

## Choosing an example

After compiling, choose one of these entry points. All three use fixed values and require no terminal input.

| Command | Behavior |
| --- | --- |
| `java -cp out Exercise01.Main` | Starts two threads: `Ding` prints 5 times with a 500 ms pause after each print; `Dong` prints 900 times with a 3000 ms pause after each print. |
| `java -cp out Exercise02.Main` | Prints the countdown from `10` through `0`, then `Liftoff!`, with a one-second pause after each number. |
| `java -cp out Exercise03.Main` | Sorts the built-in array and prints `[14, 14, 24, 36, 48, 54, 75, 97]`. This example does not start additional threads. |

The bell messages can interleave in different orders. The `Dong` thread keeps the program running for approximately 45 minutes; use `Ctrl+C` in the terminal to stop the demonstration early.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/Woche07`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
