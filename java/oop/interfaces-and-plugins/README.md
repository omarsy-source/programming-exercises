# Interfaces And Plugins

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

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/Woche04`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
