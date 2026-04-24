package java_hw_8;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    List<Order> orders = new ArrayList<>();

    void addOrder(Order order) {
        orders.add(order);
    }

    double calculateTotal(List<Order> orders) {

        double total = 0;

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getStatus() == Order.OrderStatus.NEW) {
                total += orders.get(i).getPrice();
            }
        }
        return total;
    }

    Order findOrderByNumber(int OrderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == OrderNumber) {
                return orders.get(i);
            }
        }
        return null;
    }

    void removeOrderByNumber(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNumber) {
                orders.remove(i);
                return;
            }
        }
    }

    List<Order> getOrdersByStatus(String status) {
        List<Order> result = new ArrayList<>();
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getStatus().name().equals(status)) {
                result.add(orders.get(i));
            }
        }
        return result;


    }

}



