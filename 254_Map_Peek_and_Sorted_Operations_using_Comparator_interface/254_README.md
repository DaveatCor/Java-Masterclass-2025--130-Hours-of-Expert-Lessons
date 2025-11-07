## Intermediate Operations that operate on every element

| Return Type | Operation                                            | Description                                                                                                                                                                                                                                  |
|-------------|------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Stream<R>   | map(Function<? super T,? extends R> mapper)          | This is a function applied to every element in the<br>stream. Because it's a function, the return type<br>can be different, which has the effect of transforming the stream to a different stream of different types.                        |
| Stream<T>   | peek(Consumer<? super T> action)                     | This function doesn't change the stream, but<br>allows us to perform some interim consumer<br>function while the pipeline is processing.                                                                                                     |
| Stream<T>   | sorted()<br>sorted(Comparator<? super T> comparator) | There are two versions of sorted.<br><br>The first uses the naturalOrder sort, which means<br>elements in the Stream must implement Comparable.<br><br>If our elements don't use Comparable, we'll want to use sorted and pass a Comparator. |

## Primitive Streams
In addition to the generic Stream, that lets us stream any reference type, Java has three primitive streams.

| Special Primitive Streams | Mapping from Reference Type to Primitive        | Mapping from Primitive Stream to Referenec Type       |
|---------------------------|-------------------------------------------------|-------------------------------------------------------|
| DoubleStream              | mapToDouble(ToDoubleFunction<? super T> mapper) | mapToObj(DoubleFunction<? extends U> mapper)          |
| IntStream                 | mapToInt(ToIntFunction<? super T> mapper)       | mapToObj(IntFunction<? extends U> mapper)<br>boxed()  |
| LongStream                | mapToLong(ToLongFunction<? super T> mapper)     | mapToObj(LongFunction<? extends U> mapper)<br>boxed() |