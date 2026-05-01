package java_hw_10;


public abstract class Order implements Printable, Priceable {


    private int orderNumber;
    private OrderStatus orderStatus;


    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.orderStatus = OrderStatus.NEW;
    }

    public int getOrderNumber() {

        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {

        this.orderNumber = orderNumber;
    }

    public OrderStatus getStatus() {

        return orderStatus;
    }

    public void setStatus(OrderStatus status) {
        this.orderStatus = status;

    }
}

