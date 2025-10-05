## Evaluating what the runtime type is
How can we test the actual runtime type of a variable if its declared type is different?

We can determine the runtime type of an object in several ways.

## instanceof operator
The `instanceof` operator lets you test the type of an object or instance.

The reference variable you are testing is the left operand.

The type you are testing for is the right operand.

```java
unknownObject instanceof Adenture
```

It's important to see that adventure is not in quotes, meaning, we're not testing the type name but the actual type itself.

This operator returns true if unknownObject is an instance of Adventure.

## Pattern Matching for the instanceof Operator
if the JVM can identify that an object matches the type, it can extract data from the object without casting.

For this operator, the object can be assigned to a variable which we've called syfy.

From our exmaple:

```java
unknownObject instanceof ScienceFiction syfy
```

The variable syfy (if the instanceof method returns true) is already typed as a ScienceFiction variable.