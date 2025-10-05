public class BillsBurgerChallenge {
    public static void main(String[] args) {
        Item115 coke = new Item115("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item115 avocado = new Item115("Topping", "avocado", 1.50);
        avocado.printItem();
    }
}
