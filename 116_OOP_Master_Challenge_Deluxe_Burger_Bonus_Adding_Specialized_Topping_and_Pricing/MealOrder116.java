public class MealOrder116 {
    private Burger116 burger;
    private Item116 drink;
    private Item116 side;

    public MealOrder116() {
        this("regular", "coke", "fries");
    }

    public MealOrder116(String burguerType, String drinkType, String sideType) {
        if (burguerType.equalsIgnoreCase("deluxe")) {
            this.burger = new Burger116(burguerType, 8.5);
        } else {
            this.burger = new Burger116(burguerType, 4.0);
        }
        this.drink = new Item116("drnk", drinkType, 1.00);
        this.side = new Item116("side", sideType, 1.50);
    }

    public double getTotalPrice() {
        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItem();
        if (burger instanceof DeluxeBurger) {
            Item116.printItem(drink.getName(), 0);
            Item116.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addTopping(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (burger instanceof DeluxeBurger db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addTopping(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
