## The final modifier in Java
When we use the final modifier, we prevent any further modifications to that component.
- A final method means it can't be overridden by a subclass.
- A final field means an object's field can't be reassigned or given a different value, after its initialization.
- A final static field is a class field that can't be reassigned, or given a different value, after the class's 
initialization process. A field declared on an Interface is always public, static and final.
- A final class can't be overridden, meaning no class can use it in the extends clause.
- A final variable in a block of code, means that once it's assigned a value, any remaining code in the block can't change it.
- A final method parameter means that we can't assign a different value to that parameter in the method code block.

## Using the final modifier on methods
We can use the final modifier on methods.

Using final with methods only makes sense in the context of wanting to restrict what our subclasses can override or hide.

Using final on an <b>instance</b> method means subclasses can't <b>override</b> it.

Using final on a <b>class</b> (static) method means subclasses can't <b>hide</b> it.