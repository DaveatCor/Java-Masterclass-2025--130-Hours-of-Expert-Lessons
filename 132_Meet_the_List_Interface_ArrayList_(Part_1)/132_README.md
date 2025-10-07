## Java Array vs Java List
An array is mutable, and we saw that while we could set or change values in the array, we couldn't resize the array.

Java gives us several classes that let us add and remove items and resize s sequence of elements.

These clases are said to <b>implement</b> a List's behavior.

So, what is a list?

## So what is a List?
In our everyday life, we use lists all the time.s

A List is s special type in Java, called an Interface.

Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html

## The ArrayList
The ArrayList is a class that maintains an array in memory that's actually bigger than what we need, in most cases.

It keeps track of the capacity or maximum size of the array in memory.

But it also keeps track of the elements that've been assigned or set, which is the size of the `ArrayList`.

As elements are added to an ArrayList, its capacity may need to grow. This occurs for us automatically, behind the scences.

This is why the ArrayList is resizeable.

