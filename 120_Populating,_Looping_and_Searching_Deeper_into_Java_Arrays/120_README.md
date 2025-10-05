## What is an array, really?
An array is a special class in Java.

It's still a class.

The array, like all other classes, ultimately interits from `java.lang.Object`.

## Array initialization and default element values
When we don't use an array initializer statement, all array elements get initiailized to the default value for that type.

For primitive types, this is zero for any kind of numeric primitve, like int, double, or short.

For <b>booleans</b>, the default value will be <b>false</b>.

And for any <b>class</b> type, the elements will be initialized to <b>null</b>.

## The Enhanced For Loop, the For Each Loop
This loop was designed to walk through elements in an array or other collection types.

It processes <b>one element at a time</b>, from the <b>first</b> element to the <b>last</b>.

Here is the syntax for the two types of for loop statements, side by side.

| Enhanced For Loop | Basic For Loop |
| - | - |
| for (declartion : collection) {<br>// block of statement<br>} | for (init; expression; increment) {<br>// block of statement<br>} |

The enhanced for loop only has two components, versus three defined in the paraenthses after the for keyword.

It's important to notice that the separator character between components is a <b>colon</b> and not a semicolon for the enhanced `For Loop`.

The <b>first</b> part is a <b>declaration expression</b> which includes the type and a variable name.

This is usually a local variable with the same type as an element int the array.

And the <b>second</b> component is the <b>array</b> or some other collection variable.

## java.util.Arrays
Java's array type is very bastic, it comes with very little built-int functionality.

It has a single property or field, named length.

And it inherit java.until.Object's functionality.

Java provides a helper class named java.util.Arrays, providing the common functionality we'd want for many array operations.

These are static methods on Arrays, they are class methods, not instance methods.

## Printing elements in an array using Arrays.toString()
The toString method in this helper class prints out all the array elements, comma delimited, and contained in square brackets.

```java
String arrayElementsInAString = Arrays.toString(newArray);
```
The output from this method is shown here concepttually.

It prints the element at index 0 first, followed by a comma, then the element at index 1 next, a comma , and so on, until all elements are printed.

```java
[ e[0], e[1], e[2], e[3], ... ]
```
