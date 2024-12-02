import java.util.*;
public class WeatherB { 
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of days for length of array ");
        int numDays = input.nextInt();
        //length for number of days
        int[][] Array = new int[numDays][3];

        //fill the Array
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Day: " + (i + 1));

            System.out.print("Enter morning temperature: " );
            Array[i][0] = input.nextInt();

            System.out.print("Enter noon temperature: " );
            Array[i][1] = input.nextInt();

            System.out.print("Enter night temperature: " );
            Array[i][2] = input.nextInt();            
        }

        //Average of individual days 
        int day = 1;
        for (int[] nums : Array) {
            System.out.println("The average temperature of day " + day + " is " + dayAvg(nums));
            day++;
        }

        System.out.println("The average morning temperature is " + morningAvg(Array));
        System.out.println("The average noon temperature is " + noonAvg(Array));
        System.out.println("The avegare night temperature is " + nightAvg(Array));     
        
        input.close();
    }
        /**
     * Give average temperature of morning.
     *
     * @param Arr The 2d Array having all data of temperature of all days
     * @return morningAvg The average morning temperature of all day
     */
    static int morningAvg(int[][] Arr){
        int morningAvg = 0;
        int morningTotal = 0;

        for (int[] morning : Arr) {
            morningTotal += morning[0];
        }
        morningAvg = morningTotal / Arr.length;
        return morningAvg;
    }


            /**
     * gives the avg temperature of day.
     *
     * @param Arr The Array having data of temperature of each day
     * @return dayAvg The average temperature of the whole day
     */

    static int dayAvg(int[] Arr){
        int dayAvg = 0; 
        int dayTotal = 0;
        for (int days : Arr) {
            dayTotal += days;
            dayAvg = dayTotal / 3;
        }
        return dayAvg;
    }

        /**
     * Gives average temperature of noon
     *
     * @param Arr The 2d Array having all data of temperature of all days
     * @return noonAvg The average noon temperature of all day
     */
    static int noonAvg(int[][] Arr){
        int noonAvg = 0;
        int noonTotal = 0;
        for (int[] noon : Arr) {
            
            noonTotal += noon[1];
    
            }
            noonAvg = noonTotal / Arr.length;
            return noonAvg;
    }

        /**
     * Gives average temperature of night
     *
     * @param Arr The 2d Array having all data of temperature of all days
     * @return nightAvg The average night temperature of all day
     */
    static int nightAvg(int[][] Arr){
        int nightAvg = 0; 
        int nightTotal = 0; 
        for (int[] night : Arr) {
            
            nightTotal += night[2];
    
            }
            nightAvg = nightTotal / Arr.length;
            return nightAvg;
        }




}