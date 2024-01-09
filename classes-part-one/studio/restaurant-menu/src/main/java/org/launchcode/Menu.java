package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    // Allow for default constructor. We don't need a constructor. Because we do not need to have any parameters to passed in when we create a menu.


    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
