package test.blue;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCrudOperationsPage {

    public File createFile(String path) throws Exception {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File already exist");
        } else {
            file.createNewFile();
            System.out.println("File has been created");
        }
        return file;
    }

    public void readFile(String path) throws Exception {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        if (file.exists()) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } else
            System.out.println("File does not exist");
    }

    public void writeFile(String path) throws Exception {
        File file = new File(path);
        Scanner scanner = new Scanner(System.in);
        if (file.exists()) {
            FileWriter fileWriter = new FileWriter(path);
            System.out.println("Enter text to add to the file: ");
            fileWriter.write(scanner.nextLine());
            fileWriter.close();
            System.out.println("Text has been added to the file.");
        } else {
            System.out.println("File does not exist");
        }
    }

    public void appendFile(String path) throws Exception {
        File file = new File(path);
        Scanner scanner = new Scanner(System.in);

        if (file.exists()) {
            FileWriter fileWriter = new FileWriter(path, true);
            System.out.println("Enter text to append to the file: ");
            fileWriter.append(" " + scanner.nextLine());
            fileWriter.close();
            System.out.println("Text has been appended to the file");
        } else {
            System.out.println("File does not exist");
        }
    }

    public void deleteFile(String path) throws Exception {
        File file = new File(path);
        Scanner scanner = new Scanner(System.in);
        if (file.exists()) {
            System.out.println("enter 'yes' to confirm delete the file: ");
            String confirmation = scanner.nextLine();
            if (confirmation.equalsIgnoreCase("yes")) {
                file.delete();
                System.out.println("file has been deleted successfully");
            } else {
                System.out.println("not deleted");
            }
        } else {
            System.out.println("File does not exist");
        }
    }
}
