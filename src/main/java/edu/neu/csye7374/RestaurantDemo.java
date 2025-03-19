package edu.neu.csye7374;

public class RestaurantDemo {
    public static void demo(){
        RestaurantContext restaurant = new RestaurantContext();

        // Show lunch menu
        System.out.println("--- Lunch Time ---");
        restaurant.showMenu();

        // Switch to dinner state
        restaurant.setState(new DinnerState());
        System.out.println("\n--- Dinner Time ---");
        restaurant.showMenu();

        // Switch to breakfast state
        restaurant.setState(new BreakfastState());
        System.out.println("\n--- Breakfast Time ---");
        restaurant.showMenu();

        // Switch back to lunch state
        restaurant.setState(new LunchState());
        System.out.println("\n--- Back to Lunch Time ---");
        restaurant.showMenu();
    }
}
