## The Lambda Expression
The functional interface is the framework that lets a lambda expression be used.

Lambda expressions are also called lambdas for short.

Many of Java's classes use functional interfaces in their method signature, which allows us to pass lambdas as argument to them.

WE'll soon discover that lambdas will reduce the amount of code we write.

In an upcoming video, we're going to cover many of Java's built-in functional interfaces.

## The Consumer Interface
The Consumer interface is in the `java.util.function` package.

it has one abstract method that takes a single arugment and doesn't return anything.

```java
void accept(T t)
```

This doesn't seem like a very interesting interface at first, but let's see what this means in practice, as far as the lambda expressions we can use with it.

## Lambda expresion variations, for a single paramter
This slide shows the different ways to declare a single parameter in a lambda expression.

| Lambda Expression | Description |
| - | - | 
| element -> System.out.println(element); | A single paramter without a type can omit the parentheses. |
| (element) -> System.out.println(element); | Parentheses are optional. |
| (String element) -> System.out.println(element); | Parenttheses required if a reference type is sepcified. |
| (var element) -> System.out.println(element); | A reference type can be var. |

## lambda expression variations, the lambda body
The lambda body can be a single expression or can contain a lambda body in opening and closing curly braces.

| Lambda Expression | Description |
| - | - |
```java
(element) -> System.out.println(element);
```
An epxression can be a single statement.

Like a switch expression, that does not require yield for a single statement result, the use of return is not needed and would result in a compiler error. 

```java
(var element) -> {
    char first = myString.charAt(0);
    System.out.println(myString + " means " + first);
}
```
An expression can be a code block.

Like a switch expression, that requires yield, a lambda that returns a value, would require a final return statement.

All statements in the block must end with semi-colons.

## Functional Programming
Lamda are Java's first step into functional programming.

This is a programming paradigm that focuses on computing and returing results.

## Stream
Another feature of Java, makes extensive use of lambda expressions, and that's stream.

Streams are exciting, because they create a pipeline of work that can be formed into a chain.

Many stream operations take functional interfaces as paramters, meaning we can code them with lambda expressions.

We have a section dedicated to stream in this course.