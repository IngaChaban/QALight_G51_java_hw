package java_hw_8;


public abstract class Order implements Printable, Priceable {

    public enum OrderStatus {
        NEW,
        COMPLETED,
        CANCELED
    }

    private int orderNumber;
    private String drinkType;
    private OrderStatus orderStatus;


    public Order(int orderNumber, String drinkType) {
        this.drinkType = drinkType;
        this.orderNumber = orderNumber;
        this.orderStatus = OrderStatus.NEW;
    }

    public int getOrderNumber() {

        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {

        this.orderNumber = orderNumber;
    }

    public String getDrinkType() {

        return drinkType;
    }

    public void setDrinkType(String drinkType) {

        this.drinkType = drinkType;
    }

    public OrderStatus getStatus() {

        return orderStatus;
    }

    public void setStatus(OrderStatus status) {
        this.orderStatus = status;

    }
}

