package java_hw_2;

public class Loops {
    public static void main(String[] args) {
        //Task: 1 Print Numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Task 2: Enter a number N and find the sum of all numbers from 1 to N.
        int N = 18;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        //Task 3: Print Even Numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            //Task 4: Multiplication table for the Number 5
            int y = 5;
            for (int k = 1; k <= 10; k++) {
                System.out.println(y + " x " + k + " = " + (y * k));
            }
        }
    }
}
