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

## Grade map filtering example

After compiling, run `java -cp out HashMap.HashMap01`. It filters seven fixed name/grade entries with the strict condition `grade > 60`, without terminal input.

| Printed entry | Grade |
| --- | --- |
| `Omar=87` | 87 |
| `Osama=90` | 90 |
| `Wali=67` | 67 |

The three entry lines can appear in a different order because they come from a `HashMap`. A final summary line reports a count of `3`. `Khali=60` is excluded because the condition is strictly greater than 60. Filtering only prints matching entries and counts them; it does not remove entries from the map.

## Name length filtering example

After compiling, run `java -cp out ArrayList.ArrayList01`. It checks five fixed names with `name.length() > 4` and prints:

```text
Mohammed
Khalid
```

The strict comparison excludes `Omar`, which has exactly four characters, along with the shorter names `Lea` and `mia`. Matching names retain their insertion order. The loop only prints them; it does not remove the other entries or read terminal input.

## List sum and average example

After compiling, run `java -cp out ArrayList.ArrayList02`. It processes the fixed list `[12, 95, 123]` and takes no terminal input.

| Calculation | Result |
| --- | --- |
| Sum: `12 + 95 + 123` | `230.0` |
| Average: `230.0 / 3` | Approximately `76.6667` |

The active enhanced-for loop accumulates into a `double`, so the average uses floating-point division even though the list holds integers. The program prints the sum and average on separate labeled lines without rounding. The alternative indexed loop is commented out and produces no additional output.

## List deduplication example

After compiling, run `java -cp out ArrayList.ArrayList03`. It reads no terminal input and processes the fixed list `[1, 1, 2, 2, 3, 3, 4, 9]`.

The output is `[1, 2, 3, 4, 9]`. Each value is added to a separate result list only when `contains` reports that it is not already present. This preserves the order of first occurrence; it does not sort the values or modify the original list.

## Text decorator example

After compiling, run `java -cp out Decorator.Main`. It formats the fixed string `"hello"` through progressively wrapped `TextFormatter` objects and prints:

```text
hello
HELLO
HELLO!!!
```

`PlainText` returns the original text. `UpperCaseDecorator` formats through its inner object before converting the result to uppercase. Finally, `ExclamationDecorator` wraps that uppercase formatter and appends three exclamation marks. Each printed line comes from a new call with `"hello"`; the wrappers compose the formatting behavior. No terminal input is required.

## Bank account balance example

After compiling, run `java -cp out bankAccount.Main` (the package name is case-sensitive). It uses fixed demo values without terminal input:

| Step | Balance |
| --- | --- |
| Construct the account | `987.0` |
| Withdraw `600.0` | `387.0` |
| Deposit `200.0` | `587.0` |

The program then prints account details and a final line containing the balance and `toString()` representation. The `IBAN` label displays the integer demo account number, not a validated IBAN.

Deposits of zero or less are rejected. Withdrawals are checked only against the available balance; no positive-amount check is implemented, so negative withdrawal values would increase the balance. This is an in-memory exercise with no persistence.

## Circle object example

After compiling, run `java -cp out oop2.Main`. It creates two independent `Circle` objects without terminal input:

| Object | Radius | Color | Calculation printed |
| --- | --- | --- | --- |
| `c1` | `3.0` | `Black` | Area: `Math.PI * 3 * 3`, approximately `28.2743`. |
| `c2` | `2.0` | `Blue` | Circumference: `Math.PI * 2 * 2`, approximately `12.5664`. |

Each line includes the object's `toString()` representation followed by its calculation. The implementation uses `Math.PI`, not the rounded constant `3.14`, and prints unrounded results. `setRadius` directly assigns its argument without rejecting negative values.

## Car setter example

After compiling, run `java -cp out oop1.Main`. It assigns the name `KIA` and model `2014`, then prints a model warning followed by `KIA 2014`, without terminal input.

