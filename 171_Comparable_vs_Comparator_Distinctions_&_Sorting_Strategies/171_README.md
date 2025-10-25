## The Comparator Interface
The Comparator interface is similar to the Comprable interface, and the two can often be confused with each other.

Its declaration and primary abstract method are shown here, in comparison to Comparable.

Notice that the

The compare method takes two argument vs. one for compareTo, meaning that it will compare the two arguments to one another and not one object to the instance itself.

We'll review Comparator in code, but in a slightly manufactured way.

It's common practice to incldue a Comparator as a nested class.

| Comparator |
| - |
```java 
public interface Comparator<T> {
    int compare(T o1, T o2);
}
```
| Comparable |
| - |
```java 
public interface Comparator<T> {
    int compare(T o);
}
```

## Summary of Differences
| Comparable |
| - |
```java
int compareTo(T o);
```
Compares the argument with the current instance.

Called from the instance of the class that implements Comparable.

Best practice is to have this.compareTo(o) == 0 result in this.equals(o) being true.

Arrays.sort(T[] elements) requires T to implement Comparable.

| Comparator |
| - |
```java
int compareTo(T o1, T o2);
```
Compares two arguments of the same type with each other.

Called from an instance of Compartor.

Does not require the class itself to implement Comparator, though we could also implement it this way.

Array.sort(T[] elements, Comparator<T>) does not require T to implement Comparable.