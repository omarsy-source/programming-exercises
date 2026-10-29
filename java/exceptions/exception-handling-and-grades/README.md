# Exception Handling And Grades

[Collection](../../../README.md) / [Java index](../../README.md) / [exceptions](../README.md) · [Compiler source list](sources.txt)

Exception handling and student grade calculation.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [BasicExceptionHandling.java](src/Exercise01/BasicExceptionHandling.java) | `Exercise01.BasicExceptionHandling` |
| [InvalidInputException.java](src/Exercise02/InvalidInputException.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Exercise02/Main.java) | `Exercise02.Main` |
| [Main.java](src/Exercise03/Main.java) | `Exercise03.Main` |
| [StudentGradeCalculator.java](src/Exercise03/StudentGradeCalculator.java) | Supporting class, interface, test, or module descriptor |
| [module-info.java](src/module-info.java) | Supporting class, interface, test, or module descriptor |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Exercise01.BasicExceptionHandling
```

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/Woche03`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