`setModel(m)` stores `m` before checking whether it is greater than `2014`. Values of `2014` or less therefore trigger `We do not accept this model!` but remain stored and are returned by `getModel()`. The warning does not reject or undo the assignment.

## Animal method dispatch example

After compiling, run `java -cp out oop_animal.Main`. The active code creates a `Dogs` object named `Dog` through an `Animal` reference and calls `printInfo()`, without terminal input.

`Animal.printInfo()` first prints `Name: Dog`, then calls `move()` and `makeSound()` in that order. Those calls dispatch to the `Dogs` overrides. In the existing source, the sound-like message is inside `move()` and the movement-like message is inside `makeSound()`, so interpret the output using the actual method bodies. The bird and cat examples in `Main` are commented out and produce no output.

## Undergraduate student inheritance example

After compiling, run `java -cp out oop_student.Main`. It constructs an `UndergradStudent` with the fixed name `Omar`, age `25`, and the existing Arabic major string. It requires no terminal input and prints two lines: the name and age, followed by the major.

Although `s1` is declared as `Student`, `s1.printInfo()` dispatches to the `UndergradStudent` override. That override calls `super.printInfo()` to print the inherited fields before printing its own `major` field. Its constructor similarly calls `super(name, age)` before storing the major; the no-argument `Student` constructor is not used in this run.

## Sports car speed limit example

After compiling, run `java -cp out oop_car.Main`. It creates a `SportsCar` with brand `BMW` and initial speed `201.0`, held through a `Car` reference, then calls `accelerate(100)` without terminal input.

The overridden method checks whether `speed + increase` is greater than `300`. Here the proposed speed is `301.0`, so it prints the existing limit warning and leaves the speed at `201.0`; it does not clamp the speed to `300`. An increase that reaches exactly `300` is accepted and delegated to `Car.accelerate()`, which updates and prints the speed.

## Library list example

After compiling, run `java -cp out oop_Library.Main` (the package name includes an uppercase `L`). It creates an empty library, adds `Book("Java", "Omar", 2010)`, and displays all books without terminal input. The console first reports that `Java` was added, then displays its title, author, and publication year.

The library stores books in an in-memory `ArrayList` and displays them in insertion order. `search(title)` and `removeBook(title)` use exact, case-sensitive title comparisons and stop at the first match. A failed search prints `Sorry we do not have this Book!`; a failed removal has no output. The demo does not call either operation, and adding a book does not check for duplicate titles.

## Decimal regex matching example

After compiling, run `java -cp out general.Example01`. It applies `[-+]?[0-9]+,[0-9]+` to the fixed string `+10,5`, without terminal input. Expected output:

```text
Result von matchCheck ist: true
Result von findCheck ist: true
+10,5
+10,5
```

The pattern requires digits on both sides of a comma and allows one optional leading sign. `matches()` checks the entire input, while `find()` searches for a matching subsequence. The example uses separate `Matcher` objects for those operations, then reads each successful match with `group()`. It validates text rather than converting it to a numeric value.

## Three-account transaction example

After compiling, run `java -cp out oop_bank.Main`. This is a separate example from `bankAccount.Main`. It initializes three independent accounts, performs fixed transactions, and prints their details without terminal input:

| Name | Initial amount | Deposit | Requested withdrawal | Final amount |
| --- | --- | --- | --- | --- |
| Mohammed | 10000 | 12000 | 2000 | 20000 |
| Belal | 100 | 50 | 160 | 150 |
| Ahmed | 500 | 550 | 10 | 1040 |

Belal's withdrawal is rejected because the available amount is only `150`; the warning leaves that balance unchanged. `depoist` is the existing spelling of the deposit method. Amounts use `float`, and neither deposit nor withdrawal validates that the requested amount is positive. Account numbers are fields on separate objects with no uniqueness check, so Mohammed and Ahmed can share the demo number `4451238`.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/beispiele`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
