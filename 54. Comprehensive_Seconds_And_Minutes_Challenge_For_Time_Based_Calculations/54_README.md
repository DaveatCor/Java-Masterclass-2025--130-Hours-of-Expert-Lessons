## Seconds And minutes Challenge

In this challenge, we're going to create a method, that takes time, representated in seconds, as the parameter.

We'll then want to transform the seconds into hours.

Next, we'll display the time in hours with the remaining minutes and seconds in a String.

We'll do this transformation in two steps, which allows us to use overloaded methods.

We want to create two methods with the same name: getDurationString
- The first methods has one paramter of type int, named seconds.
- The second method has two paramters, named minutes and seconds, both ints.
- Both methods return a String int the format shown:

    <b> 'XXh YYm ZZs'</b>

    where XX represents the number of hours, YY the number of minutes, and ZZ the number of seconds.

Add validation to the methods as a bonus:
- For the first method, the seconds parameter should be >= 0.
- For the second method, the minutes parameter should be >= 0, and the seconds parameter should be >= 0, and <= 59.
- If either method is passed an invalid value, print out some type of meaningful meassage to the user.