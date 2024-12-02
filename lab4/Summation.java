import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //setting scanner
        int num;
        int sum = 0;
        int i = 0;       
        while(true){ //make an infinite loop
            if(sum < 100){
                System.out.print("Enter a number: ");
                num = input.nextInt();//taking input
                sum += num;
                if(sum < 100){
                    i++;
                }        
            }else{
                break; //exit out from the loop
            }          
            }
            System.out.println("You entered " + i +" values before the total was greater than 100.");
            System.out.println("You exceeded 100 by " + (sum - 100) + ".");
        input.close();

    }
}