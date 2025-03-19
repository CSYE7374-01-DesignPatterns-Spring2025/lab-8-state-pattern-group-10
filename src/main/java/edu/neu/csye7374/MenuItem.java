package edu.neu.csye7374;

public class MenuItem {
    private int id;
    private String itemName;
    private double price;

    public MenuItem(int id, String itemName, double price) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + ". " + itemName + " - $" + String.format("%.2f", price);
    }
}