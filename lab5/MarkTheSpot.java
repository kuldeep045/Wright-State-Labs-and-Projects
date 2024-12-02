import java.util.Scanner;
public class MarkTheSpot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" What is the value of n?");
        ;

        
        
        
        int n = input.nextInt();

        //verify the validity of the input and throw error id invalid
        if(n < 0){
            System.out.print(" Error: n cannot be negative");
        }else{
            //Locate the position of X
        System.out.print("Where do you want to put the X? (enter in format X Y) e.g 3 2 : ");
        int X = input.nextInt();
        int Y = input.nextInt();  
        
        
        for(int i = 0; i < n; i++){
        
            for(int j = 0; j < n; j++){
                
                //select the border only in if condition
                if(i == 0 || i == n - 1 || j == 0 || j == n-1){
                    
                    System.out.print("* ");                   
                    
                }else{
                    if(i == X && j == Y){
                    
                    System.out.print("X "); //place X at user specified place
                    }else{
                    System.out.print("  "); // space only in all places except border and user specified place
                    }
                }
            
            }
            System.out.println(); // gives a line break
        }}
        input.close();
    }
}