package testing;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class CharCountTest {

    int countChar(char c, String s) {
        int count = 0;
        if (s.isEmpty() || c == ' ') {
            System.out.println("Message or Character is required");
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char inputChar = scanner.nextLine().toCharArray()[0];

        System.out.println("Enter Message: ");
        String message = scanner.nextLine();

        CharCountTest charCountTest = new CharCountTest();
        int charCount = charCountTest.countChar(inputChar, message);
        System.out.println("count of " + "'" + inputChar + "'" + " is " + charCount);
    }
}


