import java.io.*;
import java.util.*;

//RAJENDRA
public class Words {

    static File file = new File("words.txt");
    static Scanner scnr = new Scanner(System.in);
    static ArrayList<String> previousGuesses = new ArrayList<>(); // store history

    static int score = 0;

    public static void main(String[] args) throws Exception {
        String word = getWord();
        mix(word);
        mainGame(word);

    }

    /**
    * this method ask user guess and validate if it it is in list or not and letters are not in original word
    * @param word a word given by my system at the start of the play
    * 
    */
    static void mainGame(String word) throws IOException {
        ArrayList<String> list = new ArrayList<>(); // all words from file
        ArrayList<String> systemArr = new ArrayList<>();

        String[] arrayList = word.split("");
        for (String c : arrayList) {
            systemArr.add(c);
        }

        try (Scanner fileData = new Scanner(file)) {

            while (fileData.hasNextLine()) {
                list.add(fileData.nextLine());

            }

        } catch (Exception e) {
            System.out.println("ERROR READING FILE: ");
            throw new Error(e);
        }

        // repeat from here if guess is wrong

        
        String guess = scnr.nextLine();
        if (guess.equalsIgnoreCase("bye")) {
            score("");
            System.exit(1);

            return;
        }

        //shuffle the word of "mix"
        if (guess.equalsIgnoreCase("mix")) {
            mix(word);
            mainGame(word);
        }


        //PREVIOUS GUESSES WHICH WERE RIGHT
        if (guess.equalsIgnoreCase("ls")) {
            if (previousGuesses.size() == 0) {
                System.out.println("NO WORDS IN previousGuesses");
            }else{
                System.out.println("WORDS IN previousGuesses: ");
            for (String inc : previousGuesses) {
                System.out.println(inc);
            }}
            mainGame(word);
        }

        //IF GUESS IS ALREADY GUESSED
        if(previousGuesses.contains(guess)){
            System.out.println("ALREADY GUESSED: ");
            System.out.println("CURRENT SCORE: " + score);
            mainGame(word);
        }
        // System.out.println(guess.length());
        if (guess.length() < 4) {
            System.out.println("Minimum four letter required: ");
            mainGame(word);

        }

        String[] userChar = guess.split("");
        //IF USERS' GUESS HAS INVALID LETTER
        for (String c : userChar) {
            if (!(systemArr.contains(c))) {
                System.out.println("YOUR WORD CONTAINS WRONG LETTER");
                mainGame(word);
            }
        }

        // System.out.println("guess: " + guess);
        //
        if (list.contains(guess)) {
            score(guess);
            previousGuesses.add(guess);
            mainGame(word);
        } else {
            System.out.println("Wrong guess");
            mainGame(word);
        }

        scnr.close();

    }

    // GET WORD FROM THE FILE
    static String getWord() throws IOException {
        String word = "";

        boolean check = true;
        ArrayList<String> Arrlist = new ArrayList<>();
        Set<String> charSet = new HashSet<>();

        // read the file

        Random rand = new Random();

        try (Scanner scnr = new Scanner(file)) {

            while (scnr.hasNextLine()) {
                Arrlist.add(scnr.nextLine());
            }

            while (check) {
                // generate random index
                int index = rand.nextInt(Arrlist.size() + 1);

                if (Arrlist.get(index).length() == 7) {

                    String[] Arr = Arrlist.get(index).split("");

                    for (String string : Arr) {
                        charSet.add(string);
                    }

                    if (charSet.size() == 7) {
                        check = false;
                        word = Arrlist.get(index);
                        break;

                    } else {
                        charSet.clear();
                    }
                }

            }

        } catch (Exception e) {

            throw new Error(e);
        }

        return word;
    }

    // mix the word
    static void mix(String name) {
        int index = 0;
        char temp;
        Random rand = new Random();

        char[] charArr = name.toCharArray();

        
        for (int i = charArr.length - 1; i > 0; i--) {
            index = rand.nextInt(i + 1);
            temp = charArr[i];
            charArr[i] = charArr[index];
            charArr[index] = temp;

        }

        for (char c : charArr) {
            System.out.print(c + "\s");
        }
        System.out.println();
    }

    // UPDATE THE SCORE
    static void score(String word) {
        if (word.length() == 4) {
            score += 1;
        } else {
            score += word.length();
        }
        System.out.println("Score: " + score);
    }

}
