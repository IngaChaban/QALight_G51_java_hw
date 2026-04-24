package java_hw_3.arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {127, 156, 34, 776, 13, 5678, 103, 44, 69, 1238};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The max element is " + max);
    }
}
