## Java supports three statement for looping

| Statement | Explanation |
| -- | -- |
| for | The for loop is more complex to set up but is commonly used when you are iterating over a set of values. |
| while | The while loop executes until a specified condition becomes false. |
| do while | The do while loop always executes at least one and continues until a specified condition becomes false. |

## The for statement
The <b>for statement</b> is often referred to as the for loop.
It repeatedly loops something until a condition is satified.

```java
for (init; expression; increment){
    // block of statements
}
```
These parts are all optional and consist of the following:
- The initialization section declares or sets state, usually declaring and initializing a loop variable, before the loop begins processing.
- The expression section, once it becomes false, will end the loop processing.
- The increment section is executed after the expression is tested, and is generally the place where the loop variable is incremented.

## Mini Challenge

Using a new for statement, call the calculateInterest method witht the dollar amount of 100.

## The break statement
A break statement transfers control out of an enclosing statement.
We've seen the break statement in the switch statement, but it can also be used in a loop.