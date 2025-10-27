## The Function interface
Each has a return type, shown here as either T, or R, which stands for result, meaning a result is expexted for any of these.

In addition to `Function` and `BiFunction`, there is also `UnaryOperator` and `BinaryOperator`.

We can think of the UnaryOperator as a Function Interface, but where the argument type is the same as the result type.

The BinaryOperator is a BiFunction interface, where both arguments have the same type, as does the result, which is why the result is shown as T, and not R.

This reminds us that the result will be the same type as the arguments to the methods.

I've also included the type paramters with each interface name on this slide, because we want to see that the result for a Function or BiFunction, is declared as the last type argument.

For UnaryOperator and BinaryOperator, there is only one type argument declared, because the types of the arugments and results, will be the same.

| Interface Name | Method Signature | Interface Name | Method Signature |
| - | - | - | - |
| Function<T, R> | R apply(T t) | UnaryOperator<T> | T apply(T t) |
| BiFunction<T, U, R> | R apply(T t, U u) | BinaryOperator<T> | T apply(T t1, T t2) |

## A Function Interface Lambda Expression Example
On this slide, we're showing an example of a lambda expression which targets a Function interface.

This lambda expression takes a String, s, and splits that String on commas, returing an array of String.

In this case, the argument type, T, is a String, and the result, R, is an array of String.

To demonstrate how to declare a variable of this type.

| Example Lambda Expression for Function | Function Method | Variable Declaration for this example |
| - | - | - |
| s -> s.split(","); | R apply(T t) | Function <String, String[]> f1; |

## The Supplier Interface
The supplier interface takes no argument but returns an instance of some type, T.

| Interface Name | Method Signature |
| - | - |
| Supplier | T get() |

We can think of this as kind of like a factory method.

It will produce an instance of some object.

However, this doesn't have to be a new or distinct result returned.

## A Supplier Lambda Expression Example
In this exmaple, we're using the Random class to generate a random Integer.

This method takes no argument, but lambda expressions can use final or effectively final variables in their expressions, which we're demonstrating here.

The variable random is an example of a variable from the enclosing code.

| Example Lambda Expression for Consumer |
| - |
| () -> random.nextInt(1, 100); |

## Valid Lambda Declarations for different number of arguments
This many varieties of declaring a paramter type in a lambda expression.

Parentheses are required in all but the one case, where the functional method has a single argument, and we don't specify a type, or use var.

When using var as the type, every argument must use var.

When specifying explicit types, every argument must include a specific type.

| Arguments in Functional Method | Valid lambda syntax |
| - | - |
| None | () -> statement |
| One | s -> statement<br>(s) -> statement<br>(var s) -> statement<br>(String s) -> statement |
Two
- When using var, all arguments must use var.
- When specifying explicit types, all, arguments must specify explicit types.
```java
(s, t) -> statement
(var s, var t) -> statement
(String s, List t) -> statement
```
