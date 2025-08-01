## The Method

Java's documentation states that:

A method declares executable code that can be invoked, passing a fixed number of values as arguments.

## Is the method a statement or an expression?

Like some of the abbreviated operators we learned about, a method can be a statement or an expression in some instances.

Any method can be executed as a statement.

A method that returns a value can be used as an expression, or as part of any expression.

## What are functions and proceduures?

Some programming lanugages will call 
- A method that returns a value, <b>a function</b>.
- And a method that doesn't return a value, <b>a procedure</b>.

We'll often hear function and method used interchangeably in Java.

The term procedure is somewhat less common, when aaplied to Java methods, but you may still hear a method with a void return type, called procedure.

## Declaring the Method

So there are quite a few declarations that need to occur as we create a method.

This consists of:
- Declaring Modifiers, These are keywords in Java with special meanings, we've seen <b>public</b> and <b>static</b> as examples, but there are others.

- Declaring the return type.
    - <b>void</b> is a Java keyword meaning no data is returned from a method.
    - Alternatively, the return type can be any primitive data type or class.
    - If a return type is defined, the code block must use at lease one return statement, returning a value, of the declared type or comparable type.

- Declaring the method name, Lower camel case is recommanded for method names.
- Declaring the method paramters in parentheses. A method is not required to have parameters, so a set of empty parentheses would be declared in that case.
- Declaring the method block with opening and closing curly braces. This is also called the method body.

## Declaring the Parameters

Parameters are declared as a list of comma-separated specifiers, each of which has a paramter type and a parameter name (or identifier).

Parameter order is importance when calling the method.

The calling code must pass argument to the method, with the same or comparable type, and in the same order, as the declarations.

The calling code must pass the same number of arguments, as the number of paramters declared.

## Declaring the Return Type

When delcaring a return type:

<b>void</b> is a valid return type, and means no data is returned.

Any other return type requireds a return statement, in the method code block.

## The Return Statement for methods that have a return type

if a method declares a return type, meaning it's not valid. then a return type is requried at any exit proint from the method block.

Consider the method block shown here:

```java
public static boolean isTooYoung(int age){
    if (age < 21){
        return true;
    }
}
```

So in the case of using a return statement in nested code blocks in a method, all possible cod segments must result in a value being returned.

```java
public static boolean isTooYoung(int age){
    if (age < 21){
        return true;
    }
    return false;
}
```

One common practice is to declare a default return value at the start of a method, and only have a single return statement from a method, returning that variable, as shown in this example method:

```java
public static boolean isTooYoung(int age){
    boolean resutl = false;
    if (age < 21){
        result = true;
    }
    return result;
}
```

The return statement can return with no value from a method, which is declared with a <b>void</b> return type.

In this case, the return statement is optional, but it may be used to terminate execution of the method at some earlier point than the end of the method block, as shown here:
```java
public static boolean methodDoesSomething(int age){
    if (age < 21){
        return;
    }
    // Do more stuff here
}
```

## The Method Signature

A method is uniquely defined in a class by its name, and the number and type of parameters that are declared for it.

The is called the method signature.

You can have multiple methods with the same method name, as long as the method signature (meaning the parameters declared) are different.

This will become important later in this section, when we cover overloaded methods.

## Default values for parameters

In many languages, methods can be defined with default values, and you can omit passing values for these when calling the method.

Bbut Java doesn't support default values for parameters.

There are work-arounds for this limiation, and we'll be reviewing those at a later date.

But it's important to state again, in Java, the number of arguments you pass, and their type, must match the paramters in the method declaration exactly.

## Revisting the main method

We're armed with knowledge about methods, we can revisit the main method, and examine it again.

The main method is special in Java, becuase JVM looks for the method, witht this particular signature, and uses it as the entry point for execution of code.

```java
public static void main(String[] args){
    // code in here
}
```
