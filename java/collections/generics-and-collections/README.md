# Generics And Collections

[Collection](../../../README.md) / [Java index](../../README.md) / [collections](../README.md) · [Compiler source list](sources.txt)

Generic pairs, collection operations, maps, and drinks.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Main.java](src/Exercise01/Main.java) | `Exercise01.Main` |
| [Pair.java](src/Exercise01/Pair.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Exercise02/Main.java) | `Exercise02.Main` |
| [Beer.java](src/Exercise03/Beer.java) | Supporting class, interface, test, or module descriptor |
| [Drink.java](src/Exercise03/Drink.java) | Supporting class, interface, test, or module descriptor |
| [Juice.java](src/Exercise03/Juice.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Exercise03/Main.java) | `Exercise03.Main` |
| [HashExample.java](src/Exercise04/HashExample.java) | `Exercise04.HashExample` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Exercise01.Main
```

## Properties file example

Run the map-to-file example after compiling:

```bash
java -cp out Exercise04.HashExample
```

This example takes no terminal input. It copies three map entries into `Properties`, writes `config.properties` in the current working directory, then reads the file back and prints the loaded properties.

| Key | Stored value |
| --- | --- |
| `Language` | `de` |
| `Theme` | `dark` |
| `Timeout` | `30` |

Use a working directory where overwriting `config.properties` is acceptable: opening the output stream replaces an existing file. Property display order is not guaranteed. File errors are caught and printed as stack traces.

## Generic pair example

After compiling, run `java -cp out Exercise01.Main`. It constructs two pairs without reading terminal input:

| Declared type | First value | Second value |
| --- | --- | --- |
| `Pair<Integer, Double>` | `3` | `14.5` |
| `Pair<String, Character>` | `"Hallo World"` | `'w'` |

`Pair<T, U>` stores the two values separately. `getFirst()` returns `T` and `getSecond()` returns `U`; the two positions can have different types. The main method prints each pair through its `toString()` method:

```text
Pair [first=3, second=14.5]
Pair [first=Hallo World, second=w]
```

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/Woche05`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
