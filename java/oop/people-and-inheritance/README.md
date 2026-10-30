# People And Inheritance

[Collection](../../../README.md) / [Java index](../../README.md) / [oop](../README.md) · [Compiler source list](sources.txt)

Person, Student, and Teacher inheritance exercises.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Main.java](src/Exercise1/Main.java) | `Exercise1.Main` |
| [Person.java](src/Exercise1/Person.java) | Supporting class, interface, test, or module descriptor |
| [Student.java](src/Exercise1/Student.java) | Supporting class, interface, test, or module descriptor |
| [Teacher.java](src/Exercise1/Teacher.java) | Supporting class, interface, test, or module descriptor |
| [module-info.java](src/module-info.java) | Supporting class, interface, test, or module descriptor |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Exercise1.Main
```

## Inheritance and console flow

| Class | Role |
| --- | --- |
| `Person` | Stores a name and age and provides the base `introduce()` method. |
| `Student` | Extends `Person`, stores a student ID, and supplies its own introduction. |
| `Teacher` | Extends `Person`, stores a subject, and overrides the introduction. |

`Exercise1.Main` uses fixed demonstration values and does not request console input. It introduces a person, student, and teacher directly, then puts the student and teacher into an `ArrayList<Person>`.

The loop calls `introduce()` on each list element, selecting the student's or teacher's implementation at runtime. Their introductions therefore appear twice: once from the direct call and once from the loop. The plain `Person` is not added to the list.

An `instanceof Student` check guards the cast used to print the student ID; the teacher does not enter that branch.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/Woche02`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
