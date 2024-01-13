package org.launchcode;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    // Allow for default constructor. We don't need a constructor. Because we do not need to have any parameters to passed in when we create a menu.


    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourse = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourse.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nTONY'S PIZZA MENU\n" +
                "-----------------\n" +
                "APPETIZERS" + appetizers.toString() + "\n" +
                "MAIN COURSES" + mainCourse.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n";
    }


    void addItem(MenuItem newItem) {
        String message = "That item has already been added to the menu.";

        if (menuItems.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }


void removeItem(MenuItem item) {
    menuItems.remove(item);
    lastUpdated = LocalDate.now();
}


}
