## if-then Statement in Java

The <b>if-then</b> statement is the most basic of all the control flow statements. It tells your program to execute a certain of code, only if a particular test evaluates to <b>true</b>.


## Condition Logic

Condition logic use specific statements in Java to allow us to check a condition, and execute certain code based on whether that condition (the expression) is <b>true</b> or <b>false</b>.

Let's see how this works in practice.

## Assignment Operator (=)

The assignment operator assigns the value of an expression, to the variable to the left of the operator.

`boolean isAlien = false;`

So, <b>isAlien</b> is the variable in this case, and it's been set to false, which is the value of our expression.

## Equality Operator (==)

The equality operator tests to see if two operands are considered equal, and returns a boolean value.


```java
if (isAlien == false) {

}
```

So, here <b>isAlien</b> is being tested against the value false.

## Best Practice Rule - Always use a Code Block for If-then statemnt

```java
boolean isAlien = false;
        
if (isAlien == false)
    System.out.println("It isnot an alien!");
    System.out.println("And I am scared of aliens");
```
Instead of using the <b>if</b> statement as we can see here, we should instead use a code block.

## The Code Block

A <b>code block</b> allows more than one statement to be executed, in other words, a block of code.

THe format is:
```java 
if (expression) {
    // put one or more statements here
}
```

