## Interface vs. Abstract class
We saw that an abstract class requires its subclasses to implement its abstrat methods.

An <b>interface</b> is similar to an abstract class, although it isn't a class at all.

It's a <b>special</b> type, that's more like a constract between the class and client code, that the compiler enforces.

By declaring it's using an interface, our class must implement all the abstract methods on the interface.

A class agrees to this because it wants to be known by that type, by the outside world or client code.

An <b>interface</b> lets <b>classes that might have little else in common</b> be recognized as a special reference type.

## Declaring an interface
Declaring an interface is similar to declaring a class, using the keyword <b>interface/b>, where would use the keyword class.

On this slide, we're declaring a public interface named FlightEnabled.

```java
public interface FlightEnabled {}
```

An interface is usually named according to the set of behaviors it describes.

Many interfaces will end in 'able', like Comparable, and Iterable. Meaning something is capable or can perform a given set of behaviors.

## Using an interface
A class is associated to an interface by using the <b>implements</b> clause in the class declaration.

In this example, the class Bird implements the FlightEnabled interface.
```java
public class Bird implements FlightEnabled {

}
```

Because of this declaration, we can use FlightEnabled as the reference type and assign it an instance of bird.

In this code sample, we create a new Bird object but assign it to the FlightEnabled variable named flier.
```java
FlightEnabled flier = new Bird():
```

## A class can use extends and implements in same declaration
A class can only <b>extend</b> a <b>single class</b>, which is why Java supports only single inheritance.

However, a class can implement many interfaces, providing flexiblity and modulariry.

This allows for the combination of different sets of behaviors, making interfaces a powerful feature.

A class can <b>extend</b> a <b>single class</b>, which is why Java supports only single inheritance.

However, a class can <b>implement many interfaces</b>, providing flexibility and modularity.

This allows for the combination of different sets of behaviors, making interfaces a powerful feature.

```java
package dev.lpa;

public class Bird extends Animal implements FlightEnabled, Trackle {
}
```

In this example, the Bird class extends or inherits from Animal, but it's implementing both a FightEnabled, and Trackable interface.

We can describe Bird by what it is and what it does.

## The abstract modifier is implied on an interface
I dont't have to declare the interface type abstract, because this modifier is implicitly declared for all interfaces.

```java
abstract interface FlightEnabled {  // abstract modifier here is unnecessary
                                    // and redunant
}
```

Likewise, we don't have to declare any method abstract.

In fact, any method declared without a body, is really <b>implicity declared both public and abstract</b>.

The three declarations shown on this slide, result in the same thing, under the covers:
```java                         
public abstract void fly();     // public and abstract modifiers are redundant,
                                // meaning unnecessary to declare
abstract void fly();            // abstract modifier is redundant, meaning
                                // unnecessary to declare
void fly();                     // This is PREFERRED declaration, public and
                                // abstract are implied.
```

## All members on an interface are implicitly public
If we omit an access modifier on a <b>class member</b>, it's <b>implicitly package private</b>

If we omit an access modifier on an <b>interface member</b>, it's <b>implicitly public</b>.

This is an importance difference, and one we need to remember.

Changing the access modifier of a method to <b>protected</b> on an interface, is a <b>compiler error</b>, whether the method is concrete or abstract.

