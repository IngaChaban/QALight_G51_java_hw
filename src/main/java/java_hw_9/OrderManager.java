package java_hw_9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {

    List<Order> orders = new ArrayList<>();

    void addOrder(Order order) {
        orders.add(order);
    }

    Map<String, Integer> getOrderTypeCounts() {
        Map<String, Integer> orderTypeCounts = new HashMap<>();
        int coffeeOrders = 0;
        int teaOrders = 0;
        int dessertOrders = 0;

        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order instanceof CoffeeOrder) {
                coffeeOrders++;
            } else if (order instanceof TeaOrder) {
                teaOrders++;
            } else if (order instanceof DessertOrder) {
                dessertOrders++;
            }
        }
        orderTypeCounts.put("Coffee", coffeeOrders);
        orderTypeCounts.put("Tea", teaOrders);
        orderTypeCounts.put("Dessert", dessertOrders);

        return orderTypeCounts;
    }
}

