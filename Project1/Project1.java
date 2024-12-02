import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int questionCount = 0, ansCount = 0;

        // ask first question and take integer as input
        System.out.println("How many states are in the United States? ");
        questionCount += 1;
        int noOfStates = input.nextInt();
        if (noOfStates == 50) {
            System.out.println("Correct! ");
            ansCount += 1;
        } else {
            System.out.println("Incorrect !");
        }

        // clear the newLine in buffer added by nextInt();
        input.nextLine();

        // ask second question and take a string as input
        System.out.println("Who was the first president of united states?");
        questionCount += 1;
        String president = input.nextLine();
        if (president.equalsIgnoreCase("GEORGE WASHINGTON")) {
            System.out.println("Correct !");
            ansCount += 1;
        } else {
            System.out.println("Incorrect !");
        }

        // ask third question and take boolean as input
        System.out.println("True or False. The sun is a Star. ");
        questionCount += 1;
        boolean isSunStar = input.nextBoolean();
        if (isSunStar) {
            System.out.println("Correct !");
            ansCount += 1;

        } else {
            System.out.println("Incorrect !");
        }

        // ask fourth question and take a double as input
        System.out.println("What is the value of pi up to the second decimal point?");
        questionCount += 1;
        double valOfPi = input.nextDouble();
        if (valOfPi == 3.14) {
            System.out.println("Correct !");
            ansCount += 1;

        } else {
            System.out.println("Incorrect !");
        }

        // ask the final question and take a character as an input
        System.out.println("What is the first letter of the English alphabet?");
        questionCount += 1;
        char alpha = input.next().charAt(0);
        if (alpha == 'a' || alpha == 'A'){
            System.out.println("Correct !");
            ansCount += 1;
        } else {
            System.out.println("Incorrect !");
        }
        double percent = (ansCount * 100.00) / questionCount ;

        // display the result of quiz
        System.out.println("You got " + ansCount + " out of " + questionCount + " right, for a score of " + percent + "%");
        input.close(); // close the scanner
    }
}