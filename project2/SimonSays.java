import java.util.*;
public class SimonSays {
    public static void main(String[] args) {
        System.out.println("Welcome to simon Says game ");      
        playGame(); //lets play simon says     
        }

    static int score = 0;

    //set scanner globally
    static Scanner input = new Scanner(System.in);



    //use this method to clear the screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }

    // use this method to pause the code
    public static void pause(){
        try {
            Thread.sleep(3000);
            } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            }
    }

        //generate random Color
    public String generateSimonColor(){
        String simonColor = "";
        int index = ((int)(Math.random() * 4)) + 1;
        
        switch(index){
            case 1:
                simonColor = "Yellow";
                break;

            case 2:
                simonColor = "Green";
                break;
            
            case 3:
                simonColor = "Red";
                break;

            case 4:
                simonColor = "Blue";
                break;

        }
        return simonColor;

    }

    // generate random Number
    public int generateSimonNumber(){
        int num;
        num = (int)(Math.random() * 10);
        
        return num;
    }


        // Check if the user is giving correct answers
    public static void checkAns(String props){

        //convert simon's ans to lowerCase and remove spaces
        String computer = props.replaceAll("\\s+", "").toLowerCase();
        
        System.out.println("Give your answer: ");
        //convert user's ans to lowerCase and remove spaces
        String userInput = input.nextLine().replaceAll("\\s+", "").toLowerCase();
        
        if(userInput.equals(computer)){
            score++;
            System.out.println("Score: " + score);

        }else{
            System.out.println("Game over !");
            System.out.println("Your score was " + score);

            while(true){
                //Ask user for another game
            System.out.println("Do you want to play another game: (Yes/No)");
            String repeatGame = input.nextLine();

            if(repeatGame.equalsIgnoreCase("Yes")){
                score = 0; //reset score to 0
                playGame();
            }else if(repeatGame.equalsIgnoreCase("No")){
                //exit the game
                System.exit(1);
            }
            }         
        }
    }

    //Play easy game mode
    public static void playEasy(int score){
        String simonAllColor = "";
        SimonSays obj = new SimonSays(); 
        while(true){
            String color = obj.generateSimonColor();
            simonAllColor = simonAllColor + color;
            System.out.println("Simon says: " + simonAllColor);
            pause();
            clearScreen();
            checkAns(simonAllColor);
        }    
    }

    //play hard game mode
    public static void playHard (){
        String simonAllNum = "";
        SimonSays obj = new SimonSays(); 
        while(true){
            int num = obj.generateSimonNumber();
            simonAllNum = simonAllNum + num;
            System.out.println("Simon says: " + simonAllNum);
            pause();
            clearScreen();
            checkAns(simonAllNum);
    }}

    //play the game
    public static void playGame(){
        boolean play = true;
        int score = 0;        

        while(play){            
        //select the dificulty level
        System.out.println("Select difficulty (easy / hard): ");
        //remove the spaces
        String easyOrHard = input.nextLine().replaceAll("\\s+", "");

        if(easyOrHard.equalsIgnoreCase("easy")){
            System.out.println("Easy mode -- Colors"); 
            playEasy(score);
            play = false; //stop asking for difficulty          


        }else if(easyOrHard.equalsIgnoreCase("hard")){
            System.out.println("Hard mode -- Numbers");
            playHard();
            play = false; //stop asking for difficulty

        }
        }
    }

    
    
}