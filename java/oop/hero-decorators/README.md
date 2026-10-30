# Hero Decorators

[Collection](../../../README.md) / [Java index](../../README.md) / [oop](../README.md) · [Compiler source list](sources.txt)

Stacking equipment decorators around a hero.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [ArmorDecorator.java](src/DecoratorHero/ArmorDecorator.java) | Supporting class, interface, test, or module descriptor |
| [BaseDecorator.java](src/DecoratorHero/BaseDecorator.java) | Supporting class, interface, test, or module descriptor |
| [BaseHero.java](src/DecoratorHero/BaseHero.java) | Supporting class, interface, test, or module descriptor |
| [FireDecorator.java](src/DecoratorHero/FireDecorator.java) | Supporting class, interface, test, or module descriptor |
| [Hero.java](src/DecoratorHero/Hero.java) | Supporting class, interface, test, or module descriptor |
| [HeroMain.java](src/DecoratorHero/HeroMain.java) | `DecoratorHero.HeroMain` |
| [SwordDecorator.java](src/DecoratorHero/SwordDecorator.java) | Supporting class, interface, test, or module descriptor |
| [module-info.java](src/module-info.java) | Supporting class, interface, test, or module descriptor |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out DecoratorHero.HeroMain
```

## Decorator sequence

`DecoratorHero.HeroMain` requests no input. It starts with a `BaseHero`, wraps that object with armor, then a sword, then fire, and prints the statistics after each step.

| Step | HP | Attack | Defense |
| --- | ---: | ---: | ---: |
| Base hero | 100 | 10 | 5 |
| Add armor | 130 | 10 | 25 |
| Add sword around the armored hero | 130 | 35 | 25 |
| Add fire around the existing wrappers | 130 | 75 | 20 |

The additions accumulate because each decorator reads the wrapped hero's values before applying its own changes. Fire increases attack by 40 but reduces defense by 5; it does not replace the armor or sword effects. The printed name also accumulates equipment labels.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Java 2/Spiele`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
