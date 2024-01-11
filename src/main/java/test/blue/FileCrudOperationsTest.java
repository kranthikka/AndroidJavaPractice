package test.blue;

import java.util.Scanner;

public class FileCrudOperationsTest {

    static String location = "C:\\Users\\Owner\\Documents\\TestData\\";

    public static void main(String[] args) throws Exception {
        FileCrudOperationsPage page = new FileCrudOperationsPage();
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

        System.out.println("1. Create a new file \n" +
                "2. Read an existing file \n" +
                "3. Rewrite to an existing file \n" +
                "4. Append to an existing file \n" +
                "5. Delete an existing file \n" +
                "Select one option to perform the operation: ");

        int option = intScanner.nextInt();

        System.out.println("Enter file name: ");
        String fileName = scanner.nextLine();

        String path = location + fileName;

        switch (option) {
            case 1:
                page.createFile(path);
                break;
            case 2:
                page.readFile(path);
                break;
            case 3:
                page.writeFile(path);
                break;
            case 4:
                page.appendFile(path);
                break;
            case 5:
                page.deleteFile(path);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }
}
