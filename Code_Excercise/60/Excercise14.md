## Coding Exercise 14: Computing Month Length With Leap Year Consideration

If parameter year is < 1 or > 9999 then return -1.

This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

You should check if the year is a leap year using the method isLeapYear described above.

Examples of input/output:

getDaysInMonth(1, 2020); → should return 31 since January has 31 days.

getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.

getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.

getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.

getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.


HINT: Use the switch statement.

NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have been doing so far in the course.

NOTE: Do not add a main method to solution code.

### Answer:
```java
public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) {
            return false;
        }
        
        if (year % 4 == 0 && year % 100 != 0){
            return true;
        }
        
        if (year % 400 == 0) {
            return true;
        }
        
        return false;
    }
    
    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        
        if (month == 2){
            return isLeapYear(year) ? 29 : 28;
        }
        
        if (month <= 7) {
            return month % 2 == 0 ? 30 : 31;
        }
        
        return month % 2 == 0 ? 31 : 30;
    }
}
```