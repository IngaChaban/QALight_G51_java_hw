package java_hw_10;

public class TeaOrder extends Order {

    private TeaType type;

    public TeaOrder(int orderNumber, TeaType type) {
        super(orderNumber);
        this.type = type;
    }

    public TeaType getType() {
        return type;
    }

    @Override
    public double getPrice() {
        if (type == TeaType.BLACK) {
            return 2.00;
        } else if (type == TeaType.GREEN) {
            return 3.00;
        } else if (type == TeaType.HERBAL) {
            return 3.00;
        } else {
            return 0;

        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order number: " + getOrderNumber() + " | Order status: " + getStatus() +
                " | Tea type: " + getType() + " | Price: €" + getPrice());
    }
}


