package testing;

import org.jsoup.internal.StringUtil;

import java.util.Scanner;

public class PalindromeTest2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = scan.next();
        //String name ="abba";

        /*
        StringBuilder stringBuilder = new StringBuilder(text);
        StringBuilder reverseValueBuilder = stringBuilder.reverse();
        String reverseValue = reverseValueBuilder.toString();
        */

        String reverseValue = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(reverseValue)) {
            System.out.println(input + " is palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
        //System.out.println(text + " length = " + text.length());
    }
}
