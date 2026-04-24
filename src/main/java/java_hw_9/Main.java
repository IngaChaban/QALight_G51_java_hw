package java_hw_9;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        CoffeeOrder coffee1 = new CoffeeOrder("medium", 67, "latte");
        CoffeeOrder coffee2 = new CoffeeOrder("large", 72, "cappuccino");
        TeaOrder tea1 = new TeaOrder(68, "tea", "black");
        TeaOrder tea2 = new TeaOrder(69, "tea", "herbal");
        DessertOrder dessert1 = new DessertOrder(70, "", "cheesecake");
        DessertOrder dessert2 = new DessertOrder(71, "", "brownie");
        DessertOrder dessert3 = new DessertOrder(73, "", "ice cream");
        DessertOrder dessert4 = new DessertOrder(74, "", "brownie");

        orderManager.addOrder(coffee1);
        orderManager.addOrder(coffee2);
        orderManager.addOrder(tea1);
        orderManager.addOrder(tea2);
        orderManager.addOrder(dessert1);
        orderManager.addOrder(dessert2);
        orderManager.addOrder(dessert3);
        orderManager.addOrder(dessert4);

        Map<String, Integer> orderTypeCounts = orderManager.getOrderTypeCounts();

        System.out.println("\nOrder types:");
        System.out.println("Coffee: " + orderTypeCounts.get("Coffee"));
        System.out.println("Tea: " + orderTypeCounts.get("Tea"));
        System.out.println("Dessert: " + orderTypeCounts.get("Dessert"));
    }

}