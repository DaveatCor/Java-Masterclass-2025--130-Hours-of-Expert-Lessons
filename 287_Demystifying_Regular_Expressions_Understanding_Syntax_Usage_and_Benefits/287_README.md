## What's a Regular Expression?
A regular expression is simply text.

It may contain <b>characters or character combinations</b> that have <b>special meaning</b>

These are calleed <b>metacharacters</b>.

These combinations are interpreted by a regular expression <b>pattern processor</b>.

Most patterns we'll need, have already been written, and we'll find these with an internet search.

| Patter for: | Regular Expression | Examples of Match(es)                                                |
| - | - |----------------------------------------------------------------------|
| U.S. Phone Number | \\([0-9]{3}\\) [0-9]{3}-[0-9]{4} | (800) 123-4567                                                       |
| HTML Tag | <(\\w+)[^>]*>([^\\v</>]*)(</\\1>)* | < hr >Title< /h1 ><br>< br/ ><br>< h2 class="red">Hello World< /h2 > |

## Regular Expression
They are big time-savers!

We don't always have to write a lot of looping and parsing code.

We can use a regular expression to do this work, with just a couple of lines of code.

There are perfect reasons to use regular expressions.
- Verify something is formatted correctly.
- Find occurence of patterns in text.
- Replace mathcing occurences of patterns in text.
- Extract matching occurences from text.
- Split our text by a pattern.

## Ways to use Regalar Expressions in Java
There are classe with methods that take regular expression strings or patterns as
paramters. A few of these are:

```java
String, Scanner, Formatter, DateTimeFormatter, Duration
```

There are also special classes in the java.util.regex package, to help we implement our own functionality.

```java
Pattern, Matcher.
```

## String's methods which use regular expressions
They can all be used with a String literal that doesn't have any of the special character sequences.

They become very powerful though, when we pass regular expression patterns to them.

| Result   | Method Name                                     |
|----------|-------------------------------------------------|
| boolean  | matches(String regex)                           |
| String   | replaceAll(String regex, String replacemenet)   |
| String   | replaceFirst(String regex, String replacemenet) |
| String[] | split(String regex)                             |
| String[] | split(String regex, int limit)                  |
