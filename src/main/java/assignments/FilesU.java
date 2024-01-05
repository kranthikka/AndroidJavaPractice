package assignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesU {

    public File checkCreateNewFile(String path) throws Exception {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File " + path + " already exist");
        } else {
            file.createNewFile();
            System.out.println("New " + path + " file has been created");
        }
        return file;
    }

    public void readFile(String path) throws Exception {
        File file = new File(path);
        if (file.exists()) {
            Scanner readFile = new Scanner(file);
            while (readFile.hasNext()) { //using while loop to print all the lines from the file
                String notes = readFile.nextLine();
                System.out.println(notes);
            }
        } else {
            System.out.println("File does not exist to read the data");
        }
    }

    public void writeFile(String path, String textInput) throws Exception {
        File file = new File(path);
        if (file.exists()) {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(textInput);
            fileWriter.close();
            System.out.println("New input has been written to the file");
        } else {
            System.out.println("File does not exist. Create a new file and retry");
        }
    }

    public void appendFile(String path, String textInput) throws Exception {
        File file = new File(path);
        if (file.exists()) {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append("\n" + textInput);
            fileWriter.close();
            System.out.println("New input has been appended to the file");
        } else {
            System.out.println("File does not exist. Create a new file and retry");
        }
    }
}
