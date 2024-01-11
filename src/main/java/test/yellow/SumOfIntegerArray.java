package test.yellow;

public class SumOfIntegerArray {

    public static void main(String[] args) {
        int[] a = {2, -3, 5};
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result = result + a[i];
        }
        System.out.println(result);
    }

}
