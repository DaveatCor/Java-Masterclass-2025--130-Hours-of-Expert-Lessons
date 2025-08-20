## Local Variables and Scope

Past studies:
- switch statement
- for statement
- while statement
- do-while statement
- break & continue statement

## Local Variables
A local variable is called local becuase it is availabe for use by the code block in which it was declared.

It is also available to code blocks that are contained by a declaring block.

```java
{ // Starts on outer block - for example a method block
    int firstVariable = 5;
    int secondVariable = 10;

    if (firstVariable > 0){ // Flow statement block starts inner block
        System.out.println(secondVariable);
    }
}
```

## Scope
Scope describe the accessibility of a variable.

"In scope" means the variable can be used by an executing block or any nested blocks.

"Out of scope" means the variable is no longer avaiable and cannot be used.

## When are Local Variables in Scope?
Local variables are always in scope in the block they are declared.

They are also in scope for any nested blocks or blocks contained within the outer block.

## When are Local Variables out of Scope?
Local variables are always out of scope for outer blocks or the containing blocks they are declared in.

Let's look at an example:

```java
public static void aMethod(boolean aBoolean)  {
    if (aBoolean){
        int myCounter = 10; // myCounter is lcoal to this if block
    }
    System.out.println(myCounter); // myCounter is out of scope here
}
```

## Scope Best Practices
It is considered best practice:

To declare and initialize variables in the same place, if possible.

And to declare variables in the narrowest scope possible.

## Local Variables and the For Statement 
In this <b>for</b> statement, as part of the declaration, there is an initialization part, as We've described.

We declared a variable, i, that isn't accessible outside of the loop.

This is because any variables declared in the init section are local to the loop, meaning, they exist and are accessible in memory only while the loop is executing, and only to the loop code block.

```java
{   // Starts on outer block - for example a method block
    for (int i = 1; i <= 5; i++){ // i declared in for loop declaration
        System.out.println(i);
    }    
    System.out.println(i); // ERROR! i is out of scope
}
```

## Declaring variable in a switch statement block
Local variables declared in an <b>if</b> statement block are not accessible outside of that block.

This alos includes other parts of the <b>if</b> statement, like the <b>else if</b> block or he <b>else</b> block.

```java
public static void aMethod(boolean counter)  {
    if (counter){
        int i = 10;
    } else {
        System.out.println(i); // ERROR! i is out of scope
    }
}
```

However, the switch statement is different from the if-then-<b>else<b/> statement blocks

```java
public static void aMethod(boolean value)  {
    switch (value){
        case 1:
            int i = 10;
            break;
        default:
            i = value; // This is ok
            System.out.println(i); // This is ok
    }
    System.out.println(i); // ERROR! i is out of scope of the switch
}
```

- Look at another example of code blocks and local variables in the switch statement.

```java
public static void aMethod(boolean value)  {
    switch (value){
        case 1:
            System.out.println(i); // This is NOT ok, i declared below
            break;
        case 1:
            int i = 10;
            System.out.println(i); // This is ok
            break;
        default:
            i = value; // This is ok
            System.out.println(i); // This is ok
    }
    System.out.println(i); // ERROR! i is out of scope of the switch
}
```

