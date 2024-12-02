import java.util.Scanner;

public class Weather{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int dayNum = input.nextInt();
        
        //enter length of Array
        int [] weatherArr = new int[dayNum]; 
        System.out.print("Enter temperature of each day: ");

        //Fill the array
        for (int i = 0; i < weatherArr.length; i++) {
            weatherArr[i] = input.nextInt();
        }

        //call the method
        int average = avgTemp(weatherArr);
        System.out.println("your average temperature of " + weatherArr.length + " days was: " + average);

        input.close();
    }

     /**
 * Averages the numbers in an array
 * @param array of temperature of each days
 * @return  average temperature in integer
 */

 

 static int avgTemp(int [] Array){
    int sumTemp = 0;
    for (int temperature : Array) {

        sumTemp += temperature; 
    }

    return sumTemp / Array.length;
 }

}