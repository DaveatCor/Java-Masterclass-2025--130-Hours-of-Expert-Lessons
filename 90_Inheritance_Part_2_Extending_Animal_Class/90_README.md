## Code Re-use
All subclasses can execute methods even though the code is declared on the parent class.

The code doesn't have to be dubplicated in each subclass.

We can use code from the parent.

Or we can change that code for the subclass.

## Overriding a method
Overding a method is when we create a method on a subclass, which has the same signature as a method on a super class.

We override a parent class method when we want the child class to show different behavior for that method.

## Overridden method
The overridden method can do one of three things:
- It can implement completely different behavior, overriding the behavior of the parent.
- It can simply call the parent class's method, which is somewhat redundant to do.
- Or the method can call the parent class's method and include other code to run so it can extend the functionally for the Dog, for that behavior.