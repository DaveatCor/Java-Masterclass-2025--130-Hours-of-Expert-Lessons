## Other ways to Loop

Continuing on with our discuessions about looping.

What if we want to loop until some condition is met, that's not associated with a known range of values?

## Java has two types of while loops

| While Loops | Explanation |
| -- | -- |
| while | Continue executing code block until the loop expression becomes false. |
| do while | Execute the code block once, then continue executing until the loop condition becomes false. 

## The for statement and the while statement

So, I've also stated several times that the for loop has three declaration parts in the parentheses, separated by semi-colons.

But looking at the while loop in comparision:

| The for statement |
| -- |
```java
for (init; expression; increment){
    // block of statements
}
```

| The while statement |
| -- |
```java
while (expression){
    // block of statements
}
```

## The while statement and do while statement

| The while statement |
| -- |
```java
while (expression){
    // block of statements
}
```

| The do while statement |
| -- |
```java
do {
    // block of statements
} while (expression);
```

## continue
The continue statement, in its simples form, will stop executing the current iteration of a block of code in a loop, and start a new iteration.