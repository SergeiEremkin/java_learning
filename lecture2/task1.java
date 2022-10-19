// Java Program to convert Byte Array to File
package lecture2;

// Importing required classes
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;


// Main class
public class task1 {

    // Path of a file
    static String pathProject = System.getProperty("user.dir");
    static String pathFile = pathProject.concat("/bytes3.txt");
    
    static String FILEPATH = "byts.bin";
    static File file = new File(FILEPATH);
    static String FILEPATH2 = "byts2.txt";
    static File file2 = new File(FILEPATH2);
    // Method 1
    // To write the bytes into a file
    static void writeByte(byte[] bytes) {

        // Try block to check for exceptions
        try {

            // Initialize a pointer in file
            // using OutputStream
            FileOutputStream os = new FileOutputStream(pathFile);

            // Starting writing the bytes in it
            os.write(bytes);

            // Display message onconsole for successful
            // execution
            System.out.println("Successfully"
                    + " byte inserted");

            // Close the file connections
            os.close();
        }

        // Catch block to handle the exceptions
        catch (Exception e) {

            // Display exception on console
            System.out.println("Exception: " + e);
        }
    }

    static void writeByte2(byte[] byteInt, byte[] byteChar,
            byte[] byteDouble) {

        // Try block to check for exceptions
        try {

            // Initialize a pointer in file
            // using OutputStream class object
            OutputStream os = new FileOutputStream(file2);

            // Starting writing the bytes in it

            // Writing int value
            os.write(byteInt);

            // Writing char value
            os.write(byteChar);

            // Writing double value
            os.write(byteDouble);

            // Display message for successful execution of
            // program
            System.out.println(
                    "Successfully byte inserted");

            // Close the file connections
            // using close() method
            os.close();
        }

        // Catch block to handle exceptions
        catch (Exception e) {

            // Display message when exceptions occurs
            System.out.println("Exception: " + e);
        }
    }

    // Method 2
    // Main driver method

    // Declaring and initializing data types

    // Method 2
    // Main driver method
    public static void main(String args[]) {
        System.out.println(pathFile);
        // Input string
        String string = "Another test string"
                + "need bytes"
                + " in internet";

        // Getting byte array from string
        // using getBytes() method
        byte bytes[] = string.getBytes();
        // Calling Method 1 to
        // convert byte array to file
        writeByte(bytes);
        int num = 56;
        char ch = 's';
        double dec = 78.9;

        // Inserting integer value
        byte[] byteInt = Integer.toString(num).getBytes();

        // Inserting character value
        byte[] byteChar = Character.toString(ch).getBytes();

        // Inserting double value
        byte[] byteDouble = Double.toString(dec).getBytes();

        // Calling Method 1 to
        // write the bytes into a file
        //writeByte2(byteInt, byteChar, byteDouble);

        //read file
        FileInputStream fileInputStream = null;
        byte[] bFile = new byte[(int) file.length()];
        
        try
        {
           //Read bytes with InputStream
           fileInputStream = new FileInputStream(pathFile);
           fileInputStream.read(bFile);
           fileInputStream.close();
        
           for (int i = 0; i < bFile.length; i++)
           {
              System.out.print((char) bFile[i]);
           }
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
    }
}
