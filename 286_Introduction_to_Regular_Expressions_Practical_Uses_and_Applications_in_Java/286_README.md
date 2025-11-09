## Regular Expression Introduction
In this section we'll talk about regular expressions.

Regular expressions are a way to describe a string or a pattern.

We've probably already used regular expressions, possibly without actually knowing it.

Or maybe we've had some experience with them in another programming language, or 
we've used them in an editor.

Perhaps we've even tries using them with Intellij's editor, which supports them.

We might also remember that some methods in the String class, accept a regular
expression as a parameter.

For example the <b>matches<b> method, that <b>replaceAll</b> and <b>replaceFirst</b> methods, as well as
the <b>split</b> methods, all work with regular expressions

These expressions are often used to seach strings for a specific pattern, or to vallidate data.

As an example, we may want to verify that a user has provided an email address using a
valid email address format.

We can do this by checking the input against a regular expression pattern, that describes
how an email address string should look.

Regular expressions can also be very useful for parsing log files, to extract or search for 
specific types of information.

Anyone who's supported production applications probably has some experience searching
log files for a targeted user's session, when trying to track down a complaint, or problem.