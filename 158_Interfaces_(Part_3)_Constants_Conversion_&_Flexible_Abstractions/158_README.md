## Extending Interfaces
Interfaces can be extended, similar to classes using the extends keyword.

On this slide, OrbitEarth that extends the FlightEnabled interface.

This interface requires all classes to implement both the OrbitEarth and the FlightEnabled abstract methods.

```java
interface OnbitEarth extends FlightEnabled {}
```

Unlike a class, an interface can use the extends expression with multiple interfaces:

```java
interface OnbitEarth extends FlightEnabled, Trackable {}
```

## Implements is invalid on an interface
An interface doesn't implement another interface, so the code on this slide won't compile.

In other words, implements is an invalid clause in an interface declaration.

```java
interface OnbitEarth extends FlightEnabled {}   // INVALID, implements is
                                                // invalid clause for 
                                                // interfaces
```

## Abstracted Types - Coding to an Interface
Both interfaces and abstract classes are <b>abstracted reference types</b>

Reference types can be used in code, as variable types, method paramters, return types, list types, and so on.

When we use an abstracted reference type, this is referred to as <b>coding to an interface</b>.

This means our code doesn't use specific types, but rather, more generalized ones, usually an interface type.

<b>This technique is preferred</b>, becuase it allows many runtime instances of various classes to be processed uniformly by the same code.

It also allows for substitutions of some other class or object that still implements the same interface, without forcing a major refactor of our code.

Using interface types as the reference type is considered a best practice.

## Coding to an interface
Coding to an interface scales well, to support new subtypes, and it helps when refactoring code.

The downside though is that alterations to the interface may wreak havoc, on the client code.

Imagine that we have fifty classes using our interface and we want to add an extra abstract method to support new functionality.

As soon as we add a new abstract method, all fifty classes won't compile.