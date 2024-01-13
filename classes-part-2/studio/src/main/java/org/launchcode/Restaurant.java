package org.launchcode;

public class Restaurant {

    public static void main(String[] args) {

        // write your code here
        // Menu items
        MenuItem item1 = new MenuItem("Pepperoni Pizza", "The classic slice, hot and delicious!", 7.99, "main course");
        MenuItem item2 = new MenuItem("Toasted Ravioli", "A St. Louis favorite, served with a size of pizza sauce", 6.99, "appetizer");
        MenuItem item3 = new MenuItem("Chocolate Cake", "Rich, moist cake with dark chocolate cream cheese frosting", 4.99, "dessert");
        MenuItem item4 = new MenuItem("Veggie Pizza", "Peppers, onions, mushrooms, olives, and tomatoes make a delicious combo", 6.99, "main course");
        MenuItem item5 = new MenuItem("Garlic Breadsticks", "Hot, garlicky carbs FTW", 4.99, "appetizer");

        System.out.println(item1.isNew());

        // Print first item
        System.out.println(item1);

        // Create menu
        Menu menu = new Menu();

        //Add items to menu and print it
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        // remove an item
        menu.removeItem(item4);
        System.out.println(menu);

        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem("Garlic Breadsticks", "Hot, garlicky carbs FTW", 4.99, "appetizer");
        System.out.println(item5.equals(item6));

        menu.addItem(item6);
        System.out.println(menu);

    }
}
