package dev.lpa;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    enum CardType {PHYSICAL, VIRTUAL};

    private static int lastId = 1;
    private static int id;
    private LocalDate cartDate;
    private CardType type;
    private Map<String, Integer> products;

    public int getId() {
        return id;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public Cart(CardType type, int days) {
        this.type = type;
        id = lastId++;
        cartDate = LocalDate.now().minusDays(days);
        products = new HashMap<>();
    }

    public Cart(int id){
        this.id = id;
    }

    public LocalDate getCartDate() {
        return cartDate;
    }

    public void addItem(InventoryItem item, int qty){
        products.merge(item.getProduct().sku(), qty, Integer::sum);
        if (!item.reserveItem(qty)){
            System.out.println("Ouch, something went wrong, could not add item");
        }
    }

    public  void removeItem(InventoryItem item, int qty){
        int current = products.get(item.getProduct().sku());
        if (current <= qty){
            qty = current;
            products.remove(item.getProduct().sku());
            System.out.printf("Item [%s] removed from backet%n", item.getProduct().name());
        } else {
            products.merge(item.getProduct().sku(), qty, (oldValue, newValue) -> {
                return oldValue - newValue;
            });
            System.out.printf("%d [%s]s removed%n", qty, item.getProduct().name());
        }
        item.releaseItem(qty);
    }

    public  void printSalesSlip(Map<String, InventoryItem> inventory) {
        double total = 0;
        System.out.println("--------------------------");
        System.out.println("Thank you for our sale: ");
        for (var cardItem : products.entrySet()){
            var item = inventory.get(cardItem.getKey());
            int qty = cardItem.getValue();
            double itemizedPrice = (item.getPrice() * qty);
            total += itemizedPrice;
            System.out.printf("\t%s %-10s (%d)@ $%.2f = $%.2f%n", cardItem.getKey(), item.getProduct().name(), qty, item.getPrice(), itemizedPrice);

        }
        System.out.printf("Total Sale: $%.2f%n", total);
        System.out.println("--------------------------");
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", cartDate=" + cartDate +
                ", products=" + products +
                '}';
    }
}
