## The Ternary Operator (Condition ?: Operator)

The ternary operator has three operands. The only operator currently in Java that does have three. Offically, Java calls it the conditional operator.

The structure of this operator is:

<b>operand1 ? operand2 : operand3</b>

## Ternary Operator ? :

The ternary operator is a shortcut to assigning one of two values to a variable, depending on a given condition.

So think of it as a shortcut of the <b>if-then-else</b> statement. We've only discussed if-then and not else.

Consider this example:
```java
int ageOfClient = 20;
String ageText = ageOfClient >= 18 ? "Oover Eighteen" : "Still a kid";
System.out.println("Our client is " + ageText);
```

Operand one - <b>ageOfclient >= 18</b> in this case is the condition we're checking. It needs to return true, or false.

Operand two - "Over Eighteen" is the value to assign to the variable <b>ageText</b>, if the condition above is true.

Operand three - "Still a kid" is the value to assign to the variable <b>ageText</b>, if the condition above is false.

In this particular case, ageText is assigned the value "Over Eighteen", because ageOfClient has the value 20, which is greather than or equal to 18.

Now it can be a good idea to use parentheses, like this example below, to make the code more readable, particularly in the ternary operators.

```java
String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
```

In the first example we looked at in our code, we returned a boolean value from the ternary operation.

```java
boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
```

This was a good way to demonstrate the ternary operator, but woudn't be something we'd do when writing proper code.

A much simpler way to write the code is shown here:

```java
boolean isDomestic = makeOfCar != "Volkswagen";
```

We can see that this code has the same effect and is quite a bit easier to read.



