## What's an exception?
An exception is an error that happends in code.

Some types of errors can be predicted and named.

[Exception Link Java](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html)

## Catching an exception
An exception is caught first by creating a code block around the code that gets the error.

This is done with try statement code block.

## The try statement
The try statement actually has two code blocks.

The first is declared directly after the try keyword, and this code block ends, and is followed by the declaration of the catch keyword.

The catch keyword includes the declaration of variables, in parentheses, and the has its own code block.

```java
try {
    // statements that might get errors
} catch (Exception e){
    // code to 'handle' the exception
}
```

## The Scanner class
The scanner class is described as a simple text scanner, which can parse primitive types and strings.

To use the Scanner class, we have to create an instance of Scanner.

This means we're creating an object of type Scanner.

We'll use the keyword, new, to do it.

## new keyword
The <b>new</b> keyword is used in what Java calls a Class Instance Creation Expression.

In its simplest form, it's the word new, followed by the class name, and empty parentheses.

```java
ClassName variableName = new ClassName();
```

We can optionally pass arguments in those parentheses, as we saw with methods.

```java
ClassName variableName = new ClassName(argument1, argument2);
```

We saw that we could do this with the String class, passing the text int he parentheses.

## Instantiating Scanner
For reading input from the console or terminal, we instantiate as scanner object using new, followed by the <b>Scanner</b> class name, and passing System.in, as an arugment, in the parentheses.

```java
Scanner sc = new Scanner(System.in);
```

For reading input from a file, we instantiate a scanner object using new, again with the Scanner class name, but pass a File object, as an argument, in the parenthese.

File is another class provides by Java, for reading and writing files.

```java
Scanner sc = new Scanner(new File("nameOfFileOnFileSystem"));
```

## Using the import statement
I haven't talked about the import statement yet, but the statement lets us use classes from other people's code.

In this case, Java provides a library of code, which includes the Scanner class in a library called.

```java
import java.util.Scanner;
```