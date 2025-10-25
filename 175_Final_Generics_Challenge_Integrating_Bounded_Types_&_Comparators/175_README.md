## Putting it all together, Final Section Challenge
In this challenge, we want to start with some of the cod we just talked about in the last video.

Be sure to start with the `Student` and `LPAStudent` classes, as well as the `QueryItem` interface and `QueryList` class.

In this challenge, you'll want to do the following items:
- Change QueryList to extend ArrayList, removing the items field.
- Add a student id field to the Student class, and implement a way to compare Students, so that students are naturally ordered by a student id.
- Implement at least one other mechanism for comparing Students by course or year, or for LPAStudents, by percent complete.

In this challenge, we'll want to do the following items:
- Override the matchFieldValue method on the LPAStudent class, so that you return students not matched on percent complete equal to a value, but on percent less than or equal to a submitted value.  Note: an LPAStudent - should be searchable by the same fields as Student as well.
- Run your code for 25 random students selecting students who have completed less than or equal to 50% of their course, and print out the list, sorted in at least two ways. First by using List.sort with the Comparator.naturalOrder() comparator, and then using your own Comparator, so first by student id, as well as one of the other ways you selected.
- And be sure to have some fun!

