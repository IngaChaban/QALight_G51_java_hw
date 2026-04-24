package java_hw_3.arrays;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] digits = {2, 5, 6, 2, 7, 9, 1, 1, 4, 7, 8, 9, 2, 2, 2, 2};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int x = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == number) {
                x++;
            }
        }
        System.out.println(x);
    }
}

