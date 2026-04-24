package java_hw_6;

public class DessertOrder extends Order {

    private String dessertName;

    public DessertOrder(int orderNumber, String drinkType, String dessertName) {
        super(orderNumber, drinkType);
        this.dessertName = dessertName;
    }

    public String getDessertName() {

        return dessertName;
    }

    @Override
    public double getPrice() {
        if ("Cheesecake".equals(dessertName)) {
            return 5.7;
        } else if ("Ice cream".equals(dessertName)) {
            return 2.5;
        } else if ("Brownie".equals(dessertName)) {
            return 3.1;
        } else {
            return 0;
        }
    }
        @Override
        public void printOrderInfo() {
            System.out.println("Order number: " + getOrderNumber() + " | Dessert: " + getDessertName() +
                    " | Price: €" + getPrice());
    }
}



