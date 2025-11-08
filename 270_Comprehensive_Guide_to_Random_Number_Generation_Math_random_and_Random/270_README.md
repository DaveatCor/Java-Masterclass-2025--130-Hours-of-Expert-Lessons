## Use Math.random oor Random's methods?
Maybe we've found some code on the internet, on how to randomize a character, and it come back with code similar.
```java
int random = (int) (Math.random() * (26)) + 65;
```

The Math.random method uses an instance of the Random class and invokes the nextDouble method on that class.

The first time we call Math.random, a single new instance of java.util.Random is created and used for all subsequent calls.

## Common Usage of Math.random, geeting a range of numbers

```java
int r = (int) (Math.random() * (upper - lower)) + lower;
```

This was a pattern used a lot, because until JDK 17, the Random.nextInt method only
supported an upper bound.

When we use Random, we have to use an instance of it.

## What's a seed?
In most programming languages, the random functions aren't truly random.

Algorithms exists that create distributions of numbers, that achieve what a random
distribution might look like, over a large range of values.

These are called <b>pseudorandom number generators</b>, and they're dependent on an <b>initial value</b> called a seed.