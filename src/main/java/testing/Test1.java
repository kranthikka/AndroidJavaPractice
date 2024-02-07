package testing;

import java.util.Scanner;

public class Test1 {

    /*    public static void main(String[] args) {
            String name = "Kranthi";
            String age = "29";
            String address = "3800 grapevine mills pkwy, Grapevine, Texas";

            String a = name.toLowerCase();
            String b = address.toUpperCase();

            System.out.println(name.length());
            System.out.println(a);
            System.out.println(b);

        }*/

    public static void main(String[] args) {
        Scanner stringScan = new Scanner(System.in);
        Scanner intScan = new Scanner(System.in);

        System.out.println("Enter string to print: ");
        String word = stringScan.nextLine();

        System.out.println("Enter max lines: ");
        int maxLines = intScan.nextInt();

        System.out.println();
        for (int i = 0; i < maxLines; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word);
            }
            System.out.println();
        }
    }
}
