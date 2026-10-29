# Array Helpers And Tests

Array helper methods and their existing JUnit tests.

The complete group has existing build limitations; see below.

## Source files

| File | Entry point |
| --- | --- |
| [Exercise02.java](src/Exercise12/Exercise02.java) | `Exercise12.Exercise02` |
| [aufgabe02test.java](src/Exercise12/aufgabe02test.java) | Supporting class, interface, test, or module descriptor |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Exercise12.Exercise02
```

## Existing limitations

The existing tests import JUnit 4 and/or JUnit Jupiter. Those libraries are not bundled, so the complete source set was not compiled or run as a test suite. The 1 production source files compile without the tests. Use `@production-sources.txt` instead of `@sources.txt` to compile that subset.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/Aufgabe12`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
