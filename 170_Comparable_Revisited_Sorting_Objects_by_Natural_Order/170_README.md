## Interfaces used for sorting
Now that we've covered interfaces and generic classes, we want to review interfaces we used in prevous lectures, in more detail.

The first in `Comparable`.

For an array, we can simply call Array.sort and pass it an array, but as we've previously mentioned, the elements in the array need to implement Comparable.

Types like String or primitive wrapper classes like Integer or Character are sortable, and this is becuase they do actually implement this interface.

## Comparable Interface
This interface declaration in Java.
```java
public interface Comparable<T>{
    int compareTo(T o);
}
```

It's a generic type, meaning it's parameterized.

Any class that implements this interface, needs to implement the comparaTo method.

This method takes one object as an argument, shown on this slide as the letter o, and compares it to the current instsance, shown as this.

| resulting Value | Meaning |
| - | - |
| zero | 0 == this |
| negative value | this < o |
| positive value | this > o |