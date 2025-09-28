## Plain Old Java Object
A plain old java object (whose acronym is <b>POJO</b>) is a class that generally only has instance fields.

It's used to house data and pass data between funtional classes.

It usually has no other, or very few methods, other than getters and setters for the instance fields.

Many database frameworks use POJO's to read data from, or to write data to databases files or streams.

A POJO also mgith be called a bean or a JavaBean.

A JavaBean is just a POJO with some extra rules applied to it.

A POJO is sometimes called an Entity because it mirrors database entities.

Another acronym is DTO for Data Transfer Object.

It's a description of an object that can be modeled as just data.

There are many generation tools that will turn a data model into generated POJO's or JavaBeans.

## The Entity - The Student Table
| Student |
| -- |
| Id <br> Name <br> DateOfBirth <br> ClassList |

## Annoation
Annotations are a type of metadata.

Metadata is a way to formally describe additional information about our code.

Annoation are more structured and have more meaning than comments.

This is becuase they can be used by the compiler or other types of pre-processing functions, to get information about the code.

Metadata doesn't affect how the code runs so this code will still run with or without the annotation.

## Overriden Methods
An overrident method is not the same thing as an overloaded method.

An overriden method is a special method in Java that other classes cna implement if they use a specified method signature.