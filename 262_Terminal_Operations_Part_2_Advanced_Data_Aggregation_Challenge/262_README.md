## Challenge, Use terminal operations to select specific students
Create a new class called <b>MainChallenge</b>, with a main method that does the following:
- Copy the two courses, jmc and pymc, from the MainCollect's main method, passing both an additional argument for the lecture count. 50 for pymc, and 100 for jmc.
- Add a third course, titled "Creating Games in Java".   You don't have to pass a lecture count for this one.
- Use Stream.generate or Stream.iterate to generate 5000 random students and create a list of these.
- Use the getPercentComplete method, to calculate the average percentage completed for all students for just the Java Masterclass, using the reduce terminal operation.
- Use this result, multiplying it by 1.25, to <b>collect</b> a group of students (either as a list, or a set).  These would be the students who've completed more than three quarters of that average percentage.
- Sort by the longest enrolled students who are still active, because you're going to offer your new course to 10 of these students, for a trial run.
- Add the new course to these ten students.  
Make one change to the Student's getRandomStudent method, using a <b>minimum lecture of 30</b>.