## Mini Challenges
It's time for some mini regular expression's challenges.

There's almost always more than one way, to write a regular expression that will match what you want.

## Mini Challenge 1
Write a regular expression that matches the exact sentence "Hello, World!".

Use the matches method on String to check if the input sentence matches this pattern.

Use only literal characters in the regular expression.

## Mini Challenge 2
Create a regular expression that matches a sentence starting with an uppercase letter, followed by <b>zero or more lowercase letters, and ending with a period.</b>

For example, `"The bike is red."`, or, "I am a new student.", should match your regular expression.

The sentences `"hello World."` or "How are you?" should not.

Use the matches method to verify the pattern on each of these examples.

## Mini Challenge 3
In this challenge, I want you to modify the requirements to Challenge 2 slightly, matching sentences that end in different punctuation marks, but still maintaining the other criteria.

In other words, the sentence should start with a word beginning with a capital letter, followed by one or more words separated by spaces, and end with either an exclamation mark, question mark, or period.

In addition, punctuation marks within the sentence should be permitted, as are capital letters and abbreviations.
Modify your sentences to be
- The bike is red, and has flat tires.
- I love being a new L.P.A. student!
- Hello, friends and family: Welcome!
- How are you, Mary?