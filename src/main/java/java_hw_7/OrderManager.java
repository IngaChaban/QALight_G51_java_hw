package java_hw_7;

public class OrderManager {

    double calculateTotal(Order[] orders) {
        double total = 0;



        for (int i = 0; i < orders.length; i++) {
            if (orders[i].getStatus() == Order.OrderStatus.NEW) {
                total += orders[i].getPrice();
            }
        }
        return total;
    }
}


