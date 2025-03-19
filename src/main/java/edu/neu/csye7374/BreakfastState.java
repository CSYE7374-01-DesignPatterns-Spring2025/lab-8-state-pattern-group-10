package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class BreakfastState implements RestaurantState {
    private List<MenuItem> menuItems;

    public BreakfastState() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem(1, "Pancakes", 5.99));
        menuItems.add(new MenuItem(2, "Omelette", 6.99));
        menuItems.add(new MenuItem(3, "Waffles", 7.99));
    }

    @Override
    public void showMenu() {
        System.out.println("--- Breakfast Menu ---");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }
}