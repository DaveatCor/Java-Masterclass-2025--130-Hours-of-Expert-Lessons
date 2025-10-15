## Generalization and Abstraction
We use the terms <b>Abstraction</b> and </b>Generalization</b>, when we start trying to model real world things in software.

Before we launch into interface types and abstrat clases, we want to talk about what these concepts means.

We generalize when we create a class hierarchy.

A base class is the most general class, the most basic building block, which everything can be said to have in common.

## Abstraction
Part of generalizing is using abstraction.

We can generalize a set of characterstics and behavior intor an abstract type.

If we consider an octopus, a dog, and a penguin, we will probably say they're all animals.

An animal is really an abstract concept.s

An animal doesn't really exist, except as a way to describe a set of more specific things.

If we can't draw it on a piece of paper, it's probably abstract.

Abstraction simplifies the view of a set of items' traits and behavior, so we can talk about them as a group, as well as generalize their functionality. 

## Java's support for Abstraction
Java supports abstraction in several different ways.
- Java allows us to create a class hierarchy, where the top of the hierarychy, the base class, is usually an abstract concept, whether it's an abstract class or not.
- Java lets us create abstract classes.
- Java gives us a way to create interfaces.

## Abstract method
We'll be talking a lot about astract and concrete methods.

An abstract method has a method signature, and a return type, but doesn't have a method body.

Because of this, we say an abstract method is <b>unimplemented</bs>.

Its purpose s the describe behavior, which any object of that type will always have.

Conceptually, we can understand behaviors like move or eat on an Animal, so we might include those as abstract methods, on an abstract type.

We can think of an abstract method as a contract.s

This contract promises that all subtypes will provide the promised functionally, with the agreed upon name and arguments.

## Concrete method
A concrete method has a method body, usually with at least one statement.

This means it has operational code, that gets executed, under the right conditions.

A concrete method is said to <b>implement</b> an abstract method, if it overrides one.

Abstract classes and interfaces can have a mix of abstract and concrete methods.

## Method Modifiers
We've already covered access modifiers and what they mean for types, as well as members of types.

And we know there are `public, protected, package, and private access modifiers`, as options for the members.

In addition to access modifiers, method have other modifiers, which we'll list here, as a hight-level introduction.

| Modifier | Purpose |
| - | - |
| abstract | when we declare a method abstract, a method body is always ommited. An abstract method can only be declared on an abstract class or an interface. |
| static | Sometimes called a class method, rather than an instance method, because it's called directly on the Class instance. |
| final | A method that is final cannot be overriden by subclasses. |
| default | this modfier is only applicable to an interface, and we'll talk about it in our interface video. |
| native | This another method with no body, but it's very different from the abstract modifier. The method body will be implemented in platform-dependent code, typically written in another programming language such as C. This is an advanced topic and not generally commonly used, and we won't be covering it in this course. |
| synchronized | This modifier manages how multiple threads will access the code in this method, we'll cover this in a later section on multi-threaded code. |