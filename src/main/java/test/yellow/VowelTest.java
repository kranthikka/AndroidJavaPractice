package test.yellow;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class VowelTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text1 = scanner.nextLine();
        int numberOfVowels = 0;

        if (text1.contains("a") || text1.contains("e") || text1.contains("i") || text1.contains("o") || text1.contains("u")) {
            System.out.println(text1 + " is a vowel");
        }

        char[] a = text1.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
                numberOfVowels = numberOfVowels + 1;
            }
        }
        System.out.println(numberOfVowels);

    }

}
