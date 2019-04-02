package com.aor.refactoring.example1;

public class OrderLine {
    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
    public String getInformation() {
        return this.getProduct().getName() + "(x" + this.getQuantity() + "): " + (this.getProduct().getPrice() * this.getQuantity()) + "\n";
    }
}
