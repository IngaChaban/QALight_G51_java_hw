package java_hw_10;

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

        try {
            orderManager.addOrder(coffee1);
            orderManager.addOrder(coffee2);
            orderManager.addOrder(tea1);
            orderManager.addOrder(tea2);
            orderManager.addOrder(dessert1);
            orderManager.addOrder(dessert2);
            orderManager.addOrder(dessert3);
            orderManager.addOrder(tea2);
        } catch (DuplicateOrderException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try {
            Order found = orderManager.findOrderByNumber(89);
            found.printOrderInfo();
        } catch (OrderNotFoundException ex) {
            System.out.println("Error: " +  ex.getMessage());
        }
        try {

            orderManager.getOrdersByStatus("INVALID");
        } catch (InvalidOrderStatusException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        try {
            OrderManager empty = new OrderManager();
            empty.calculateTotal();
        } catch (NoOrdersException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        try {
            double total = orderManager.calculateTotal();
            System.out.println("   ");
            System.out.println(" [ Total price: €" + total + " ]");
        } catch (NoOrdersException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }
}

