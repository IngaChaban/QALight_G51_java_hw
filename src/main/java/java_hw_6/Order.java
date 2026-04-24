package java_hw_6;

public abstract class Order {

    private int orderNumber;
    private String drinkType;

    public Order(int orderNumber, String drinkType) {
        this.drinkType = drinkType;
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {

        return orderNumber;
    }

    public String getDrinkType() {

        return drinkType;
    }

    public abstract double getPrice();

    public void printOrderInfo() {
        System.out.println("Order number: " + getOrderNumber() + " Drink type: " + getDrinkType());
    }

}

