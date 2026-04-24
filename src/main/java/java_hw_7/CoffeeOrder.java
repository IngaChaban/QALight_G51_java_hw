package java_hw_7;

public class CoffeeOrder extends Order {

    private String size;

    public CoffeeOrder(String size, int orderNumber, String drinkType) {
        super(orderNumber, drinkType);
        this.size = size;
    }

    public String getSize() {

        return size;
    }

    @Override
    public double getPrice() {
        if ("small".equals(size)) {
            return 3.8;
        } else if ("medium".equals(size)) {
            return 4.0;
        } else if ("large".equals(size)) {
            return 5.3;
        } else {
            return 0;
        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order number: " + getOrderNumber() + " | Order status: " + getStatus() + " | Drink size: " + getSize() +
                " | Drink type: " + getDrinkType() +
                " | Price: €" + getPrice());
    }
}





