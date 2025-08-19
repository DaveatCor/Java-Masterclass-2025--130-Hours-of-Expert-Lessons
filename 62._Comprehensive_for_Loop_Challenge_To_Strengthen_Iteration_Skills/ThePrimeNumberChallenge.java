public class ThePrimeNumberChallenge {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number i" + i + " is a prime number");
                count++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber < 2) {
            return wholeNumber == 2;
        }

        for (int divider = 2; divider < wholeNumber; divider++) {
            if (wholeNumber % divider == 0) {
                return false;
            }
        }
        return true;
    }
}