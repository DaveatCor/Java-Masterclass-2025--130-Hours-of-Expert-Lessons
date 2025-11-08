## The Collect method
The Collect method has two overloaded version.

The first can be used by passing it the result of any of the many factory methods on the 
Collectors class.

asList and asSet, as two examples of static methods on that class.

The second is more complex, but gives us ultimate flexibility, as we saw with the TreeSet example.

| Return Type | Method Parameters                                                                                        |
| - |----------------------------------------------------------------------------------------------------------|
| R<br>R | collector(Collector collector)<br>collect(Supplier supplier, BiConsumer accumulator, BiConsumer combine) |