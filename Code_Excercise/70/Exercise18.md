## Coding Exercise 18: Calculating The Sum Of All Even Digits In An Integer

Calculating The Sum Of All Even Digits In An Integer
Write a method named getEvenDigitSum with one parameter of type int called number. 

The method should return the sum of the even digits within the number. 

If the number is negative, the method should return -1 to indicate an invalid value.



EXAMPLE INPUT/OUTPUT:

getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20

getEvenDigitSum(252); → should return 4 since 2 + 2 = 4

getEvenDigitSum(-22); → should return -1 since the number is negative



NOTE: The method getEvenDigitSum ​should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.

## Answer
```java
public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        
        if (number < 0){
            return -1;
        }
        
        int sum = 0;
        while (number > 0){
            int temp = number % 10;
            if (temp % 2 == 0) {
                sum += temp;
            }
            number /= 10;
        }
        return sum;
    }
}
```