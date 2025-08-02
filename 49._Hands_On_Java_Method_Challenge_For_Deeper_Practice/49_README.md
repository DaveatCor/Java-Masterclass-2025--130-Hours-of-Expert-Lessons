## Method Challenge

In this challenge we're going to create two methods:

<b>The first method</b> should be named <code>displayHighScorePosition</code>.
- This method should have two paramters, one for a player's name, and one for a player's position in a high score list.
- This method should print a message like "Tim managed to get into position 2 on the high score list".

<b>The second mehtod</b> should be named <code>calculateHighScorePosition</code>.
- This method should have only one paramter, the player's score.
- This method should return a number between 1 and 4, based on the score values shown in the table.

| Score | Result|
| -- | -- |
| Score greather than or equal to 1000 | 1 |
| Score greather than or equal to 500 less than 1000 | 2 |
| Score greather than or equal to 100 but less than 500 | 3 |
| All other scores | 4 |

Finally, we'll call both methods and display the results for the following scores: 1500, 1000, 500, 100, and 25.