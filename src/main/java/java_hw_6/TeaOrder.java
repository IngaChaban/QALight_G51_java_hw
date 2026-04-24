package java_hw_6;

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
        if ("Green".equals(type)) {
            return 2.3;
        } else if ("Black".equals(type)) {
            return 2.5;
        } else if ("Herbal".equals(type)) {
            return 3.1;
        } else {
            return 0;

        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order number: " + getOrderNumber() + " | Drink type: " + getType() + " " + getDrinkType() +
                " | Price: €" + getPrice());
    }
}


