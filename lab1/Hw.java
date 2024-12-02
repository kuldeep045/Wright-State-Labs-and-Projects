import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your day: ");
        int day = input.nextInt();        
        System.out.print("Enter your month: ");
        String month = input.next();        
        System.out.print("Enter your year: ");
        int year = input.nextInt();
        System.out.println("day: " + day);
        System.out.println("month: " + month);
        System.out.println("year: " + year);
        input.close();

    }
    
}
