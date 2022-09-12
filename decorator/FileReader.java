package decorator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    /**
     * Gets the lines from text file and stores them in an array list
     * @param fileName the file being read in
     * @return the array list containing each line of the text file
     */
    public static ArrayList<String> getLines(String fileName) {
        ArrayList<String> lines = new ArrayList<String>();

        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                lines.add(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        return lines;
    }
}
