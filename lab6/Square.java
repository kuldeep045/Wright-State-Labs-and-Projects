import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        char c;


            //ask for the height 
        System.out.print("enter the height: ");
        n = input.nextInt();
        if( n < 0){
            System.out.println("Error : n cannot be negative");
            
        }else{
             //ask for the character to print
        System.out.print("enter the character: ");
        c = input.next().charAt(0); 

        //call the method
        prinSquare(n, c);
        }

        

        input.close();
    }

    /**
    * printSquare method prints a hollow square
    * @param n is the height of the square
    * @param c is the character to be printed
    */
    public static void prinSquare(int n, char c){
        

        for (int i = 0; i < n; i++) {   
            //outer loop for column

            for (int j = 0; j < n; j++) {
                //inner loop for row

                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print(c + " ");
                } else{
                    System.out.print("  ");
                }
                
            }
            //change the line
            System.out.println(); 
            
        }


    }


}