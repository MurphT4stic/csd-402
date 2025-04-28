//Tabari Harvey, 04/25/2025, Module-9 Programming Assignment
import java.io.*;

import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "data.file";

        // Create a file object
        File file = new File(fileName);

        try {
            // Check if the file exists, if not create a new file
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + fileName);
            }

            // Create a FileWriter in append mode
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            // Generate 10 random numbers and write them to the file
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                int randomNumber = rand.nextInt(100); // Random number between 0 and 99
                bufferedWriter.write(randomNumber + " ");
            }

            // Close the file writer
            bufferedWriter.close();
            System.out.println("10 random numbers have been written to the file.");

            // Reopen the file to read the data
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            // Read and display the contents of the file
            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file reader
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


