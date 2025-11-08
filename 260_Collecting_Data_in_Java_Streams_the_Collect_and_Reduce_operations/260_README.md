## Additional Terminal (Reduction) Operations
<b>Reduction operations</b> combine the contents of a stream, to return a value, or they can return a collection.

On this slide, some additional terminal operations, and their return types and signature.

| Return Type               | Terminal Opeartions                                                                                                                                                                |
|---------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| R<br>R                    | collection(Collector<? superT,A,R> collector)<br>collection(Supplier<R> supplier, BiConsumer<R, ? superT> accumulator, BiConsumer<R,R> combiner                                    |
| Optional<T><br>T<br><U> u | reduce(BinaryOperation<T> accumulator)<br>reduce(T identity, BinaryOperator<T> accumulator<br>reduce(U identity, BiFunction<U, ? superT,U> accumulator, BinaryOperator<U> combiner |
| Object[]<br><br>A[]       | toArray()<br>toArray(IntFunction<A[]> generator                                                                                                                                    |
| List<T>                   | toList()                                                                                                                                                                           |

## Revised View of Transformative Operations
There is one interface we haven't talked about yet, and that's the Collector.

This is not a functional interface, but there are helper methods on another class, called 
Collectors that provide these special type.

| Return Type               | Terminal Opeartions                                                                                                                                                                |
|---------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| R<br>R                    | collection(Collector<? superT,A,R> collector)<br>collection(Supplier<R> supplier, BiConsumer<R, ? superT> accumulator, BiConsumer<R,R> combiner                                    |
| Optional<T><br>T<br><U> u | reduce(BinaryOperation<T> accumulator)<br>reduce(T identity, BinaryOperator<T> accumulator<br>reduce(U identity, BiFunction<U, ? superT,U> accumulator, BinaryOperator<U> combiner |
| Object[]<br><br>A[]       | toArray()<br>toArray(IntFunction<A[]> generator                                                                                                                                    |
| List<T>                   | toList()            |

Interface Collector Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collector.html

