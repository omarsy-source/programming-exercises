# Geometry Dash

Java Swing scrolling game with collisions and events.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Launcher.java](src/com/thehxlab/geometrydash/Launcher.java) | `com.thehxlab.geometrydash.Launcher` |
| [CollisionEngine.java](src/com/thehxlab/geometrydash/engine/CollisionEngine.java) | Supporting class, interface, test, or module descriptor |
| [GameLoop.java](src/com/thehxlab/geometrydash/engine/GameLoop.java) | Supporting class, interface, test, or module descriptor |
| [EffectorTriggeredEvent.java](src/com/thehxlab/geometrydash/events/EffectorTriggeredEvent.java) | Supporting class, interface, test, or module descriptor |
| [EventBus.java](src/com/thehxlab/geometrydash/events/EventBus.java) | Supporting class, interface, test, or module descriptor |
| [GameEvent.java](src/com/thehxlab/geometrydash/events/GameEvent.java) | Supporting class, interface, test, or module descriptor |
| [LevelCompleteEvent.java](src/com/thehxlab/geometrydash/events/LevelCompleteEvent.java) | Supporting class, interface, test, or module descriptor |
| [PlayerDiedEvent.java](src/com/thehxlab/geometrydash/events/PlayerDiedEvent.java) | Supporting class, interface, test, or module descriptor |
| [Animation.java](src/com/thehxlab/geometrydash/gfx/Animation.java) | Supporting class, interface, test, or module descriptor |
| [BackgroundLayer.java](src/com/thehxlab/geometrydash/gfx/BackgroundLayer.java) | Supporting class, interface, test, or module descriptor |
| [Sprite.java](src/com/thehxlab/geometrydash/gfx/Sprite.java) | Supporting class, interface, test, or module descriptor |
| [Collidable.java](src/com/thehxlab/geometrydash/model/Collidable.java) | Supporting class, interface, test, or module descriptor |
| [GameLevel.java](src/com/thehxlab/geometrydash/model/GameLevel.java) | Supporting class, interface, test, or module descriptor |
| [GameObject.java](src/com/thehxlab/geometrydash/model/GameObject.java) | Supporting class, interface, test, or module descriptor |
| [Level.java](src/com/thehxlab/geometrydash/model/Level.java) | Supporting class, interface, test, or module descriptor |
| [Platform.java](src/com/thehxlab/geometrydash/model/Platform.java) | Supporting class, interface, test, or module descriptor |
| [Player.java](src/com/thehxlab/geometrydash/model/Player.java) | Supporting class, interface, test, or module descriptor |
| [PlayerEffector.java](src/com/thehxlab/geometrydash/model/PlayerEffector.java) | Supporting class, interface, test, or module descriptor |
| [PlayerState.java](src/com/thehxlab/geometrydash/model/PlayerState.java) | Supporting class, interface, test, or module descriptor |
| [Spike.java](src/com/thehxlab/geometrydash/model/Spike.java) | Supporting class, interface, test, or module descriptor |
| [Updatable.java](src/com/thehxlab/geometrydash/model/Updatable.java) | Supporting class, interface, test, or module descriptor |
| [GamePanel.java](src/com/thehxlab/geometrydash/ui/GamePanel.java) | Supporting class, interface, test, or module descriptor |
| [SettingsDialog.java](src/com/thehxlab/geometrydash/ui/SettingsDialog.java) | Supporting class, interface, test, or module descriptor |
| [StartPanel.java](src/com/thehxlab/geometrydash/ui/StartPanel.java) | Supporting class, interface, test, or module descriptor |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out com.thehxlab.geometrydash.Launcher
```

This Swing example requires a graphical desktop. Interactive gameplay was not exercised during this import. Existing scaffold comments and the package attribution are retained.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/GeometryDash-Synced`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
