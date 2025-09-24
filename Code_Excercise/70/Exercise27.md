## Coding Exercise 27: Constructing A Diagonal Star Pattern With Loops
Constructing A Diagonal Star Pattern With Loops
Write a method named printSquareStar with one parameter of type int named number. 

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).



EXAMPLE INPUT/OUTPUT:

EXAMPLE 1

printSquareStar(5); should print the following:

→ NOTE: For text in Code Blocks below, use code icon {...}  on Udemy

*****
** **
* * *
** **
*****

Explanation:

*****   5 stars
** **   2 stars space 2 stars
* * *   1 star space 1 star space 1 star
** **   2 stars space 2 stars
*****   5 stars


EXAMPLE 2

printSquareStar(8); should print the following:

********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********


The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):

In the first or last row

In the first or last column

When the row number equals the column number

When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)



HINT: Use a nested loop (a loop inside of a loop).

HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(" "); prints a space and does not "move" to another line.

HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); .

NOTE: The method printSquareStar ​should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.

## Answer
```java
public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int goal = 0;
        boolean evenNumber = number % 2 == 0;

        if (!evenNumber) {
            goal = (int) ((((float) number) / 2) + 0.5);
        } else {
            goal = number / 2;
        }

        for (int i = 1; i <= number; i++) {
            /// First & Last
            if (i == 1 || i == number) {
                for (int j = 1; j <= number; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                continue;
            }
            /// Middle & Odd Number
            if (i == goal && !evenNumber) {
                if (evenNumber) {
                    for (int j = 1; j <= number; j++) {
                        if (j % 2 != 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else {
                    for (int j = 1; j <= number; j++) {
                        if (j == 1 || j == number || j == goal) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.print("\n");
            } else {
                for (int j = 1; j <= number; j++) {
                    /// Row 1 and Last is to be ignored.
                    if (j == 1 || j == number) {
                        System.out.print("*");
                        continue;
                    }
                    /// 2 & length - 2 - Work Well and ignored
                    if (i <= 2 || i >= (number - 1)) {
                        if (j <= 2) {
                            System.out.print("*");
                        } else if (j > (number - 2)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    /// 3 ... length-2
                    else if (evenNumber) {
                        if (i == goal || i == (goal + 1)) {
                            if (j == goal || j == (goal + 1)) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        } else {
                            if ((j == i || (number - j == i - 1)) && (i == j || (number - i == j - 1))) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    } else if (!evenNumber) {
                        if ((j == i || (number - j == i - 1)) && (i == j || (number - i == j - 1))) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
```