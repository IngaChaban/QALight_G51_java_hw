package java_hw_10;

public class DessertOrder extends Order {

    private DessertType type;

    public DessertOrder(int orderNumber, DessertType type) {
        super(orderNumber);
        this.type= type;
    }

    public DessertType getType() {
        return type;
    }

    @Override
    public double getPrice() {
        if (type == DessertType.BROWNIE) {
            return 5.00;
        } else if (type == DessertType.CHEESECAKE) {
            return 3.00;
        } else if (type == DessertType.TIRAMISU) {
            return 6.00;
        } else {
            return 0;
        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order number: " + getOrderNumber() + " | Order status: " + getStatus() +
                " | Dessert type: " + getType() + " | Price: €" + getPrice());
    }
}



