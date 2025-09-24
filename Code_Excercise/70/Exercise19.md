## Coding Exercise 19: Checking For A Shared Digit Between Two Numbers

Checking For A Shared Digit Between Two Numbers
Write a method named hasSharedDigit with two parameters of type int. 

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.



EXAMPLE INPUT/OUTPUT:

hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers



NOTE: The method hasSharedDigit​ should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.

## Answer
```java
public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second){
        if (first < 10 || first > 99){
            return false;
        }
        
        if (second < 10 || second > 99){
            return false;
        }
        
        boolean isAppearsBoth = false;
        
        int f1 = first % 10;
        int f2 =  first /= 10;
        
        int s1 = second % 10;
        int s2 = second /= 10;
        
        if (f1 == s1 || f1 == s2){
            isAppearsBoth = true;
        } else if (f2 == s1 || f2 == s2){
            isAppearsBoth = true;
        }
        
        
        return isAppearsBoth;
    }
}
```