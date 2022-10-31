package Dish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DishApp {

    public static void main(String[] args) {
        Dish dish = new Dish();

        List<Dish> dishList = dish.initMenu();

        Scanner scanner = new Scanner(System.in);

        List<Dish> orderedList = new ArrayList<>();
        while (true) {
            System.out.println("======================");
            System.out.println("Welcom to Flora Pizza");
            System.out.println("======================");
            System.out.println(" [1] Order Pizza");
            System.out.println(" [2] Your Order");
            System.out.println(" [3] Delete Item");
            System.out.println(" [4] Check Out");
            System.out.println(" [0] Back / Close");
            System.out.println("======================");
            System.out.println("Enter your choice");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    while (true) {
                        dish.showMenu(dishList);
                        System.out.println("Enter the item number to order, Enter 0 go back");
                        int id = scanner.nextInt();
                        if (id == 0) {
                            break;
                        }

                        System.out.println("Enter the item number : " + id);

                        System.out.println("Your order : " + dishList.get(id - 1).getName());
                        // Put the ordered item into the ordered list
                        orderedList.add(dishList.get(id - 1));
                    }
                    break;
                case "2":
                    dish.showOrderedMenu(orderedList);
                    break;
                case "3":
                    if (orderedList.isEmpty()) {
                        System.out.println("No order yet, please enter your selection");
                    } else {
                        System.out.println("Enter the number of the item you want to delete");
                        int id = scanner.nextInt();
                        dish.deleteDish(id, dishList, orderedList);
                    }
                    break;
                case "4":
                    dish.checkout(orderedList);
                    break;

                case "0":
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}

// Reference - Interface : https://www.w3schools.com/java/java_interface.asp
// Reference - List : https://www.javatpoint.com/java-list
// Reference - How to use List : https://www.softwaretestinghelp.com/java-list-how-to-create-initialize-use-list-in-java/
// Reference - How to use List : https://zhuanlan.zhihu.com/p/440956555
// Reference - Pizza : https://www.pizzahut.ca/menu/pizzas
// Reference : https://www.geeksforgeeks.org/classes-objects-java/
// Reference - Ordering system : http://www.tsnien.idv.tw/Java2_WebBook/chap5/5-5%20%E5%B0%88%E9%A1%8C%E8%A3%BD%E4%BD%9C%20%E2%80%93%20%E7%9C%9F%E5%81%A5%E5%BA%B7%E7%BE%8E%E9%A3%9F%E9%A4%90%E5%BB%B3.html


