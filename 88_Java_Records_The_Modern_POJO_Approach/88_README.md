## The Record type
The record was introduced in JDK 14 and became officially part of Java in JDK 16.

It's purpose is to replace the boilerplate code of the POJO but to be more restrictive.

Java calls them "plain data carriers".

The record is a special class that contains data that's not meant to be altered.

In other words, it seeks to achieve immutability for the data in its members.

It contains only the most fundamental methods, such as constructors and accessors.

## Implicit or Generated Code that Java provides
What does Java tell us about what is implicitly created when we declare a record as we did in this code?

```java
public record LPAStudent(String id, String name, String dateOfBirth, String classList) {}
```

First, it's important to understand that the part that's in parentheses, is called the <b>record header</b>.

The record header consist of record components, a comma, delimited list of components.

For eache component in the header, Java generates:
- A field with the same name and declared type as the record component.
- The field is declared private and final.
- The field is sometimes referred to as a component field.

Java generates a toString method that prints out each attribute in a formatted String.

In addition to creating a private final field for each component, Java generates a public accessor method for each component.

This method has the same name and type of the component, but it doesn't have any kind of special prefix like get or is, for example.

The accessor method for id, in this example, is simply id().

## Why have an immutable record?
Why is the record built to be immutable?

There are more use cases for immutable data transfer objects and keeping them well encapsulated.

We want to protect the data from unintended mutations.

## POJO vs. Record
If we want to modify data on our class, we won't be using the record.

We can use the code generation optionas for the POJO as we saw in the earlier video.

But if we're reading a whole lot of records from a database or file source and simply passing this data around, then the record is a big improvement.

## Java's new type, the record
We've only touched on some of the features of the record to give us an introduction.s

When we do talk more about the final keyword and immutability of data. espically as it may be affected by concurrent threads, we'll be revisiting this type.

