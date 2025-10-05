public class BillsBurgerChallenge {
    public static void main(String[] args) {
        Item116 coke = new Item116("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item116 avocado = new Item116("Topping", "avocado", 1.50);
        avocado.printItem();
    }
}
