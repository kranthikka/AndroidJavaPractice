package test.yellow;

public class FibonacciTest {

    public static void main(String[] args) {
        int maxNumber = 10;
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + ", " + b);
        for (int i = 0; i < maxNumber; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }

}
