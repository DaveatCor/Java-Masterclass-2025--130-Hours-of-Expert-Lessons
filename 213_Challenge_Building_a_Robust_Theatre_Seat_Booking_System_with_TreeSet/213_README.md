## The TreeSet Challenge (Theatre Seating)
In this challenge, you'll be creating a Theatre class that has a Set of Seats.

The Seat class should be a nested class on the Theatre class.

A Seat should be constructed with a row character and an integer that represents the seat number within the row.

Each Seat should have a String and a seat number, in the format 'A005', where A is the row number, and 005 is the seat number within the row, and it should be zero padded up to three digits.

Seat should also have a field, a boolean, indicating if the seat is reserved or not.

The Theatre class should have three fields, theatre name, an integer for seats in each row, how many seats are in a single row in other words, and a field for the seats themselves.

This last field should be a TreeSet.

A Theatre instance should be constructed with the theatre name, the number of rows in the theatre, and the number of seats total in the theatre.

For simplicity, assume there are a uniform number of seats in every row, and the number of rows should never exceed 26, so the rows will be labeled A through Z.

You should create the seats and number them, as part of the initialization of a Theatre class.

The Theatre class should also have a printSeatMap method, that prints each seat, with each row printed on a separate line.

You should allow a booking agent to reserve a single seat, and the printedSeatMap method should show which seats are reserved.

## The Theatre Challenge Bonus

If you want an extra challenge, create a second method on Theatre, that lets an agent specify:
- The number of reservations being requested.
- A range of rows (from A to C for example, for front row seats).
- A range of seats (a number greater than or equal to 1, and less than or equal to the total number of rows per seat).
  The seats that get reserved should be contiguous within a row.
