# Java on Exercism: My Solutions

These are my solutions to the exercises of the [Java track](https://exercism.org/tracks/java) on [Exercism](https://exercism.org).


## Completing Exercises

After using the `exercism` command-line tool to download the project,
- Fix the permissions of the Gradle script with `chmod +x ./gradlew`.
- Copy over the `.gitignore` file from a previous exercise.
- It's at this point that I like to do the initial commit.
- Once you think you have a working solution, verify with `./gradlew test`.

See the [instructions](https://exercism.org/docs/tracks/java/tests) for testing on the Java track for more details. 


## Learning Exercises

These are completed during the Java track's "Learning Mode" to illustrate important language [concepts](https://exercism.org/tracks/java/concepts). They're invariably short and simple, and there generally aren't too many reasonable ways to solve them, but they can provide nice examples of Java features and built-in classes.

### Annalyn's Infiltration

Boolean operators.

### Bird Watcher

Arrays, `for` loops and enhanced `for` loops. Although the intention of this exercise is to teach `for` loops, the last three methods of the `BirdWatcher` class can be implemented much more elegantly using streams. I wrote both loop and stream versions.

### Booking Up For Beauty

Dates and times with the `LocalDate`, `LocalDateTime` and `DateTimeFormatter` classes.

### Captain's Log

Randomness with the `Random` class. Note that in modern Java (17+), the use of `RandomGenerator` is preferred to `Random`.

### Car's Assemble

Number type conversions. This exercise is also intended to introduce `if-else` statements, but I think a `switch` expression is nicer here.

### Elon's Toy Car

Classes.

### Football Match Reports

Switch statements. While this exercise's associated learning concept describes only the classic, C-style `switch` *statement*, a modern (Java 14+) `switch` *expression* is a better choice.

### Karl's Languages

Lists and generic types.

### Lasagna

The basics of method parameters and return values.

### Log Levels

Strings.

### Logs, Logs, Logs!

Enumerations.

### Need for Speed

Constructors.

### Remote Control Competition

Interfaces.

### Salary Calculator

The ternary operator (a.k.a. the conditional operator).

### Secrets

Bit manipulation: the shift (`<<`, `>>`, `>>>`) and bitwise (`&`, `|`, `^`, `~`) operators.

### Squeaky Clean

The `char` type and the static methods of the `Character` class, as well as `StringBuilder`.

### Tim from Marketing

Nullability.

### Wizards and Warriors

Inheritance.

### Wizards and Warriors 2

Method overloading.
