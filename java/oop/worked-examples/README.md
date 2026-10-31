# Worked Examples

[Collection](../../../README.md) / [Java index](../../README.md) / [oop](../README.md) · [Compiler source list](sources.txt)

OOP, interfaces, collections, generics, decorators, and singleton examples.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [ArrayList01.java](src/ArrayList/ArrayList01.java) | `ArrayList.ArrayList01` |
| [ArrayList02.java](src/ArrayList/ArrayList02.java) | `ArrayList.ArrayList02` |
| [ArrayList03.java](src/ArrayList/ArrayList03.java) | `ArrayList.ArrayList03` |
| [ExclamationDecorator.java](src/Decorator/ExclamationDecorator.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Decorator/Main.java) | `Decorator.Main` |
| [PlainText.java](src/Decorator/PlainText.java) | Supporting class, interface, test, or module descriptor |
| [TextFormatter.java](src/Decorator/TextFormatter.java) | Supporting class, interface, test, or module descriptor |
| [UpperCaseDecorator.java](src/Decorator/UpperCaseDecorator.java) | Supporting class, interface, test, or module descriptor |
| [Generic.java](src/Generic/Generic.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Generic/Main.java) | `Generic.Main` |
| [HashMap01.java](src/HashMap/HashMap01.java) | `HashMap.HashMap01` |
| [AppConfig.java](src/Singleton01/AppConfig.java) | Supporting class, interface, test, or module descriptor |
| [AppConfigMain.java](src/Singleton01/AppConfigMain.java) | `Singleton01.AppConfigMain` |
| [Logger.java](src/Singleton01/Logger.java) | Supporting class, interface, test, or module descriptor |
| [LoggerMain.java](src/Singleton01/LoggerMain.java) | `Singleton01.LoggerMain` |
| [BankAccount.java](src/bankAccount/BankAccount.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/bankAccount/Main.java) | `bankAccount.Main` |
| [Circle.java](src/general/Circle.java) | Supporting class, interface, test, or module descriptor |
| [Example01.java](src/general/Example01.java) | `general.Example01` |
| [Main.java](src/general/Main.java) | `general.Main` |
| [Person.java](src/general/Person.java) | Supporting class, interface, test, or module descriptor |
| [Printable.java](src/general/Printable.java) | Supporting class, interface, test, or module descriptor |
| [Rectangle.java](src/general/Rectangle.java) | Supporting class, interface, test, or module descriptor |
| [Shape.java](src/general/Shape.java) | Supporting class, interface, test, or module descriptor |
| [Student.java](src/general/Student.java) | Supporting class, interface, test, or module descriptor |
| [Teacher.java](src/general/Teacher.java) | Supporting class, interface, test, or module descriptor |
| [module-info.java](src/module-info.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/oop/Main.java) | `oop.Main` |
| [Student.java](src/oop/Student.java) | Supporting class, interface, test, or module descriptor |
| [Car.java](src/oop1/Car.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/oop1/Main.java) | `oop1.Main` |
| [Circle.java](src/oop2/Circle.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/oop2/Main.java) | `oop2.Main` |
| [Book.java](src/oop_Library/Book.java) | Supporting class, interface, test, or module descriptor |
| [Library.java](src/oop_Library/Library.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/oop_Library/Main.java) | `oop_Library.Main` |
| [Animal.java](src/oop_animal/Animal.java) | Supporting class, interface, test, or module descriptor |
| [Birds.java](src/oop_animal/Birds.java) | Supporting class, interface, test, or module descriptor |
| [Cats.java](src/oop_animal/Cats.java) | Supporting class, interface, test, or module descriptor |
| [Dogs.java](src/oop_animal/Dogs.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/oop_animal/Main.java) | `oop_animal.Main` |
| [Account.java](src/oop_bank/Account.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/oop_bank/Main.java) | `oop_bank.Main` |
| [Car.java](src/oop_car/Car.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/oop_car/Main.java) | `oop_car.Main` |
| [SportsCar.java](src/oop_car/SportsCar.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/oop_student/Main.java) | `oop_student.Main` |
| [Student.java](src/oop_student/Student.java) | Supporting class, interface, test, or module descriptor |
| [UndergradStudent.java](src/oop_student/UndergradStudent.java) | Supporting class, interface, test, or module descriptor |
| [Example01.java](src/review/Example01.java) | `review.Example01` |
| [Counter.java](src/staticexamples/Counter.java) | Supporting class, interface, test, or module descriptor |
| [CounterMain.java](src/staticexamples/CounterMain.java) | `staticexamples.CounterMain` |
| [MathUtils.java](src/staticexamples/MathUtils.java) | Supporting class, interface, test, or module descriptor |
| [MathUtilsMain.java](src/staticexamples/MathUtilsMain.java) | `staticexamples.MathUtilsMain` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out ArrayList.ArrayList01
```

## Singleton examples

After compiling, run either example from this project folder. Both use fixed values and require no terminal input.

| Command | Expected output |
| --- | --- |
| `java -cp out Singleton01.AppConfigMain` | `MyApp` |
| `java -cp out Singleton01.LoggerMain` | Three lines: `[1] Hallo`, `[2] Moin`, `[3] Wallah` |

Both classes have private constructors and lazily create a shared instance when their accessor is first called. The logger accessor is spelled `getInstace()` in the existing source; the configuration accessor is `getInstance()`.

The logger prints to the console and does not write a log file. Its counter belongs to the shared logger object and resets in a new Java process. These examples use no synchronization, so their lazy initialization is intended for the demonstrated single-threaded calls.

## Static counter example

After compiling, run `java -cp out staticexamples.CounterMain`. It creates two `Counter` objects and prints `2` in a fresh Java process, without reading terminal input.

The constructor increments the same static `count` field for every new object. `Counter.getCount()` reads that shared value; it does not increment it. This example counts constructor calls, rather than tracking how many objects are still reachable. The value is held in memory and starts at zero in a new Java process.

## Static math utility example

After compiling, run `java -cp out staticexamples.MathUtilsMain`. It uses fixed values and requires no terminal input:

| Step | Call | Result |
| --- | --- | --- |
| Add | `MathUtils.add(5, 10)` | `15` |
| Multiply the sum by itself | `MathUtils.multiply(15, 15)` | `225` |
| Check evenness | `MathUtils.isEven(225)` | `false` |

The main method prints these results on one line. Its final label says `Ist die Zahl positive`, but the invoked method checks whether the value is even, not whether it is positive. Thus, `false` describes the odd value `225`; it does not mean that value is negative.

## Generic values and maximum example

After compiling, run `java -cp out Generic.Main`. It displays the two values in a `Generic<Integer, Double>` object, then finds the maximum of `[3, 2, 5, 9, 78]`, without terminal input.

Expected output:

```text
10
14.3
78
```

`findMax(Comparable[])` compares each element with the current maximum using `compareTo`. It returns the maximum element without sorting or modifying the array. The method initializes the maximum from index zero, so it requires a non-empty array; its raw `Comparable` parameter also assumes the elements can be compared with one another.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/beispiele`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
