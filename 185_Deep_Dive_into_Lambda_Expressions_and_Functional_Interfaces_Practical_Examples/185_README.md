## The Lambda Expression
| The generated Lambda Expression | Comparator's Abstract Method |
| - | - | 
| (o1, o2) -> o1.lastName().compareTo(o2.lastName()) | int compare(T o1, T o2) |

The syntax of this lambda expression is on the left below.

This was passed directly as a method argument, for a parameter type that was a Comparator.

The Comparator's abstract method, compare, is shown here on the right side.

The lambda expression paramter's are determinded by the associated interface's method.

In the case of a Comparator, and it's compare method, there are two arguments.

This is why we get o1, and o2 in parentheses, in the generated labmda expression.

These arguments can be used in the expression, which is on the right of the arrow token.

Technincally arrow, rather than arrow token is the offical term used by Oracle, when using it in a lambda expression, so we'll use that moving forward.

## The Syntax of a Lambda Expression
A lambda expressioin consist of a formal parameter list, usually but not always declared in parentheses; the arrow; and either an expression or a code block after the arrow.

Because lambda expressions are usually simple expressions, it's more common the see them written as shown on this slide.s

```java
(parameter1, parameter2, ... ) -> expression;
```
The expression should return a value, if the associated interface's method returns a value.

In the case of our generated expression, it returns an int, which is the result of the compare method on Comparator.

```java
(parameter1, parameter2, ... ) -> expression;
```

## Comparing the anonymous class and the lambda expression
Where's the link between the compare method, and this lambda expression?

It's obvious in the anonymous class, because we override the compare method, and return the result that expression.

We can see the two parameters and their types, and what the return value should be, in the anonymous class.

But the lambda expression has no reference to an enclosing method, as far as we can see from this code.

| Anonymous Class |
| - |
```java
new Comparator<Person>(){
    @Override
    public int compare(Person o1, Person o2){
        reutnr o1.lastName().compare(o2.lastName());
    }
}
```
| Lambda Expression |
| - |
```java
(o1, o2) -> o1.lastName().compareTo(o2.lastName())
```

## Where's the method in the lambda expression?
For a lambda expression, <b>the method is inferred</b> by Java!

## How can Java infer the method?
Java takes its clue from the reference type, in the context of the lambda expression usage.

Here, we show a simplified view, of the sort method on List.

```java
void sort(Comparator c)
```

And here is the call to that method passing the lambda expression.

```java
people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
```

From this, Java can infer that this lambda expression, resovles to a Comparator type, because of the method declaration.

This means the lambda expression passed, should represent code for a specific method on the Comparator interface.

But which method?

Well, there's only one the lambda expression cares about, and that's <b>the abstract method</b> on Comparator.

Java requries types which support lambda expressions, to be something called a functional interface.

## What's a functional interface?
<b>A functional interface</b> is an interface that has <b>one, and only one, abstract method</b>.

This is how Java can infer the method to derive the paramters and return type, for the lambda expression.

We may aslo see this referred to as SAM, which is short for <b>Single Abstract Method.</b> which is called the functional method.

A functional interface is the <b>target type for a lambda expression.</b>



