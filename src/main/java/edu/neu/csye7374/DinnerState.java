package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class DinnerState implements RestaurantState {
    private List<MenuItem> menuItems;

    public DinnerState() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem(1, "Soup", 11.99));
        menuItems.add(new MenuItem(2, "Salad", 12.99));
        menuItems.add(new MenuItem(3, "Steak", 13.99));
        menuItems.add(new MenuItem(4, "Salmon", 14.99));
        menuItems.add(new MenuItem(5, "Chicken", 15.99));
    }

    @Override
    public void showMenu() {
        System.out.println("--- Dinner Menu ---");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }
}