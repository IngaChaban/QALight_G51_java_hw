package java_hw_3.arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arraysnumbers = {5, 6, 7, 9, 12, 22, 4, 55, 122, 99, 44, 55, 67, 876, 1456, 8, 6, 566};
        int even = 0;
        for (int i = 0; i < arraysnumbers.length; i++) {
            if (arraysnumbers[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println("Number of even numbers is " + even);
    }
}
