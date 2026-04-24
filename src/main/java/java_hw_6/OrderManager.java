package java_hw_6;

public class OrderManager {

    double calculateTotal(Order[] orders) {
        double total = 0;


        for (int i = 0; i < orders.length; i++)
            total += orders[i].getPrice();
        return total;
    }
}
