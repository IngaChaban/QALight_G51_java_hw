package java_hw_6;

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
        if ("Small".equals(size)) {
            return 3.8;
        } else if ("Medium".equals(size)) {
            return 4.0;
        } else if ("Large".equals(size)) {
            return 5.3;
        } else {
            return 0;
        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order number: " + getOrderNumber() + " | Drink size: " + getSize() + " | Drink type: " + getDrinkType() +
                " | Price: €" + getPrice());
    }
}





