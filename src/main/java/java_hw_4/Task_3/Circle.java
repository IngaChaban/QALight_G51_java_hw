package java_hw_4.Task_3;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}





