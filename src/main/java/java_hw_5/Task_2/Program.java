package java_hw_5.Task_2;

public class Program {

    public static void main(String[] args) {

        Car crossover = new Car("BMW X1,", 100, 3);
        Truck truck = new Truck("Ford F-550,", 90, 9.5);

        crossover.move();
        truck.move();

        crossover.stop();
        truck.stop();

        System.out.println(crossover);
        System.out.println(truck);
    }
}