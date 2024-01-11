package test.yellow;

import java.util.Scanner;

public class RemoveOccurrenceOfCharTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine().toLowerCase();
        System.out.println("Enter character to be removed from text: ");
        String character = scanner.nextLine().toLowerCase();

        System.out.println(text.replaceAll(character, ""));
    }

}
