package java_hw_3.arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arraysOfNumbers = {11, 12, 34, 55, 13, 103, 44, 87, 12, 5, 12345, 321};
        int sum = 0;
        for (int i = 0; i < arraysOfNumbers.length; i++) {
            sum += arraysOfNumbers[i];
        }
        System.out.println("The sum is " + sum);
    }
}


