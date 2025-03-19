package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class LunchState implements RestaurantState {
    private List<MenuItem> menuItems;

    public LunchState() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem(1, "Hot Dog", 1.99));
        menuItems.add(new MenuItem(2, "Salad", 2.99));
        menuItems.add(new MenuItem(3, "Hamburger", 3.99));
    }

    @Override
    public void showMenu() {
        System.out.println("--- Lunch Menu ---");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }
}
