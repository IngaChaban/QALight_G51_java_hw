package java_hw_3.methods;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println(DaysOfTheWeek(12));
    }

    public static String DaysOfTheWeek(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "I wish it was Friday today!";


        }
    }
}
