package java_hw_5.Task_2;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void move() {
        System.out.println("Vehicle " + getName() + " with load capacity " + loadCapacity + " tons is moving at " + getSpeed() + " km/h");
    }

    @Override
    public String toString() {
        return "Truck:" +
                "Name: " + getName() + " " +
                "Speed: " + getSpeed() + " km/h, " +
                "Load Capacity: " + loadCapacity + " tons";
    }
}