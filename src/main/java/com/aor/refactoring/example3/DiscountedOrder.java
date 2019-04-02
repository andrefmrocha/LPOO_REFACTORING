package com.aor.refactoring.example3;

public class DiscountedOrder extends SimpleOrder {
    private Discount discount;

    public DiscountedOrder(double price, Discount discount) {
        super(price);

        this.discount = discount;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public double getTotal() {
        return discount.applyDiscount(super.getTotal());
    }
}
