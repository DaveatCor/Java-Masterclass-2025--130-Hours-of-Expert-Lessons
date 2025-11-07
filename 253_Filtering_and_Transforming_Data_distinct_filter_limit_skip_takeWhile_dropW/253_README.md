## The Most Common Intermediate Operations
Up until now, we've kind of glossed over intermediate operations.

We've used filter, limit, map and sorted in examples.

As we can see from this table, the operations we've already seen briefly, cover half of the basic operations avaiable 
to our stream pipelines.

| Return Type | Operations |
| - | - |
| Stream<T> | distinct() |
| Stream<T> | filter(Predicate<? super T) predicate<br>takeWhile(<Predicate<? super T> predicate)<br>dropWhile(Predicate<? super T> predicate) |
| Stream<T> | limit(long maxSize) |
| Stream<R> | map(Function<? super T, ? extends R> mapper) |
| Stream<T> | peek(Consumer<? super T> action |
| Stream<T> | skip(long n) |
| Stream<T> | sorted()<br><sorted(Comparator<? super T> comparator)> |

## Intermediate Operations that effect the size of the Resulting Stream
We'll start by talking about the set of operations, that may change the number of elements in the resulting stream.

| Return Type | Operations | Description                                                                                                                                                                                                                                                                         |
| - | - |-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Stream<T> | distinct() | Removed duplicate values from the Stream.                                                                                                                                                                                                                                           |
| Stream<T> | filter(Predicate<? super T) predicate<br>takeWhile(<Predicate<? super T> predicate)<br>dropWhile(Predicate<? super T> predicate) | These methods allow us to reduce the elements<br>in the output stream. Elements that match the<br>filter's predicate are kept in the outgoing stream,<br>for the filter and takeWhile operations. Elements will be dropped until or while the dropWhile's<br>predicate is not true. |
| Stream<T> | limit(long maxSize) | This reduces our stream to the size specified in the argument.                                                                                                                                                                                                                      |
| Stream<T> | skip(long n) | This method skips elements, meaning they won't be part of the resulting stream.                                                                                                                                                                                                     |

## Declarative Language of Stream Operations Resembles Query commands
The Java API designer desinged the Stream to let us process data in a declarative way.
much like a structured query language or SQL in a database.

This lets us say <b>what should happend</b>, and not actually how it will happen.

If we've had experience querying databases, we might be familiar with the limit and distinct keywords, available in 
many database query languges.

The filter operation represents our where clause, and sorted would be our order by clause, and so on.

There are aggregate functions commonly used in queries as well, such as max, min, count, and so on.