package java_hw_3.arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arraysnum = {-5, 6, 7, 9, -12, 22, 4, -55, 122, 99, -44, 55, 67, -876, 1456};
        for (int i = 0; i < arraysnum.length; i++) {
            if (arraysnum[i] < 0) {
                arraysnum[i] = 0;
            }
        }
        for (int num : arraysnum) {
            System.out.print(num + " ");
        }
    }
}


