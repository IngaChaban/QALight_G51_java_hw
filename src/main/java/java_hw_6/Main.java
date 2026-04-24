package java_hw_6;

public class Main {
    public static void main(String[] args) {

        CoffeeOrder coffee = new CoffeeOrder("Medium", 67, "Latte");
        TeaOrder tea1 = new TeaOrder(68, "tea", "Black");
        TeaOrder tea2 = new TeaOrder(69, "tea", "Herbal");
        DessertOrder dessert = new DessertOrder(70, "", "Cheesecake");

        Order[] orders = {coffee, tea1, tea2, dessert};

        for (int i = 0; i < orders.length; i ++) {
            orders[i].printOrderInfo();
        }

        OrderManager orderManager = new OrderManager();
        double total = orderManager.calculateTotal(orders);
        System.out.println("   ");
        System.out.println(" | Total price: €" + total + " |");
    }
}