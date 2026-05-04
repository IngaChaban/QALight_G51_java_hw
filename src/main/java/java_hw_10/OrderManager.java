package java_hw_10;

import java_hw_10.enums.OrderStatus;
import java_hw_10.exceptions.DuplicateOrderException;
import java_hw_10.exceptions.NoOrdersException;
import java_hw_10.exceptions.OrderNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    List<Order> orders = new ArrayList<>();

    void addOrder(Order order) throws DuplicateOrderException {
        for (Order currentOrder : orders) {
            if (currentOrder.getOrderNumber() == order.getOrderNumber()) {
                throw new DuplicateOrderException("Order " + order.getOrderNumber() + " already exists");
            }
        }
        orders.add(order);
    }

    double calculateTotal() throws NoOrdersException {
        if (orders.isEmpty()) {
            throw new NoOrdersException("No orders available");
        }

        double total = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getStatus() == OrderStatus.NEW) {
                total += orders.get(i).getPrice();
            }
        }
        return total;
    }

    Order findOrderByNumber(int orderNumber) throws OrderNotFoundException {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNumber) {
                return orders.get(i);
            }
        }
        throw new OrderNotFoundException("Order number " + orderNumber + " not found");
    }

    List<Order> getOrdersByStatus(OrderStatus status) {

        List<Order> result = new ArrayList<>();

        for (Order order : orders) {
            if (order.getStatus() == status) {
                result.add(order);
            }
        }

        return result;
    }

}





