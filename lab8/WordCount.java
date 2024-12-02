import java.io.*;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of the file? example.txt");
        String fileName = input.nextLine();
        System.out.println("What would you like to print to the file? Hello World! Wheee");
        String text = input.nextLine();
        writeText(fileName, text);



        input.close();
        
    }
    /**
* Creates a file, writes provided string to file, returns File object
* @param filename is the name of file to be created
* @param s is the text to be printed in file
* @return file created as an object
* @throws e filenot found
*/
public static File writeText(String filename, String s)throws Exception{
    File myFile = new File(filename);
    try {
        FileWriter file = new FileWriter(filename, true);
        
        file.write(s);

        
        
        file.close();
        return myFile;


       
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Could not found File");
        
    }
    return myFile;
}
}