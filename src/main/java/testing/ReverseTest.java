package testing;

import java.util.Scanner;

public class ReverseTest {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Reverse the order of words in the sentence
        String reversedSentence = reverseWords(inputSentence);
        // Display the result
        System.out.println("Original sentence: " + inputSentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    // Method to reverse the order of words in a sentence
    public static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Create a StringBuilder to build the reversed sentence
        StringBuilder reversedStringBuilder = new StringBuilder();

        // Iterate through the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedStringBuilder.append(words[i]).append(" ");
        }

        // Remove the trailing space and convert StringBuilder to String
        return reversedStringBuilder.toString().trim();
    }


}
