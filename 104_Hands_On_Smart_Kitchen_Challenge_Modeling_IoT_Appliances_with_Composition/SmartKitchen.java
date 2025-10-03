public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        brewMaster.setHaswordTodo(coffeeFlag);
        iceBox.setHaswordTodo(fridgeFlag);
        dishWasher.setHaswordTodo(dishWasherFlag);
    }

    public void doKitchWorkd() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker {
    private boolean hasWordTodo;

    public void setHaswordTodo(boolean hasWordTodo) {
        this.hasWordTodo = hasWordTodo;
    }

    public void brewCoffee() {
        if (hasWordTodo) {
            System.out.println("Brewing Coffee");
            hasWordTodo = false;
        }
    }
}

class Refrigerator {
    private boolean hasWordTodo;

    public void setHaswordTodo(boolean hasWordTodo) {
        this.hasWordTodo = hasWordTodo;
    }

    public void orderFood() {
        if (hasWordTodo) {
            System.out.println("Ordering Food");
            hasWordTodo = false;
        }
    }
}

class DishWasher {
    private boolean hasWordTodo;

    public void setHaswordTodo(boolean hasWordTodo) {
        this.hasWordTodo = hasWordTodo;
    }

    public void doDishes() {
        if (hasWordTodo) {
            System.out.println("Washing Dishes");
            hasWordTodo = false;
        }
    }
}
