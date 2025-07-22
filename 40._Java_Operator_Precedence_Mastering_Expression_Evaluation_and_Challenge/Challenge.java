public class Challenge {
    public static void main(String[] arges){
        // Step 1
        double firstValue = 20.00;
        // Step 2
        double secondValue = 80.00;
        // Step 3
        double result = firstValue + secondValue * 100.00;
        // Step 4
        double remainder = result % 40.00;
        System.out.println("Remainder: " + remainder);
        // Step 5
        boolean isRemainderQualZero = remainder == 0.00;
        // Step 6
        System.out.println(result);
        // Step 7
        if (!isRemainderQualZero){
            System.out.println("got some remainder");
        }
    }
}
