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

## Choose a demonstration

| Command | Input and behavior |
| --- | --- |
| `java -cp out Exercise01.BasicExceptionHandling` | Reads two integers and divides them. Inputs `7` and `2` print `3.0`, because integer division occurs before assignment to `double`. Division by zero is caught and printed as an error. |
| `java -cp out Exercise02.Main` | Reads two integers, performs integer division, then checks the result with a custom exception. Results less than or equal to zero are rejected. |
| `java -cp out Exercise03.Main` | Uses fixed student names and grades; no input is requested. It prints averages and selects `Ben` as the student with the highest average in the sample. |

In `Exercise02.Main`, division happens before the `try` block, so a zero divisor throws an uncaught `ArithmeticException`. Its custom-exception message mentions negative input, but the condition also rejects zero. Malformed integer input is not handled by either interactive example.

The grade example treats a higher numeric average as better. `getBestStudent()` prints the best average as a side effect before returning the student's name.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/Woche03`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
