## The Stream Source Challenge
In the last video, I reviewed the following methods to generate a Stream.

![image_1.png](image_1.png)

In this coding challenge, you'll be using most of these methods to set up a few streams of your own.

Generate the bingo ball labels as 5 different streams, using different Stream creation methods for each.

Assign each pipeline to a stream variable.

Concatenate the five streams together.

Apply the terminal operation, forEach, to the final concatenated stream, to print each label.

These should be printed in order as follows.
- B1-B15
- I16-I30
- N31-N45
- G45-G60
- O61-O75

Remember that the <b>map</b> intermediate operation takes a Function, so you can return a different type, than the input stream element.

To do this, you'd use map to return a String, by executing a method or expression that takes an integer and returns a String.

The generate method may be difficult to use without creating side effects, or using other intermediate operations I haven't yet mentioned, but if you want a good challenge, you can play around with this one.

It's time for you to give this a try, and when you're ready, come back, and we can walk through my solution together.