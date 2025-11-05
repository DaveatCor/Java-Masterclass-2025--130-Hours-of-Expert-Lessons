## Mutable vs Immuable
Objects have state, which is the data stored in instance fields.

State can change after an object is created, either intentionally or unintentionally.

When state remains constant throughout the lifetime of the object, and code is prevented from changing the state, this object is called an immutable object.

An immutable object is an object whose internal state remains constant.

A mutable object is an object whose internal state doesn not remain constant.

Which is better?

Well, like anything else, that depends.

## Immuable Objects - Advantages
Working with immutable objects has some advantages.

An immutable object isn't subject to unwanted, unplanned and unintended modifications,
Known as side-effects.

An immutable class is inherently thread-safe, because no threads at all can change it, once it's been constructed.

This allows us to use more efficient collections and operations, which don't have to manage synchornization of access to this object.

These are two of the most important advantages.

## Immuable Objects - Disadvantages
Working with immutable objects has some disadvantages.

An immutable object can't be modified after been created.

This means that when a new value is needed, we're probably going to need to make a copy of the object with the new value.

Hopefully, we'll remember the discussion comparing `String` v.`StringBuilder` from earlier in the course.

## Classes must be designed to produce Immutable Objects
We'll be talking about immutable class design coming up.

It's important to understand that POJOs and Java Beans, which many code generation tools 
create, are not by design, immutable, and therefore this architecture may not be the preferred design for our class.

This all sounds rather simple, yet there are many topics related to it.

One of the most useful tools in our arsenal to build immutable classes, is the final access modifer.

We'll be revisiting this modifier in much more detail in the next video, so let's get going.