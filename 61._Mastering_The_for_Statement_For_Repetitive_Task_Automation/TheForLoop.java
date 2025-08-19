public class TheForLoop {
    public static void main(String[] args) {
        for (int count = 1; count <= 5; count++) {
            System.out.println(count);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            System.out.println("10,000 at " + rate + "% interest = " + calculateInterest(10000, rate));
        }

        for (double i = 7.5; i <= 10; i += 0.25) {
            double interestAmount = calculateInterest(100.0, i);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}