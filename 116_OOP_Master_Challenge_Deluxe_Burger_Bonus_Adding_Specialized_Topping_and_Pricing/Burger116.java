public class Burger116 extends Item116 {
    private Item116 extra1;
    private Item116 extra2;
    private Item116 extra3;

    public Burger116(String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public double getAdjustedPrice() {
        var ex1 = (extra1 == null) ? 0 : extra1.getAdjustedPrice();
        var ex2 = (extra1 == null) ? 0 : extra1.getAdjustedPrice();
        var ex3 = (extra1 == null) ? 0 : extra1.getAdjustedPrice();

        return getBasePrice() + ex1 + ex2 + ex3;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }

    public void addTopping(String extra1, String extra2, String extra3) {
        this.extra1 = new Item116("TOPPING", extra1, getExtraPrice(extra1));
        this.extra2 = new Item116("TOPPING", extra2, getExtraPrice(extra2));
        this.extra3 = new Item116("TOPPING", extra3, getExtraPrice(extra3));
    }

    public void printItemizedList() {
        printItem("Base BURGER", getBasePrice());
        if (extra1 != null) {
            extra1.printItem();
        }

        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }

}
