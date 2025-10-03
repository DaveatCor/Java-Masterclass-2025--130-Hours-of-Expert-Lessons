public class CompositionChallenge {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        // kitchen.getBrewMaster().setHaswordTodo(true);
        // kitchen.getIceBox().setHaswordTodo(true);
        // kitchen.getBrewMaster().setHaswordTodo(true);

        // kitchen.getDishWasher().doDishes();
        // kitchen.getIceBox().orderFood();
        // kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchWorkd();
    }
}
