## What's happended to the Interface since JDK 8
Before JDK 8, the interface type could only have public abstract methods.

JDK 8 introduced the <b>default</b> and <b>public</b> static methods and JDK 9 introduced <b>private</b> methods, both static and non-static.

All of these new method types (on an interface) are concrete methods.

## The Interface Extension Method - the default method (as of JDK8)
An extension method is identified by the modifier <b>default</b>, so it's more commonly known as the default method.

This method is a <b>concrete</b> method, meaning it has a code block and we can add statements to it.

In fact, it has to have a method body, even if the body is just an empty set of curly braces.

It's a lot like a method on a superclass because we can override it.

Adding a default method doesn't break any classes currently implementing the interface.

## Overriding a default method
Just like overriding a method on a class, we have three choices when we override a default method on an interface.
- We can choose not to override it at all.
- We can override the method and write code for it, so that ihe interface method isn't executed.
- Or we can write our own code, and invoke the method on the interface, as part of our implementation.