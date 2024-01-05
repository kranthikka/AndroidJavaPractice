package testing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtility {

    /**
     * This method will check if file exists, if does not exist create a new file
     *
     * @param path
     * @throws Exception
     */
    public File checkIfFileExistsAndCreateFile(String path) throws Exception {
        File file = new File(path);
        //Check if file exists & create file
        if (file.exists()) {
            System.out.println("file exists");
        } else {
            file.createNewFile();
            System.out.println("Created new file: " + path);
        }
        return file;
    }

    /**
     * This method will read the file and print the data in the file
     */
    public void readFile(String path) throws Exception {
        File file = checkIfFileExistsAndCreateFile(path);
        System.out.println("-------------");

        Scanner scannerRead = new Scanner(file); //This will read data from file based on paramter
        while (scannerRead.hasNext()) { //Scanner.hasNext will return boolean, means if it has next line in the document it will return true and while loop will continue
            String notes = scannerRead.nextLine();//scanner.nextLine() will read one line
            System.out.println(notes);
        }
    }

    /**
     * This will write data to a file
     *
     * @param path
     * @throws Exception
     */
    public void writeToFile(String path, String inputText) throws Exception {
        File file = checkIfFileExistsAndCreateFile(path);
        System.out.println("-------------");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(inputText);
        fileWriter.close();
        System.out.println("Written data to file");
    }

    /**
     * This method will append(add) data to an existing file that already has data
     *
     * @param path
     * @param inputText
     * @throws IOException
     */
    public void appendToFile(String path, String inputText) throws Exception {
        File file = checkIfFileExistsAndCreateFile(path);
        System.out.println("-------------");
        FileWriter fileWriterAppend = new FileWriter(file, true);
        fileWriterAppend.append("\n" + inputText);
        fileWriterAppend.close();
        System.out.println("Written data to file");
    }

}
