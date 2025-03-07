package org.example.enums;

public enum Plan {
    BASIC("Basic Plan",100),
    PREMIUM("Premium Plan",200),
    ULTIMATE("Ultimate Plan",300);

private final String name;
private final int price;

Plan(String name, int price){
    this.name = name;
    this.price = price;
}
    @Override
    public String toString() {
        return name + " (Price: " + price + ")";
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    }

