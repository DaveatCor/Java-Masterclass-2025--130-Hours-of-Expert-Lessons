## The Set
A Set is not implicitly ordered.

A Set contains no duplicates.

A Set may contain a single null element.

Sets can be useful because operations on them are very fast.

## Set methods
The set interface defines the basic methods, <b>add, remove and clear</b>, to maintain the items in the set.

We can also check if a specific item is in the set using the contains method.

Interestingly engough, there's no way to retreive an item from a set.

We can check if something exists, using <b>contains</b>, and we can iterate over all the elements in the set, but attempting to get the 10th elements, for example, from a set isn't possible with a single method.

## The HashSet class
The best-performing implementation of the Set interface is the <b>HashSet class.</>

This class uses hashing mechanisms to store the items.

This means the hash code method is used to support even distributions of objects in the set.

Oracle describes this class as offering constant time performance for the basic operations (add, remove, contains and size).

This assumes the hash function disperses the elements properly among the buckets.

Constant time has the Big O Notation O(1).

Although we haven't covered the Map and HashMap types yet, the HashSet actually uses a HashMap in its own implementation, as of JDK 8.