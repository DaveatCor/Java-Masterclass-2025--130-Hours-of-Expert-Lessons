## Switch Statement

```java
switch(value){
    case x:
        // Code for value == x
        break;
    case x:
        // Code for value == x
        break;
    default:
        // Code for value not equal to x or y
}
```

## Switch Value Types

| Valid Switch Value Types |
| -- |
| byte, short, int, char |
| Byte, Short, Integer, Character |
| String |
| enum |

<b>Important:</b> Cannot use long, float, double, or boolean or their wrappers.

## Fall Through in switch statement

Once a switch label matches the switch variables, no more cases are checked. 

Any code after the case label where there was a match found, will be extended, until a break statement, or the end of the switch statement occurs.

Without a break statement, execution will continue a fall through any case labels declared below the matching one, and execute each case's code.