package dev.lpa;

import java.util.*;

public class Store {

    private static Random random = new Random();
    private Map<String, InventoryItem> inventory;
    private NavigableSet<Cart> carts = new TreeSet<>(Comparator.comparing(Cart::getId));
    private Map<Category, Map<String, InventoryItem>> aiSaleInventory;

    public static void main(String[] args) {
        Store myStore = new Store();
        myStore.stockStore();
        myStore.listInventory();

        myStore.stockAisles();
        myStore.listProductsByCategory();

        myStore.manageStoreCarts();
    }

    private void manageStoreCarts(){
        Cart cart1 = new Cart(Cart.CardType.PHYSICAL, 1);
        carts.add(cart1);

        InventoryItem item = aiSaleInventory.get(Category.PRODUCE).get("apple");
        cart1.addItem(item, 6);
        cart1.addItem(aiSaleInventory.get(Category.PRODUCE).get("pear"), 5);
        cart1.addItem(aiSaleInventory.get(Category.BEVERAGE).get("coffee"), 1);
        System.out.println(cart1);

        cart1.removeItem(aiSaleInventory.get(Category.PRODUCE).get("pear"), 2);

        Cart cart2 = new Cart(Cart.CardType.VIRTUAL, 1);
        carts.add(cart2);
        cart2.addItem(inventory.get("L103"), 20);
        cart2.addItem(inventory.get("B100"), 10);
        System.out.println(cart2);

        Cart cart3 = new Cart(Cart.CardType.VIRTUAL, 1);
        carts.add(cart3);
        cart3.addItem(inventory.get("R777"), 998);
        System.out.println(cart3);
        if (!checkOutChart(cart3)){
            System.out.println("Something went wrong, could not check out");
        } else {

        }
    }

    private  boolean checkOutChart(Cart cart){
        for (var cartItem : cart.getProducts().entrySet()){
            var item = inventory.get(cartItem.getKey());
            int qty = cartItem.getValue();

            if (!item.sellItem(qty)) {
                return false;
            }
        }
        cart.printSalesSlip(inventory);
//        carts.remove(cart);
        return true;
    }

    private void abandonCarts(){

    }

    private void listProductsByCategory(){
        listProductsByCategory(true, false);
    }

    private void listProductsByCategory(boolean includeHeader, boolean includeDetail){
        aiSaleInventory.keySet().forEach(k -> {
            if (includeHeader) System.out.println("----------\n" + k + "\n---------");
            if (includeDetail) {
                aiSaleInventory.get(k).keySet().forEach(System.out::println);
            } else {
                aiSaleInventory.get(k).values().forEach(System.out::println);
            }
        });
    }

    private void stockStore(){
        inventory = new HashMap<>();
        List<Product> products = new ArrayList<>(List.of(
            new Product("A100", "apple", "local", Category.PRODUCE),
            new Product("B100", "banana", "local", Category.PRODUCE),
            new Product("P100", "pear", "local", Category.PRODUCE),
            new Product("L103", "lemon", "local", Category.PRODUCE),
            new Product("M201", "milk", "farm", Category.DAIRY),
            new Product("Y001", "yogurt", "farm", Category.DAIRY),
            new Product("C333", "cheese", "farm", Category.DAIRY),
            new Product("R777", "rice chex", "Nabisco", Category.CEREAL),
            new Product("G111", "granola", "Nat Valley", Category.CEREAL),
            new Product("BB11", "ground beef", "butcher", Category.MEAT),
            new Product("CC11", "chicken", "butcher", Category.MEAT),
            new Product("BC11", "bacon", "butcher", Category.MEAT),
            new Product("BC77", "coke", "coca cola", Category.BEVERAGE),
            new Product("BC88", "coffee", "value", Category.BEVERAGE),
            new Product("BC99", "tea", "herbal", Category.BEVERAGE)
        ));

        products.forEach(p -> inventory.put(p.sku(), new InventoryItem(
            p, random.nextDouble(0, 1.25), 1000, 5
        )));
    }

    private void stockAisles(){
        aiSaleInventory = new EnumMap<>(Category.class);
        for (InventoryItem item : inventory.values()){
            Category aisle = item.getProduct().category();
            Map<String, InventoryItem> productMap = aiSaleInventory.get(aisle);
            if (productMap == null) {
                productMap = new TreeMap<>();
            }
            productMap.put(item.getProduct().name(), item);
            aiSaleInventory.putIfAbsent(aisle, productMap);
        }
    }

    private void listInventory(){
        System.out.println("-------------------------");
        inventory.values().forEach(System.out::println);
    }
}
