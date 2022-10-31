package Dish;

import java.util.ArrayList;
import java.util.List;

    public class Dish{

        // Item No.
        private int id;

        // Item Name
        private String name;
        
        // Item Price
        private double price;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Dish() {
        }

        public Dish(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        // Menu
        // @return original menu
        public List<Dish> initMenu() {
            List<Dish> dishList = new ArrayList<>();
            dishList.add(new Dish(1, "BBQ Chicken", 12));
            dishList.add(new Dish(2, "Hawaiian Pizza", 10));
            dishList.add(new Dish(3, "Meat Lover's", 15));
            dishList.add(new Dish(4, "Veggie Lover's", 14));
            dishList.add(new Dish(5, "Smokey Bacon", 18));
            dishList.add(new Dish(6, "Cheese Lover's", 15));
            dishList.add(new Dish(7, "Greek Pizza", 15));
            dishList.add(new Dish(8, "Italian Classic", 16));
            dishList.add(new Dish(9, "Margherita ", 14));
            dishList.add(new Dish(10, "Mashroom Chicken", 15));
            return dishList;
        }

        // Show Menu list
        // @param dishList 菜品列表
        public void showMenu(List<Dish> dishList) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Our Menu");
            System.out.println("------------------------------------------------------------------");
            System.out.println("No.\t\tItem\t\t\t\tPrice");
            for (int i = 0; i < dishList.size(); i++) {
                System.out.format("%d\t\t%s\t\t\t%.2f\n", dishList.get(i).getId(), dishList.get(i).getName(), dishList.get(i).getPrice());
            }
            System.out.println("------------------------------------------------------------------");
        }

        public void deleteDish(int id, List<Dish> dishList, List<Dish> orderedList) {
            if (!orderedList.isEmpty()) {
                orderedList.remove(dishList.get(id - 1));
            }
        }

        // Check already ordered items
        public void showOrderedMenu(List<Dish> orderedList) {
            if (orderedList.isEmpty()) {
                System.out.println("You have not ordered yet, please enter your selection");
            } else {
                System.out.println("The dishes you are currently ordering are as follows");
                for (int i = 0; i < orderedList.size(); i++) {
                    System.out.println(orderedList.get(i).getName());
                }
            }

        }

        // Check out
        public void checkout(List<Dish> orderedList) {
            double money = 0.0d;
            if (orderedList.isEmpty()) {
                System.out.println("You have not ordered yet, please enter your selection");
            } else {
                System.out.println("Please wait, billing is in progress……");
                for (int i = 0; i < orderedList.size(); i++) {
                    money += orderedList.get(i).getPrice();
                }
                System.out.format("Your total is : CAD %.2f\n", money);
            }
        }
    }
