import java.io.*;

public class ReplaceWordInFile {
    public static void main(String[] args) {
        // Input and output file names
        String inputFile = "D:\\NewData\\Study\\Git Code\\Daily_Coding_Java\\PYQ1\\src\\input.txt"; // Existing file to read from
        String outputFile = "D:\\NewData\\Study\\Git Code\\Daily_Coding_Java\\PYQ1\\src\\output.txt"; // New file to be created

        try {
            // Create file objects for input and output
            File input = new File(inputFile);
            File output = new File(outputFile);

            // Check if the input file exists
            if (!input.exists()) {
                System.out.println("The input file does not exist.");
                return;
            }

            // Create the output file if it doesn't exist
            if (!output.exists()) {
                output.createNewFile();
            }

            // FileReader and BufferedReader to read the input file
            BufferedReader reader = new BufferedReader(new FileReader(input));

            // FileWriter and BufferedWriter to write to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));

            String line;

            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Replace occurrences of "red" with "blue"
                line = line.replace("red", "blue");

                // Write the modified line to the new file
                writer.write(line);
                writer.newLine();
            }

            // Close the file streams
            reader.close();
            writer.close();

            System.out.println("File created successfully as " + outputFile + " with 'red' replaced by 'blue'.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}