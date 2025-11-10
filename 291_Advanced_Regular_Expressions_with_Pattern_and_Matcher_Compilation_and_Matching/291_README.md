## What does it mean to Compile a Regular Expression?
The string containing the expression is passed to the compile method of a Pattern class,
which returns a Pattern instance.

This string, the regular expression, is said to be <b>compiled into a Pattern</b> by Java's regular
expression processor.

This compilatioin process consists of
- Checking the string for syntactical correctness.
- Building an internal representation consisting of a decision tree made up of nodes and
boolean decision points, derived from the various parts of the regular expression.
- Optimizing the pattern, by simplifying the expression and eliminating redundancies. This
process increase the effeciency of matching the expression to character sequences.

## Adventages of the Pattern Instance
By compiling regular expressions into Pattern objects, we benefit from improved 
performance and code efficiency, on subsequent matcing.

The compiled pattern can be reused across multiple matching operations, saving
computational resources, and reducing processing time.

## Matcher class advantages
In addition to matching on the entire input, Matcher offers two other operations for b<b>partial matching</b>.

These methods are <b>lookingAt</b>, and overloaded versions of the <b>find</b> method.

Matcher supports <b>capturing groups</b> and granting access to the text within the group,
which we haven't yet covered, but which will shortly.

Matcher can be reused for multiple match operations on different String inputs, meaning
the pattern doesn't have to be recompiled.

An instance of a Matcher class <b>has state</b>, which change as operations are performed on it.

This means the Matcher class is <b>not threat safe.</b>

It also means state may need to be reset, before a new String is evaluated.

## Greedy and Reuctant Regular Expressions
<b>Greedy</b> regular expressions match as <b>many</b> charactesr as possible.

The expression `.*.` which is a greedy expression, matches any number of characters.

<b>Reluctant</b> regular expressions, on the other hand, match as <b>few</b> characters as possible
from the input text.

The regular expression `.*?` matchs any number of characters, but stops at the earliest
sucessful point, where the overall pattern is matched.

The default type of regular expression is greedy.

We can use the ? to be quantifier modifier, making the regular expression reluctant.