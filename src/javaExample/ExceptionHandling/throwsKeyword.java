package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class throwsKeyword
{
    public static void processFile(String fileName) throws IOException, SQLException { // throws keyword
        if (fileName == null) {
            throw new IOException("File name cannot be null.");
        }
        if (fileName.isEmpty()) {
            throw new SQLException("File name cannot be empty.");
        }
        FileReader file = new FileReader(fileName);
        // Process the file
        file.close();
    }
    public static void main(String[] args)
    {
        try {
            processFile(null); // Call the method that might throw exceptions
        } catch (IOException | SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
