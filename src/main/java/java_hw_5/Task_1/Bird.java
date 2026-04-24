package java_hw_5.Task_1;

public class Bird extends Animal {

    private String fly;

    public Bird(String fly, String eat, String sleep) {
        super(eat, sleep);
        this.fly = fly;

    }

    public void fly() {
        System.out.println(fly);
    }

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    @Override
    public String toString() {

        return "Bird - " + getFly() + ", " + getEat() + ", " + "and " + getSleep() + ".";
    }

}


