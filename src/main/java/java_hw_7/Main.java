package java_hw_7;

public class Main {
    public static void main(String[] args) {

        CoffeeOrder coffee1 = new CoffeeOrder("medium", 67, "latte");
        CoffeeOrder coffee2 = new CoffeeOrder("large", 72, "cappuccino");
        TeaOrder tea1 = new TeaOrder(68, "tea", "black");
        TeaOrder tea2 = new TeaOrder(69, "tea", "herbal");
        DessertOrder dessert1 = new DessertOrder(70, "", "cheesecake");
        DessertOrder dessert2 = new DessertOrder(71, "", "brownie");


        Order[] orders = {coffee1, coffee2, tea1, tea2, dessert1, dessert2};
        tea2.setStatus(Order.OrderStatus.CANCELED);

        for (int i = 0; i < orders.length; i++) {
            orders[i].printOrderInfo();
        }

        OrderManager orderManager = new OrderManager();
        double total = orderManager.calculateTotal(orders);
        System.out.println("   ");
        System.out.println(" [ Total price: €" + total + " ]");


    }

}
