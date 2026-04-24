package java_hw_5.Task_1;

public class Dog extends Animal {

    private String bark;

    public Dog(String bark, String eat, String sleep) {
        super(eat, sleep);
        this.bark = bark;
    }
    public void bark() {
        System.out.println(bark);
    }

    public void bulldog() {
        System.out.println("I am a bulldog, I can bark " + getBark() + " and I can bite you.");
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }


    @Override
    public String toString() {
        return "Dog - " + getBark() + ", " + getEat() + ", " + "and " + getSleep() + ".";
    }
}
