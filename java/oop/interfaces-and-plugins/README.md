# Interfaces And Plugins

[Collection](../../../README.md) / [Java index](../../README.md) / [oop](../README.md) · [Compiler source list](sources.txt)

Form elements, storage interfaces, vehicles, and plugins.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Button.java](src/Exercise01/Button.java) | Supporting class, interface, test, or module descriptor |
| [FormElement.java](src/Exercise01/FormElement.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Exercise01/Main.java) | `Exercise01.Main` |
| [TextField.java](src/Exercise01/TextField.java) | Supporting class, interface, test, or module descriptor |
| [FileStorage.java](src/Exercise02/FileStorage.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Exercise02/Main.java) | `Exercise02.Main` |
| [MemoryStorage.java](src/Exercise02/MemoryStorage.java) | Supporting class, interface, test, or module descriptor |
| [Storage.java](src/Exercise02/Storage.java) | Supporting class, interface, test, or module descriptor |
| [Bicycle.java](src/Exercise03/Bicycle.java) | Supporting class, interface, test, or module descriptor |
| [Car.java](src/Exercise03/Car.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Exercise03/Main.java) | `Exercise03.Main` |
| [Refuelabe.java](src/Exercise03/Refuelabe.java) | Supporting class, interface, test, or module descriptor |
| [Vehicle.java](src/Exercise03/Vehicle.java) | Supporting class, interface, test, or module descriptor |
| [BackupPlugin.java](src/Exercise04/BackupPlugin.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Exercise04/Main.java) | `Exercise04.Main` |
| [Plugin.java](src/Exercise04/Plugin.java) | Supporting class, interface, test, or module descriptor |
| [UpdatePlugin.java](src/Exercise04/UpdatePlugin.java) | Supporting class, interface, test, or module descriptor |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Exercise01.Main
```

## Storage interface example

After compiling, run:

```bash
java -cp out Exercise02.Main
```

The example uses two implementations through the `Storage` interface, which declares `save(String data)` and `load()`. It uses fixed text and takes no terminal input.

| Implementation | Current behavior |
| --- | --- |
| `FileStorage` | `save` prints a message; `load` prints a message and returns `".."`. It does not create or read a file. |
| `MemoryStorage` | `save` retains the text in an instance field and prints a message. `load` returns that text with a loading-message suffix. |

The main method calls both `load()` methods but ignores their returned strings. Therefore, the memory-loading message is not printed. This is an interface demonstration; it does not persist data between program runs.

## Plugin interface example

After compiling, run `java -cp out Exercise04.Main`. The example stores four objects in an `ArrayList<Plugin>` and visits them in insertion order:

| Printed plugin name | Next line from `execute()` |
| --- | --- |
| `DatabaseBackupPlugin` | `Backup` |
| `PhotoBackupPlugin` | `Backup` |
| `SecurityUpdatePlugin` | `Update` |
| `DriverUpdatePlugin` | `Update` |

The loop first prints `getName()`, then calls `execute()`, producing eight lines without terminal input. Both implementations only print their action labels: they do not back up files, install updates, or discover external plugins. The example demonstrates invoking different implementations through the same interface.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/Woche04`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
