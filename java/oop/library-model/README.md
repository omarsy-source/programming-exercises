# Library Model

Books, a library model, and an application entry point.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Main.java](src/app/Main.java) | `app.Main` |
| [Book.java](src/model/Book.java) | Supporting class, interface, test, or module descriptor |
| [Library.java](src/model/Library.java) | Supporting class, interface, test, or module descriptor |
| [module-info.java](src/module-info.java) | Supporting class, interface, test, or module descriptor |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out app.Main
```

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/Woche01`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
