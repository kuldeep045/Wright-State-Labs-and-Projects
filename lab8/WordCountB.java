import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordCountB {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of the file? example.txt");
        String fileName = input.nextLine();
        System.out.println("What would you like to print to the file? Hello World! Wheee");
        String text = input.nextLine();
        File myFile = writeText(fileName, text);
        int numWords = countWords(myFile);
        System.out.println(fileName + " contains " + numWords + " words");



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
        PrintWriter write =  new PrintWriter(file);
        write.println(s);

        
        write.close();
        return myFile;       
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Could not found File");
        
    }
    return myFile;
}
/**
* Counts number of words in file
* A word is any text separated by a whitespace
* @param f is the file where ord is to be counted
* @return the number of words in the file
* @throws e as file not found
*/
public static int countWords(File f)throws FileNotFoundException {
    int count = 0;
    try {
    
    //read the file
    Scanner read = new Scanner(f);
    String content = "";
    
   //read all files and store in content with a whitespace at end
    while (read.hasNextLine()) {
        content += read.nextLine() + " ";
    }
    
    
    //convert the content into array of words
    String [] Arr = content.split("\\s+");
    count = Arr.length;


    
    //System.out.println("Count: " + count);
    read.close();

    return count;
    } catch (FileNotFoundException e) {      
       System.out.println("Error getting files..." + e.getMessage());
            // TODO Auto-generated catch block
            
        
    }
    return count;
    
    }
    
}