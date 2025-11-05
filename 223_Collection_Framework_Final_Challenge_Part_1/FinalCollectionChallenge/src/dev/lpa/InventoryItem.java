package dev.lpa;

public class InventoryItem {

    private Product product;
    private double price;
    private int qtyTotal;
    private int qtyReversed;
    private int qtyReorder;
    private int qtyLow;

    public InventoryItem(Product product, double price, int qtyTotal, int qtyLow) {
        this.product = product;
        this.price = price;
        this.qtyTotal = qtyTotal;
        this.qtyLow = qtyLow;
        this.qtyReorder = qtyTotal;
    }

    public Product getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public  boolean reserveItem(int qty){
        if ((qtyTotal - qtyReversed) >=  qty){
            qtyReversed += qty;
            return true;
        }
        return false;
    }

    public void releaseItem(int qty){
        qtyReversed -= qty;
    }

    public boolean sellItem(int qty){
        if (qtyTotal >= qty){
            qtyTotal -= qty;
            qtyReversed -= qty;
            if (qtyTotal <= qtyLow) {
                placeInventoryOorder();
            }
            return true;
        }
        return  false;
    }

    private void placeInventoryOorder(){
        System.out.printf("Ordering qty %d : %s%n", qtyReorder, product);
    }

    @Override
    public String toString(){
        return "%s, $%.2f : [%04d,% 2d]".formatted(product, price, qtyTotal, qtyReversed);
    }
}
