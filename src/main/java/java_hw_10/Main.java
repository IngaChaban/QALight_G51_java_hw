package java_hw_10;

public class Main {
    public static void main(String[] args) {

        OrderManager orderManager = new OrderManager();

        CoffeeOrder coffee1 = new CoffeeOrder(CoffeeSize.MEDIUM, 67, CoffeeType.CAPPUCCINO);
        CoffeeOrder coffee2 = new CoffeeOrder(CoffeeSize.LARGE, 72, CoffeeType.LATTE);
        TeaOrder tea1 = new TeaOrder(68, TeaType.BLACK);
        TeaOrder tea2 = new TeaOrder(69, TeaType.HERBAL);
        DessertOrder dessert1 = new DessertOrder(70, DessertType.BROWNIE);
        DessertOrder dessert2 = new DessertOrder(71, DessertType.CHEESECAKE);
        DessertOrder dessert3 = new DessertOrder(73, DessertType.TIRAMISU);

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

        orderManager.getOrdersByStatus(OrderStatus.NEW);
        coffee1.printOrderInfo();
        coffee2.printOrderInfo();
        tea1.printOrderInfo();
        tea2.printOrderInfo();
        dessert1.printOrderInfo();
        dessert2.printOrderInfo();
        dessert3.printOrderInfo();

        try {
            Order found = orderManager.findOrderByNumber(89);
            found.printOrderInfo();
        } catch (OrderNotFoundException ex) {
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


