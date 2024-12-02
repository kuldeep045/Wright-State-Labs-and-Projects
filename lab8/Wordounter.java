import java.io.*;
import java.util.Scanner;


public class Wordounter {
 
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the FileName: ");
        String fName = scnr.nextLine();

        System.out.println("Write the message to print");
        String message = scnr.nextLine();


        File myFile = writeText(fName, message);
        int count = countWords(myFile);
        System.out.println(fName + " contains " + count + " words");



        scnr.close();
    }
     /**
 * Creates a file, writes provided string to file, returns File object
 * @param filename Name of the file to be created
 * @param s message to be printed on the file
 * @return file
 * @throws FIleNOtFOundException
 */
 public static File writeText(String filename, String s)throws FileNotFoundException{
    File Newfile = new File(filename);
  try {

    FileOutputStream file = new FileOutputStream(filename, true);
    PrintWriter printOn = new PrintWriter(file);

    printOn.println(s);

    printOn.close();
    file.close();
  } catch (Exception e) {
    
    System.out.println("ERROR: " + e.getMessage());
  }

 return Newfile;
 }

  /**
 * Counts number of words in file
 * A word is any text separated by a whitespace
 * @param f A file containing words
 * @return number of words in file
 * @throws e filenotFoundException
 */
public static int countWords(File f)throws FileNotFoundException {

    String content = "";
    int Wordcount = 0;

    try(Scanner input = new Scanner(f)) {
        
        while (input.hasNextLine()) {
            content += input.nextLine() + " ";
        }
        Wordcount = content.split("\\s+").length;
        return Wordcount;


    } catch (Exception e) {
        
        System.out.println("ERROR: " + e.getMessage());
    }
    return Wordcount;


    
    }


}
