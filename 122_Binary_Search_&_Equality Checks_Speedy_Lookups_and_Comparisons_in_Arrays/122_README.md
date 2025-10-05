## Finding a match
There are different alogithms for searching and matching elements in arrays.

## Searching Sequentially
We can probably imagine that if we wre going to start writing code to do this, we might start looping from the first to the last element of an array, checking each element to see if it matches a value that we're looking for.

If we find a match, we'd stop looping and return that a match was found, either with the positioin we found the element at our just a boolean value: true if it was found, and false if not.

This is called linear or sequential search because we're stepping through the eleemnts one after another.

If our elements are sorted, using this type of linear search is unnecessarily inefficient.

## Using intervals to Search
You split each section up, testing the values at the boundaries, and based on that, split again into smaller sections, narrowing the number of elements to test each time.

This type of searching in software is called <b>interval searching</b>.

Within these two categories, sequential and interval, there are numerous existing algorithms.

One of the most common interval searches in the <b>binary Search</b>, which is why Java provides this search on so many of its collection classes.

In this search, <b>interval</b> are continually <b>split into two</b>, hence the word binary.

## Arrays.binarySearch
The static method, binarySearch, is in the Arrays class.

We can use this method to test if a value is already in our array, but there are some <b>important</b> things to remember.
- First, the array has to be <b>sorted</b>.
- Second, if there are duplicate values in the array, there's no guarantee which one it'll match on.
- Finally, elements must be comparable. Trying to compare instances of different types will lead to errors and invalid results.

This method returns:
- <b>The position of a match</b>, if found.
- It returns a <b>-1</b> when <b>no match</b> was found.
- It's important to remember that a positive number </b>may not be the position of the first match</b>.
- If our array has duplicate values and we need to find the first element, other methods should be used.