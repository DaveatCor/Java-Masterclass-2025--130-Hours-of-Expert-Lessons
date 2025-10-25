## Limitation of a reference of generic class with a list argument
When we delcare a variable or method parameter with:
- List<Student>

Only List subtypes with Student elements can be assigned to this variable or method arugment.

We can't assign a list of Student subtypes to this!.

## The generic method
For a method, type paramters are placed after any modifiers and before the methods return type.

The type paramter can be referenced in method paramters, as the method return type, and in the method code bloc, much as we have seen how a class's type paramter be used.

A generic method can be used for collections with type arguments, as we just saw, to allow for variability of the elements in the collection, without using a raw version of the collection.

A generic method can be used for static methods on a generic class, because static methods can't use class type paramters.

A generic method can be used on a non-generic class, to enforce type rules on a specific method.

The generic method type paramter is separate from a generic class type paramter.

In fact, if we've used T for both, the T declared on the method means a different type, than the T for the class.

```java
public <T> String myMethod(T input){
    return input.toString();
}
```

## Type Paramters, Type Arguments and using a WildCard
A <b>type paramter</b> is a generic class, or generic method's declaration of the type.

In both of these examples, T is said to be the type paramter.

We can bind a type paramter with the use of the <b>extends</b> keyword, to specify an <b>upper bound</b>
| Generic class |
| - |
```java
public class Team<T> {}
```
| Generic Method |
| - |
```java
public <T> void doSomething(T t) {}
```

A <b>type argument</b> declares the type to be used, and it specified in a type reference, such as a local variable reference, method paramter declaration, or field declaration.

In this example, BaseBallPlayer is the type argument for the Team class.
| Generic class |
| - |
```java
Team<BaseballPlayer> team = new Team<>();
```

A <b>wildcard</b> can only be used in a <b>type argument</b>, not in the type paramter declaration.

A wildcard is represented by the <b>?</b> character.

A wildcard means the type is <b>unknown</b>;

For this reason, a wildcard <b>limits what we can do</b>, when we specify a type this way.

| List declaration using a wildcard |
| - |
| List<?> unkownList; |

A wild card can't be used in an instantiation of a generic class.

The code shown here is invalid.

| Invalid! We can't use a wildcard in an instantiation expression |
| - |
| var myList = new ArrayList<?>(); |

A wildcard can be unbounded, or alternately specify either an upper bound or lower bound.

We <b>can't specify both</b> an <b>upper</b> bound and a <b>lower</b> bound, in the same declaration.

| Argument | Example | Description|
| - | - | - |
| unbounded | List<?> | A List of any type can be passed or assigned to a List using this wildcard. |
| upper bound | List<? extends Student> | A list containing any type that is a Student or a <b>sub type</b> of Student can be assigned or apsed to an argument specifying this wildcard.. |
| lower bound | List<? super LPAStudent> | A list containing any type that is an LPAStudent or a <b>super type</b> of LPAStudent, so in our case, that would be Student AND Object. |

## Type Erasure
Generics exist to enforce tighter type checks at compile time.

The compiler transforms a generic class into a typed class, meaning that byte code or class file contains no type paramters.

Everywhere a type paramter is used in a class, it gets replaced with either the tpe object, if no upper bound was specified, or the upper bound type itself.

This transformation process is called type erasure, because the T paramter `(or S, U, V)`, is erased or replaced with a true type.

Why is this important?

Understanding how type erasure works for overloaded methods is important.
