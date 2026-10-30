# State And Decorators

[Collection](../../../README.md) / [Java index](../../README.md) / [oop](../README.md) · [Compiler source list](sources.txt)

Shared state, logging, character buffs, and item decorators.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [BasicItem.java](src/Challenge/BasicItem.java) | Supporting class, interface, test, or module descriptor |
| [CursedItem.java](src/Challenge/CursedItem.java) | Supporting class, interface, test, or module descriptor |
| [EnchantedItem.java](src/Challenge/EnchantedItem.java) | Supporting class, interface, test, or module descriptor |
| [GameManager.java](src/Challenge/GameManager.java) | Supporting class, interface, test, or module descriptor |
| [GameStats.java](src/Challenge/GameStats.java) | Supporting class, interface, test, or module descriptor |
| [Item.java](src/Challenge/Item.java) | Supporting class, interface, test, or module descriptor |
| [LegendaryItem.java](src/Challenge/LegendaryItem.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Challenge/Main.java) | `Challenge.Main` |
| [GameStatistics.java](src/Exercise01/GameStatistics.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Exercise01/Main.java) | `Exercise01.Main` |
| [Player.java](src/Exercise01/Player.java) | Supporting class, interface, test, or module descriptor |
| [Logger.java](src/Exercise02/Logger.java) | Supporting class, interface, test, or module descriptor |
| [LoggerSystemMain.java](src/Exercise02/LoggerSystemMain.java) | `Exercise02.LoggerSystemMain` |
| [ArmorBuff.java](src/Exercise03/ArmorBuff.java) | Supporting class, interface, test, or module descriptor |
| [BaseCharacter.java](src/Exercise03/BaseCharacter.java) | Supporting class, interface, test, or module descriptor |
| [Character.java](src/Exercise03/Character.java) | Supporting class, interface, test, or module descriptor |
| [Main.java](src/Exercise03/Main.java) | `Exercise03.Main` |
| [SpeedBuff.java](src/Exercise03/SpeedBuff.java) | Supporting class, interface, test, or module descriptor |
| [StrengthBuff.java](src/Exercise03/StrengthBuff.java) | Supporting class, interface, test, or module descriptor |
| [module-info.java](src/module-info.java) | Supporting class, interface, test, or module descriptor |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Challenge.Main
```

## Shared statistics example

After compiling, run `java -cp out Exercise01.Main`. The program uses fixed values and takes no terminal input.

It constructs four players, so the static `GameStatistics.playerCount` becomes `4`. All four calls to `attack` are made on `player1`, with damage values `15`, `5`, `30`, and `20`; together they increase the shared `totalDamage` to `70`.

Expected output from a fresh process:

```text
---SpielInfos---
Anzahl der Spieler ist 4
Der gesamte Schaden aller Spieler 70
```

These counters belong to the class rather than individual players. `attack` returns the updated cumulative damage, not just that attack's damage; the main method ignores that return value. The statistics are held in memory and start again in a new Java process.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/Woche06`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
