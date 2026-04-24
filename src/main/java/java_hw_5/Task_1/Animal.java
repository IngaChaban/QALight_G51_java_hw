package java_hw_5.Task_1;

public class Animal {

    private String eat;
    private String sleep;

    public Animal(String eat, String sleep) {
        this.eat = eat;
        this.sleep = sleep;
    }

    public Animal() {
        this.eat = "I can eat";
        this.sleep = "I can sleep";
    }

    public void eat() {

        System.out.println(eat);
    }

    public void sleep() {
        System.out.println(sleep);
    }

    public String getEat() {

        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

}

