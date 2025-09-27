public class ConstructorChallenge {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 1000, "time@email.com");

        System.err.println(customer.getName());
        System.err.println(customer.getCreditLimit());
        System.err.println(customer.getEmail());

        Customer secondCustomer = new Customer();

        System.err.println(secondCustomer.getName());
        System.err.println(secondCustomer.getCreditLimit());
        System.err.println(secondCustomer.getEmail());

        Customer thirdCustomer = new Customer();

        System.err.println(thirdCustomer.getName());
        System.err.println(thirdCustomer.getCreditLimit());
        System.err.println(thirdCustomer.getEmail());
    }
}
