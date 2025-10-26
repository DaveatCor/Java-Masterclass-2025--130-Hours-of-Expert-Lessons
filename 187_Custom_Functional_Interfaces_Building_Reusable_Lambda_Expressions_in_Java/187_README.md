## Lambda expessions with multiple paramters
The rules for multiple parameters used in a lambda expression are shown here.

| Lambda expression | Description
| - | - |
| (a, b) -> a + b; | Parentheses are always required. Explicit types are not. |
| (Integer a, Integer b) -> a + b; | If we use an explicit type for one paramter, we must use explicit types for all the parameters. |
| (var a, var b) -> a + b; | If we use var for one paramter, we must use var for all paramters. |

## Lambda expressions that return values
This slide shows the two rules for returing values from a lambda expression.

| Lambda expression | Description
| - | - |
```java
(a, b) -> a + b;
```
When not using curly braces, the return keyword is unnecessary, and will throw a compiler error.

```java
(a, b) -> {
    var c = a + b;
    return c;
}
```
if we use a statement block, meaning we use the curly braces, a return is required.