package org.example.two;

class Product {
    private String type;
    private double price;
    private boolean discountApplicable;

    public Product(String type, double price, boolean discountApplicable) {
        this.type = type;
        this.price = price;
        this.discountApplicable = discountApplicable;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscountApplicable() {
        return discountApplicable;
    }

    public void applyDiscount() {
        if(discountApplicable) {
            price = price * 0.9;
        }
    }
    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

