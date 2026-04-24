package java_hw_3.methods;

public class Triangle {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 9;
        if (Triangle(a, b, c)) {
            System.out.println("No triangle possible");
        } else {
            System.out.println("A triangle is possible");
        }
    }

    public static boolean Triangle(int a, int b, int c) {

        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}






