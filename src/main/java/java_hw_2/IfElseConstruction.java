package java_hw_2;

public class IfElseConstruction {
    public static void main(String[] args) {
        //Task 1: Even or odd
        int number = 1863;
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
        //Task 2: Find the bigger number or say if they are equal
        int a = 123;
        int b = 123;
        if (a > b) {
            System.out.println(a + " bigger than " + b);
        } else if (a < b) {
            System.out.println(a + " smaller than" + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
        //Task 3: Grade by Score
        int score = 67;
        if (score >= 90 && score <= 100) {
            System.out.println("Excellent");
        } else if (score >= 70 && score <= 89) {
            System.out.println("Good");
        } else if (score >= 50 && score <= 69) {
            System.out.println("Satisfactory");
        } else if (score >= 0 && score <= 49) {
            System.out.println("Fail");
        }
        //Task: 4 Check if a Number is "Positive", "Negative", or "Zero"
        int x = -99;
        if (x < 0) {
            System.out.println("Negative");
        } else if (x == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive");
        }
    }
}




