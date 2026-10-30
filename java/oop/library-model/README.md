# Library Model

[Collection](../../../README.md) / [Java index](../../README.md) / [oop](../README.md) · [Compiler source list](sources.txt)

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

## Model and demo behavior

`Book` stores a title, author, and read flag. `Library` holds an in-memory `ArrayList<Book>`; `addBook` appends a book, `removeBook` removes the first exact title match, and `listBooks` prints each book using its `toString()` representation.

Running `app.Main` requests no input. It creates two sample books, changes the first book's author, marks that book as read, and adds only the second book to the library. The data is not saved to a file.

Two existing details are worth checking when reading the output: `Book.setRead()` assigns the read flag to itself and has no effect, while `markAsRead()` sets it to true. Also, the second read-status message displays the first book's title but checks the second book's read flag. These behaviors are documented without altering the example.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/Woche01`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
