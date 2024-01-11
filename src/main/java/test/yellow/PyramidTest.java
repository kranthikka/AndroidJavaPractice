package test.yellow;

import java.util.Scanner;

public class PyramidTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character: ");
        String a = scanner.nextLine();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }

}
