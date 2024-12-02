import java.util.Scanner;

public class LibraryFees {

    public static void main(String[] args) {
        int daysLate;
        double fineAmount;
        String isVip;

        Scanner input = new Scanner(System.in); //setup scanner
        System.out.print("enter number of days late: ");
        daysLate = input.nextInt(); //take input

        //ask if the user has VIP access
        System.out.print("Are you a library VIP (yes / no)? ");
        isVip = input.next();

        if(isVip.equalsIgnoreCase("No")){ // if the user is not VIP this code executes
            if(daysLate <=  5){ //if less than or 5 days late
                fineAmount = 1;
                System.out.printf("Late fine is $%.2f for %d days late", fineAmount, daysLate);
                
    
            }else if(daysLate <= 10 ){ //if 5-10 days late
                fineAmount = 5;
                System.out.printf("Late fine is $%.2f for %d days late", fineAmount, daysLate);
    
    
            }else{ //if more than days late
    
                fineAmount = 10;
                System.out.printf("Late fine is $%.2f for %d days late", fineAmount, daysLate);
    
            }

        }else if(isVip.equalsIgnoreCase("Yes")){ //if the user ___is VIP is vip this code executes
            if(daysLate <=  5){ //if less than or 5 days late
                fineAmount = 1.0 / 2.0;
                System.out.printf("Late fine is $%.2f for %d days late", fineAmount, daysLate);
                
    
            }else if(daysLate <= 10 ){ //if 5-10 days late
                fineAmount = 5.0 / 2.0;
                System.out.println(fineAmount);
                System.out.printf("Late fine is $%.2f for %d days late", fineAmount, daysLate);
    
    
            }else{ //if more than days late
    
                fineAmount = 10.0 / 2.0;
                System.out.printf("Late fine is $%.2f for %d days late", fineAmount, daysLate);
    
            }
        }

        input.close(); //close the opened scanner

    }
}