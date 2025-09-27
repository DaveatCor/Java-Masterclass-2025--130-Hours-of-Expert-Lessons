public class ClassChallenge {
    public static void main(String[] args) {
        // Account bobsAccount = new Account("12345", 1000.00, "Bob Brown",
        // "myemail@bob.com", "(087) 123-4567");

        Account bobsAccount = new Account();

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("myemail@bob.com");
        bobsAccount.setCustomerEmail("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.despositFunds(250.0);
        bobsAccount.withdrawFunds(50.0);

        bobsAccount.withdrawFunds(200);

        bobsAccount.despositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.err.println("AccountNo: " + timsAccount.getNumber() + "; name " + timsAccount.getCustomerName());
    }
}
