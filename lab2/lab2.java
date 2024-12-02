import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        double giraffeHgtInches = 192;
        Scanner input = new Scanner(System.in);
        System.out.println("Your height in feet and inches.");
        System.out.print("feet & Inches :");
        int feet = input.nextInt(); //take input in feet
        int inches = input.nextInt(); //take input in inches
        int userHeightIn;
        userHeightIn = (feet * 12) + inches ; //assigning  height of user in inches in userHeight variable
        System.out.println("\nYour height in inches is: " + userHeightIn); //display height in inchesOnly
        double compare = giraffeHgtInches / userHeightIn;
        System.out.printf("The average giraffe is %.1f ", compare );
        System.out.print( " times taller than you.");
        input.close(); // closes the input
    }

    
}
