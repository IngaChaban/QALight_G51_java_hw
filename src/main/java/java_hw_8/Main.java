package java_hw_8;

import java.util.List;

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

        orderManager.addOrder(coffee1);
        orderManager.addOrder(coffee2);
        orderManager.addOrder(tea1);
        orderManager.addOrder(tea2);
        orderManager.addOrder(dessert1);
        orderManager.addOrder(dessert2);
        orderManager.addOrder(dessert3);
        tea2.setStatus(Order.OrderStatus.CANCELED);

        orderManager.removeOrderByNumber(70);

        Order found = orderManager.findOrderByNumber(69);
        System.out.println("\nOrder 69:");
        found.printOrderInfo();

        List<Order> newOrders = orderManager.getOrdersByStatus("NEW");
        System.out.println("\nNEW orders:");
        for (Order order : newOrders) {
            order.printOrderInfo();
        }
        double total = orderManager.calculateTotal(newOrders);
        System.out.println("   ");
        System.out.println(" [ Total price: €" + total + " ]");

    }
}

