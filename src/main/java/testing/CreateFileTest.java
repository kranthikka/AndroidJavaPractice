package testing;

import java.io.*;
import java.util.Scanner;

public class CreateFileTest {


    public static void main(String[] args) throws Exception {
        FileUtility fileUtility = new FileUtility();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter filename: ");
        String fileNameFromUser = scanner.nextLine();
        String path = "C:\\Users\\Owner\\Documents\\TestData\\" + fileNameFromUser;

        //verify if file exists if not create a file
        fileUtility.checkIfFileExistsAndCreateFile(path);

        //Read from file
        fileUtility.readFile(path);

        //Write/edit a file
        System.out.println("Enter the text that you want to write to file: ");
        String writeThisToFile = scanner.nextLine();
        fileUtility.writeToFile(path, writeThisToFile);

        //append (adding to existing) to a file
        System.out.println("Enter the text that you want to append to existing file: ");
        String appendThisText = scanner.nextLine();
        fileUtility.appendToFile(path, appendThisText);
    }

}