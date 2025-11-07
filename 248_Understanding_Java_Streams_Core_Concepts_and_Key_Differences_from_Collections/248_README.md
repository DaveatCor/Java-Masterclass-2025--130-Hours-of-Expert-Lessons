## Java Streams - What they are and what they aren't
When we think of a stream, we might be thinking of I/O streams, like a buffered input stream or file output.

That isn't the type of stream we're talking about here.

Oracle's Java docs describe a stream as

| Stream |
| - |
| A Sequence of elements supporting sequential and parallel aggregate operations.|

Streams are a mechanism for describing a whole series of processes, before actually executing them.

## A Stream is different from a Collection
The stream and the collection types were designed for different purposes.

A <b>collection</b> is used to <b>store and manage a series of elements<>/b in Java, providing <b>direct access<b>

We can use collections to manipulate or query a set of data.

There's nothing we can do with a stream, that we couldn't already do with a Collection.

However, a <b>stream</b> was designed to <b>manage the processing of elements.</b>

Streams don't actually store elements, instead these elements are computed on demand, from a data providing source.

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html

## The Lazy Stream
Another important different is that streams are lazy, like lamda expression variables.

When we call many of the methods on a stream, execution may not immediately occur.

Instea, we'll need to invoke a special operation on the stream, like we would by calling a lambda's functional method.

This special operation is called a terminal operation.

## Why use a Stream?
Streams are an excisting additional to Java, because they provide several benefits.
- First, they make the code to process data uniform, concise and repeatable, in ways that feel similar to a database's structured
query language (SQL).
- Second, when working with large collections, paralell streams will provide a performance advantage.

All the code samples we've provided up to this point, using collections, will continue to be valuable for many use cases.

