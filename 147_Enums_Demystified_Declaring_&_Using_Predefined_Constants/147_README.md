## The enum type
Java describes the enum type as: A special data type that contains predefined constants.

A constant is a variable whose value can't be changed, once its value has been set.

An enum is a little like an array, except its elements are known, not changeable, and each element can be referred to by a constant name, instead of an index position.

```java
public enum DayOfTheWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, STATURDAY
}
```

An enum is ordered, by the way we declare a limited set of constants, and sometimes there is a natural order to the listing, as in the case of the days.

Some other examples of possible enum declarations are:
- The months in the year: JANUARY, FEBRUARY, MATCH, etc.
- The directions is a compass: EAST, NORTH, WEST, SOUTH.
- A set of sizes: EXTRA_SMALL, SMALL, MEDIUM, LARGE, EXTRA_LARGE.

Underneath the covers, the enum type is a special type of class, which contains fields to support the constant. we'll get into that in a later discussion.

We don't have to understand all the internals of an enum, to derive the benefits of using the type.

Once we get used to know this type works, we will probably find many places to use an enum.

They simplify our code and make it more readable in many ways.