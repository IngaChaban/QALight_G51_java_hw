package java_hw_5.Task_1;

public class Fish extends Animal {

    private String swim;

    public Fish(String swim, String eat, String sleep) {
        super(eat, sleep);
        this.swim = swim;
    }

    public void swim() {
        System.out.println(swim);
    }

    public String getSwim() {

        return swim;
    }

    public void setSwim(String swim) {

        this.swim = swim;
    }

    @Override
    public String toString() {
        return "Fish - " + getSwim() + ", " + getEat() + ", " + "and " + getSleep() + ".";
    }
}


