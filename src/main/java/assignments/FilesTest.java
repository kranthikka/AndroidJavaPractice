package assignments;

import java.util.Scanner;

public class FilesTest {

    public static void main(String[] args) throws Exception {

        FilesU filesU = new FilesU();
        Scanner scanner = new Scanner(System.in);
        String path = "", fileName = "";

        while (true) {
            System.out.println("Available options- \n" +
                    "1. Check/Create new file \n" +
                    "2. Read existing file \n" +
                    "3. Write to an existing file \n" +
                    "4. Append to an existing file \n" +
                    "5. Exit \n" +
                    "Select an option: ");

            int option = Integer.parseInt(scanner.nextLine());

            if (option == 5) {
                System.out.println("Bye...");
                break;
            }
            if (option <= 5 & option>0) {
                System.out.println("Enter file name: ");
                fileName = scanner.nextLine();
                path = "C:\\Users\\Owner\\Documents\\TestData\\" + fileName;
            }
            switch (option) {
                case 1:
                    //check weather the file do exist or create new file if the file does not exist
                    filesU.checkCreateNewFile(path);
                    break;
                case 2:
                    //read the data from the existing file
                    System.out.println("Data in " + fileName + " file:");
                    System.out.println();
                    filesU.readFile(path);
                    System.out.println();
                    break;
                case 3:
                    //write to an existing file
                    System.out.println("Enter text to write to " + fileName + " file: ");
                    String textInput = scanner.nextLine();
                    filesU.writeFile(path, textInput);
                    System.out.println();
                    break;
                case 4:
                    //Append to the existing file
                    System.out.println("Data present in " + fileName + " file:");
                    filesU.readFile(path);
                    System.out.println("------------------------------------");
                    System.out.println("Enter text to append to " + fileName + "  file");
                    String appendInput = scanner.nextLine();
                    filesU.appendFile(path, appendInput);
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid selection. Try again...");
                    System.out.println("-----------");
            }
        }
    }
}
//newtest.txt
