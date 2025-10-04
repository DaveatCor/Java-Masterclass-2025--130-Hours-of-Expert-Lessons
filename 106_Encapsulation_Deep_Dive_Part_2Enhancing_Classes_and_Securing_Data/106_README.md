## The problem when classes aren't properly encalsulated
Allowing direct access tot data on an object can bypass checks and operations.

It encourages an interdependency or coupling between the calling code an the class. 

We showed that changing a field name broke the calling code.

And also showed that the calling code had to take on the responsibility for properly initializing a new Player.

## Benefits of Encapsulation
That's really one of the huge benefits of encapsulation. Changes made do not affect any other code.

It's like a black box in many ways.

## Staying in Control
This is why we want to use encapsulation.

We protect the members of the class and some methods from external access.

This prevent calling code from bypassing the rules and constraints we've built into the class.

When we create a new instance, it's initialized with valid data.

But likewise, we're also making sure that there's no direct access to the fields.

That's why we want to always use encapsulation.

It's something that we should really get used to and use.

## Encapsulation Principles
To create an encapsulated class, we want to:
- Create constructors for object init, which enforces that only objects with valid data will get created.s
- Use the private access modifier for our fiels.
- Use setter methods sparingly and only as needed.
- Use access modifiers that arent' private, only for the methods that the calling code needs to use.