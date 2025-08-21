public class ReadingUserInput {
    public static void main(String[] args) {
        // int currentYear = 2022;
        // String userDateOfBirth = "1999";

        // int dateOfBirth = Integer.parseInt(userDateOfBirth);

        // System.out.println("Age = " + (currentYear - dateOfBirth));

        // String usersAgeWithPartialYear = "22.5";
        // double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        // System.out.println("The user says he's " + ageWithPartialYear);

        int currentYear = 2025;

        System.out.println(getInputFromConsole(currentYear));

        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = Integer.parseInt(dateOfBirth);
        if (age > currentYear) {
            return "Incorrect input";
        }
        return "So you are " + (currentYear - age) + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        return "";
    }
}
