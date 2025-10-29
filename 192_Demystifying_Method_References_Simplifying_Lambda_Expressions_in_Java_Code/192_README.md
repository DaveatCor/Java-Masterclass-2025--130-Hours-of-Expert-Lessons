## What's a Method Reference?
Java gives us an alternative syntax to use for this econd kind of lambda that uses named methods.

These are called method reference.

These provide a more compact, eaiser-to-read lambda expression, for methods that are already defined on a class.

## Why are these statements equal?
As first glance, it's not really obvious why a method reference has this syntax.

| Lambda Expression | Method Reference |
| - | - |
| s -> System.out.println(s) | System.out::println |

As method reference abstracts the lambda expression even further, eliminating the need to declare formal parameters.

We also don't have to pass arugments to the method in question, in this case prinln.

A method reference has double colons, between the qualify type, and the method name.

In this example of a Consumer interface, not only is the method inferred, but the paramters are as well.

## What methods can be used in method references?
Methods which can be used a method reference are based on the context of the lambda expression.

This means the method reference, is again dependent on the targeted interface's method.

We can reference a static method on a class.

We can reference an instance method from either an instance external to the expression, or an instance passed as one of the arguments.

Or we can reference a constructor, by using new as the method.

Method reference can be used to increase the readibility of our code.

## Deferred Method Invocation
When we create variables that are lambda expressions or method references, it's important to remember that the code isn't invoked at that point.

The statement or code block gets invoked at the point in the code that the targeted functional method is called.