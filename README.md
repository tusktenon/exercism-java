# Java on Exercism: My Solutions

These are my solutions to the exercises of the [Java track](https://exercism.org/tracks/java) on [Exercism](https://exercism.org).


## Completing Exercises

After using the `exercism` command-line tool to download the project,
- Fix the permissions of the Gradle wrapper script with `chmod +x ./gradlew`.
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

### Calculator Conundrum

Exceptions.

### Captain's Log

Randomness with the `Random` class. Note that in modern Java (17+), the use of `RandomGenerator` is preferred to `Random`.

### Car's Assemble

Number type conversions. This exercise is also intended to introduce `if-else` statements, but I think a `switch` expression is nicer here.

### Elon's Toy Car

Classes.

### Football Match Reports

Switch statements. While this exercise's associated learning concept describes only the classic, C-style `switch` *statement*, a modern (Java 14+) `switch` *expression* is a better choice.

### Gotta Snatch 'Em All

Sets.

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


## Practice Exercises

These are meant for students who've completed Learning Mode or otherwise acquired basic Go proficiency, and vary considerably in length and difficulty.

### Grains

A simple exercise that provides some practice with the `BigInteger` class.

### Hamming

Some basic practice with constructors, streams, and throwing exceptions.

For real-world data (e.g., DNA strands with billions of nucleotides), calculating the Hamming distance could be an expensive operation. The automated feedback for this exercise suggests calculating the distance inside the constructor and storing the result in a member variable, which the `getHammingDistance` method can simply return; this avoids performing the calculation more than once. The feedback also mentions another option: lazy initialization. 

### High Scores

A nice opportunity to use streams.

### Resistor Color, Resistor Color Duo, Resistor Color Trio

It seems natural to record the resistor band colors as an `enum`, but a `String[]` is a little simpler in this case (and, I suspect, at least as efficient). For **Resistor Color**, I wrote implementations using both options; for **Resistor Color Duo** and **Resistor Color Trio** (which are just simple extensions of the original exercise), I (arbitrarily) used an `enum`.

The `Arrays` class provides a `binarySearch` method for searching sorted arrays, but not simple methods like `contains` or `indexOf` for searching unsorted arrays. To access such methods, first convert the array to a `List` with `Arrays.asList`.

### Reverse String

A one-liner thanks to the `StringBuilder` class.

### RNA Transcription

A perfect case for using streams, though collecting the `IntStream` produced by the `String.chars` method back into a `String` value is surprisingly tricky (at least if you've already been spoiled by Rust's `Iterator::collect` method).

### Secret Handshake

Bit manipulations and streams.
