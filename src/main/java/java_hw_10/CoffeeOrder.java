package java_hw_10;

public class CoffeeOrder extends Order {

    private CoffeeSize size;
    private CoffeeType type;

    public CoffeeOrder(CoffeeSize size, int orderNumber, CoffeeType type) {
        super(orderNumber);
        this.size = size;
        this.type = type;
    }

    public CoffeeType getType() {
        return type;
    }

    public CoffeeSize getSize() {
        return size;
    }

    @Override
    public double getPrice() {
        if (size == CoffeeSize.SMALL) {
            return 3.0;
        } else if (size == CoffeeSize.MEDIUM) {
            return 4.0;
        } else if (size == CoffeeSize.LARGE) {
            return 5.0;
        } else {
            return 0;
        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order number: " + getOrderNumber() + " | Order status: " + getStatus()
                + " | Coffee type: " + getType() + " |  Size: " + getSize() +  " | Price: €" + getPrice());
    }
}





