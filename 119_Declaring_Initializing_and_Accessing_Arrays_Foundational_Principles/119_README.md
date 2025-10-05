## Arrays
An array is a data structure that allows us to store a sequence of values, all of the same type.

We can have arrays for any prmitive type, like ints, doubles, booleans, or in fact, any of the 8 primitives we've learned about.

We can also have arrays for any class.

Elements in an array are indexed, starting at 0.

if we have an array storing five names, conceptually, it looks as shown here
| Index | 0 | 1 | 2 | 3 | 4 |
| - | - | - | - | - | - |
| Stored values in an array with 5 elements | "Andy" | "Bob" | "Charlie" | "David" | "Eve" |

The first element is at index 0 and is Andy.

The last element in this array is at index 4 and has the String value Eve.

## Declaring an Array
When we declare an array, we first specify the type of the elements we want in the array.

Then we include square brackets in the declaration, which is the key for Java to identify the variable as an array.

The square brackets can follow the type as shown in the first two examples.

We can also put the square brackets after the variable name as shown in the last example.

The first approach is much more common.

Note that we don't specify a size in the array declaration itself.

| Array Variable Declaration |
| - |
| `int[] integerArray` |
| `String[] nameList` |
| `String courseList[]` |

## Instantiating an Array

| Array Creation | Object Creation |
| - | - |
| int[] integerArray = new int[10]; | StringBuilder sb = new StringBuilder(); |

One way to instantiate the array is with the new keyword, similar to what we've seen when creating instances of classes.s

Looking at the left-hand side of thise slide, we have an array declaration on the left of the equals sign and then an array creation expression on the right side.

On the right-hand side of the slide, we're showing a typical class object creation statement.

They look pretty similar, but there are two major different when creating arrays.

Square brackets are required when usign the new keyword and a size is specified between them, So, in this example, there will be 10 elements in the array.

An array instantiation doesn't have set of parentheses, meaning we can't pass data to a constructor for an array.

Using parentheses with an array instantiation gives us a compiler error.s

| Invalid Array Creation - Compile Error because of () |
| - |
| int[] integerArray = new int[](); |

## An Array is NOT Resizable.
The size of an array, once created, is fixed.

In this case, integerArray will have 10 elements.s

| Array Creation |
| - |
| int[] integerArray = new int[10]; |

We can't change the size of an array after the array is instantiated.

We can't add or delete elements. We can only assign values to one of the ten elements in this array, in this example.

Note that Java has other capabilities to store element that can be resized. We'll be looking at those in the next section.

For now its important to understsand these basic arrays.

## The array initializer
An array initializer makes the job of instantiating and initializing an array much easier.

| The array initializer |
| - |
| int[] firstFivePositives = new int[]{1, 2, 3, 4, 5}; |

In this example, we still use the new keyword and have int with the squre brackets.

But here, we specify the values we want the array to be initialized to, in a comma-delimited list, within curly braces.

Because these values are specified. the length of the array can be determined by Java, so I don't then need to specify the size of the array in square brackets.

And actually, Java provides an even simpler way to do this.

## The array initizalizer as an anonymous array
Java allows use to drop the new int[] with brackets from the expression, as we're showing here.

This is know as an anonymouse array.

Here, we're showing examples for both and int array as well as a String array.

| The array initializer |
| - |
| int[] firstFivePositives = {1, 2, 3, 4, 5}; |
| String[] names = {"Andy, "Bob", "Charlie", "David", "Eve"}; |

An anonymous array initializer can only be used in a declaration statement.