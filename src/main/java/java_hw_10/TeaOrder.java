package java_hw_10;

public class TeaOrder extends Order {

    private String type;

    public TeaOrder(int orderNumber, String drinkType, String type) {
        super(orderNumber, drinkType);
        this.type = type;
    }

    public String getType() {

        return type;
    }

    @Override
    public double getPrice() {
        if ("green".equals(type)) {
            return 2.00;
        } else if ("black".equals(type)) {
            return 3.00;
        } else if ("herbal".equals(type)) {
            return 3.00;
        } else {
            return 0;

        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order number: " + getOrderNumber() + " | Order status: " + getStatus() +
                " | Drink type: " + getType() + " " + getDrinkType() + " | Price: €" + getPrice());
    }
}


