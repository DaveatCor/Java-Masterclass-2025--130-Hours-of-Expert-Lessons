## Method structure with parameters and return type

```java
// Method return type is a declared data type for the data that
// will be returned from the method

public static dataType methodName(p1type p1, p2type p2, {more}){

    // Method statements
    return value;
}
```

So, similar to declaring a variable with a type, we can declare a method to have a type.
This declared type is placed just before the method name.

In addition, a return statement is required in the code block, as shown on the slide, which returns the result from the method.

An exmaple of a method declaration with a return type is shown here.s

In this case, the return type is an int.

```java
public static int calculateMyAge(int dateOfBirth){
    return (2023 -dateOfBirth);
}
```
This method will return an integer when it finishes executing successfully.

## The return statement

So, what's a return statement?

Java states that a return statement returns control to the invoker of a method.

The most common usage of the return statement, is to return a value back from a method.

In a method that doesn't return anything, in other words, a method declared with void as the return type, a return statement is not required, It is assumed and execution is returned after the last line of code in the method is executed.

But in methods that do return data, a return statement with a value is required.