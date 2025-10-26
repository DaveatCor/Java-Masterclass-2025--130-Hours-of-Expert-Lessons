## Anonymous Classes
An anonymous class is a local that doesn't have a name.

All the nested classes we've looked at so far have been created with a class declaration.

The anonymous class is never created with a class declaration, but it's always instantiated as part of an expression.

Anonymous classes are used a lot less, since the introducton of Lambda Expressions in JDK 8.

But there are still some use cases where an anonymous class might be a good solution.

## Anonymous class creation
An anonymous class is instantiated and assigned in a single statement.

The new keyword is used followed by any type.

This is <b>NOT</b> is used followd by any type.

It's the super class of the anonymous class, or it's the interface this anonymous class will implement as we'll showig here.

In the first example on this slide, the anonymous unnamed class will implement the Comparator interface.

```java
var c4 = new Comparator<StoreEmployee>() {};
```

In the second example on this slide, the anonymous class extends the Employee class, meaning it's a subclass of Employee.

```java
var e1 = new Employee {};
```