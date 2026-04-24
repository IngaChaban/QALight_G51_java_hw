package java_hw_5.Task_1;

public class Program {
    public static void main(String[] args) {

        Bird bird = new Bird("I can fly", "I can eat", "I can sleep");
        Dog dog = new Dog("Woof-woof", "I can eat", "I can sleep");
        Fish fish = new Fish("I can swim", "I can eat", "I can sleep");

        System.out.println(bird);
        System.out.println(dog);
        System.out.println(fish);
        System.out.println("____________________________________________________");
        dog.bulldog();

    }
}

