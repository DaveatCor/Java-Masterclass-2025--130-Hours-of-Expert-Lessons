## java.util.function
Java provides a library of functional interfaces in the java.util.function package.

We've looked at one already, the Consumer interface.

We'll look at another of these interfaces now, the `BinaryOperator`, in code.

## The Four categories of Functional Interfaces
It's a good idea to know the four basic types of functional interfaces in the `java.util.function` package.

There are over forty interfaces in this packages.

This slide shows the four categories, with the simplest method show.

These can all be categorized as one of th following types.

| Interface Category | Basic Method Signature | Purpose |
| - | - | - |
| Consumer | void accept(T t) | execute code without returning data |
| Function | R apply(T t) | return a result of an operation or function |
| Predicate | boolean test(T t) | test if a condition is true or false |
| Supplier | T get() | return an instance of something. |

## The Consumer interface
On this slide, the two most common `Consumer` interfaces and the `functional` method on each.

The `Consumer` interface takes two arguments, of two different types.

| Interface Category | Method Signature |
| - | - |
| Consumer | void accept(T t) |
| BiConsumer | void accept(T t, U u) |

## A Consumer Lambda Expression Example
This slide shows an example consumer lambda expression, It takes one argument and executes a single statement.

| Example Lambda Expression for Consumer | Consumer Signature |
| - | - |
| s -> System.out.println(s) | void accept(T t) |

## The Predicate Interface
The predicate interfaces take one or two arguments, and always returns a boolean value.

They are used to test a condition, and if the condistion is true, to perform an operation.

| Interface Name | Method Signature |
| - | - |
| Predicate | boolean test(T t) |
| BiPredicate | boolean test(T t, U u) |

## A Predicate Lambda Expression Example
In this example, the expression takes a String, and tests if it's equal to the literal text "Hello", ignoring case. It returns either true or false.

| Example Lambda Expression for Consumer |
| - |
| s -> s.equalsIgnoreCase("Hello") |

