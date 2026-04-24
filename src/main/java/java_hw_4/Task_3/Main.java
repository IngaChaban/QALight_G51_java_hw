package java_hw_4.Task_3;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.5);
        Circle circle2 = new Circle(2.2);
        Circle circle3 = new Circle(3.1);

        Circle[] circles = {circle1, circle2, circle3};

        for (Circle circle : circles) {
            System.out.println("Circle with radius: " + circle.getRadius());
            System.out.printf("Circle area: %.2f%n", circle.calculateArea());
            System.out.printf("Circle circumference: %.2f%n", circle.calculateCircumference());
            System.out.println("                                                  ");

        }
    }
}

