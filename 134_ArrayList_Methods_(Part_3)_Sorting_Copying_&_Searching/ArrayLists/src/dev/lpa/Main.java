package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apple", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("orange", "PRODUCE", 5);

        System.out.println(Arrays.toString(groceryArray));

        ArrayList objArrayList = new ArrayList();
        objArrayList.add(new GroceryItem("Butter"));
        objArrayList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("milk", "PRODUCE", 5));

        groceryList.add(0, new GroceryItem("milk", "PRODUCE", 5));

        groceryList.set(0, new GroceryItem("apples", "PRODUCE", 6));

        groceryList.remove(1);

        System.out.println(groceryList);
    }
}
