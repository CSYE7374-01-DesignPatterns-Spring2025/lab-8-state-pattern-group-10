package edu.neu.csye7374;

public class RestaurantContext {
    private RestaurantState currentState;

    public RestaurantContext() {
        // Default state is Lunch
        this.currentState = new LunchState();
    }

    public void setState(RestaurantState state) {
        this.currentState = state;
    }

    public void showMenu() {
        currentState.showMenu();
    }
}