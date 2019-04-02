package com.aor.refactoring.example3;

public class SimpleOrder {
    private Discount discount;
    private double price;

    public SimpleOrder(double price) {
        this.price = price;
    }

    public double getTotal() {
        return price;
    }
}
