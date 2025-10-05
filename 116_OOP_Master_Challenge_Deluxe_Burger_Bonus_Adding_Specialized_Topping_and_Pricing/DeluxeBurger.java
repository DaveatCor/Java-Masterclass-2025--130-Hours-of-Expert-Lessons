public class DeluxeBurger extends Burger116 {

    Item116 deluxe1;
    Item116 deluxe2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addTopping(extra1, extra2, extra3);
        deluxe1 = new Item116("TOPPING", extra4, 0);
        deluxe2 = new Item116("TOPPING", extra5, 0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();

        if (deluxe1 != null) {
            deluxe1.printItem();
        }
        if (deluxe2 != null) {
            deluxe2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }

}
