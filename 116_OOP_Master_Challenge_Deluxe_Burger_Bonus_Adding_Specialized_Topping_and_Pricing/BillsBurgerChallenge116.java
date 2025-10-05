public class BillsBurgerChallenge116 {
    public static void main(String[] args) {
        // Item115 coke = new Item115("drink", "coke", 1.50);
        // coke.printItem();
        // coke.setSize("LARGE");
        // coke.printItem();

        // Item115 avocado = new Item115("Topping", "avocado", 1.50);
        // avocado.printItem();

        // Burger115 burger115 = new Burger115("regular", 4.00);
        // burger115.addTopping("BACON", "CHEESE", "MAYO");
        // burger115.printItem();

        // MealOrder regularMeal = new MealOrder();
        // regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        // regularMeal.setDrinkSize("LARGE");
        // regularMeal.printItemizedList();

        // MealOrder116 secondMeal = new MealOrder116("turkey", "7-up", "chili");
        // secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        // secondMeal.printItemizedList();

        MealOrder116 deluxeMeal = new MealOrder116("deluxe", "7-up", "chilli");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");

        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();

    }
}
