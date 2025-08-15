## Traditional Switch Statement vs Enhanced Switch Statement

| Traditional Switch Statement |
| -- |

```java
switch (switchValue) {
    case 1:
        System.out.println("Value was 1");
        break;
    case 2:
        System.out.println("Value was 2");
        break;
    default:
        break;
}
```

| Enhanced Switch Statement |
| -- |
```java
switch (switchValue) {
    case 1 -> System.out.println("Value was 1");
    case 2 ->
        System.out.println("Value was 2");
    case 3, 4, 5 -> {
        System.out.println("Was a 3, a 4, or a 5");
        System.out.println("Actually it was a " + switchValue);
    }
    default -> System.out.println("Was not 1, 2, 3, 4, or 5");
}
```

| Traditional |
| -- |

```java
switch ( month) {
    case "JANUARY":
    case "FEBRUARY":
    case "MARCH":
        return "1st";
    case "APRIL":
    case "MAY":
    case "JUNE":
        return "2st";
    case "JULY":
    case "AUGUEST":
    case "SEPTEMBER":
        return "3st";
    case "OCTOBER":
    case "NOVEMBER":
    case "DECEMBER":
        return "4st";
}
return "bad";
```

| Enhanced |
| -- |

```java
return switch ( month) {
    case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
    case "APRIL","MAY", "JUNE" -> "2nd";
    case "JULY", "AUGUEST", "SEPTEMBER" -> "3rd";
    case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
    default -> "bad";
}
```

## Yield Keyword
Introduce switch statement to return value back.

## When to use yield in a switch

Your switch statement is being used as a switch expression returning a value.

Your case label uses a code block, with opening and closing braces.

| This code | is implicity translated to |
| -- | -- |
| -> "1st"; | -> { yield "1st"; } |
