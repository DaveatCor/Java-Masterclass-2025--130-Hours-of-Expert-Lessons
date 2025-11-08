## The flatMap operation
The flatMap intermediate operation performs one-to-many transactions on elements in a stream pipline.

It's called flatMap, because it flattens results from a hierarchical collection, into on stream of uniformly typed 
elements.

The difference is in the return type of the function.

For map, we return a different instance of an object.

In this case, we're exchanging one tpye for another, for each element on the stream.

For flatMap, we return a Stream, which means we're exchanging one element for a stream of elements back.

|             |  | |
|-------------|--| - |
| Stream< R > | map(Function<T, R> mapper) | flatMap(Function(T, Stream> mapper) |