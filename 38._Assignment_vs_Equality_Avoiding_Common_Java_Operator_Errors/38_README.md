## Difference Between the Assignment and Equal to Operators

```java
int newVlaue = 50;
if (newVlaue = 50){
    System.out.println("This is an error");
}
```
As we can see, we've used the assignment operators (one equal sign) in the if statement. What we need to do, is to use the "equals to" operator (two equal signs).

This is what the code should look like:
```java
int newVlaue = 50;
if (newVlaue == 50){
    System.out.println("This is an error");
}
```

We're not assigning a value here, instead we want to test if the values are equal to each other.

## The NOT Operator

THe exclamation marks (!), or <b>NOT</b> operator, is also known as the Logical Complement Operators.

It can be used with a boolean variable, to test for the opposite value.

```Java
boolean isCar = false;
if (isCard){
}
```

In the code above, we are testing if the value in is car is true. As you can see on the previous line, we assigned it to be false.

```Java
boolean isCar = false;
if (!isCard)
```

If we use the "not" operator, we are testing for the opposite value of the is car variable. We assigned is car on the previous line to false, so not is car, would return true.

General recommand using the abbreviated form, if our variable are booleans, for two reasons.

One, It's much harder to identify the error, if we accidentally use an assignment operator.

As we saw, IDE won't flag this as an error when we're testing a boolean variable, so the only way we'll know we made this common mistake is by discovering our program or output isn't what we expected.

Secondly, the code is more conside, and more conside code can often be more readable code.
