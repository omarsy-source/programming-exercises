# Number-to-Word Methods and Tests

[Collection](../../../README.md) / [Java index](../../README.md) / [methods](../README.md) · [Compiler source list](sources.txt)

Converts digits and positive integers into German words, with existing JUnit tests. The folder name is retained from the original organization.

The complete group has existing build limitations; see below.

## Source files

| File | Entry point |
| --- | --- |
| [Exercise02.java](src/Exercise12/Exercise02.java) | `Exercise12.Exercise02` |
| [aufgabe02test.java](src/Exercise12/aufgabe02test.java) | Supporting class, interface, test, or module descriptor |

## Compile and run

Open a terminal in this project folder. Compile the production class without the external test dependencies:

```bash
javac -encoding UTF-8 -d out @production-sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Exercise12.Exercise02
```

## Console example

Enter `123` at the number prompt to print `EinsZweiDrei`. Words are concatenated without spaces. Zero and negative input produce an empty string because the conversion loop only runs while the value is positive.

## Existing limitations

The test file imports both JUnit 4 and JUnit Jupiter. These libraries are not bundled, so the complete source set was not compiled or run as a test suite. The command above builds only the single production class; `@sources.txt` also includes the test file and requires those dependencies.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/Aufgabe12`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
