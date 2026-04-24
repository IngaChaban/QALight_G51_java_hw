package java_hw_5.Task_2;

public class Car extends Vehicle {

    private int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("Vehicle " + getName() + " is moving at " + getSpeed() + " km/h with " + passengerCapacity + " passengers");
    }

    @Override
    public String toString() {
        return "Car:" +
                "Name: " + getName() + " " +
                "Speed: " + getSpeed() + " km/h, " +
                "Passenger Capacity: " + passengerCapacity;
    }
}