import java.util.ArrayList;
import java.util.Scanner;


/**
 * I have added a feature which is to show the user location of them and the monsters
 * there will be one chance only for this also to activate this chance hero's health should become less than 50
 * 
 * This class is basically to drive the whole game
 */

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String direction = "";
        Main obj = new Main();
        int chance = 1;


        //create actor
        Actor hero = obj.makeActor();
        System.out.println(hero.toString());

        
        int cataSize = obj.getDungeonSize();
        ArrayList<Actor> monstersList = obj.makemonsters(cataSize);

        input.nextLine();//consume new line character

        System.out.println("You smell " + obj.countNearbyMonsters(hero, monstersList) + " monsters nearby. ");

        
        while (!hero.hasEscaped(cataSize)) {
            boolean canMove = true;

            do{
                System.out.print("Which way do you want to move (east, west, north, south)? ");
                direction = input.nextLine();

                canMove = hero.move(direction, cataSize);


                //this is the additional feature that give one chance chance to user to see the location of monsters and their own \
                // only if hero's health is less than 50
                if(direction.equalsIgnoreCase("show map") && chance == 1 && hero.getHealth() < 50){
                    obj.showMap(hero, monstersList, cataSize);
                    chance = 0;

                }else if(!canMove){ //only executes if "show map is not the command"

                    System.out.println("You cant move that way ");
                }
                System.out.println(hero.toString());

            }while(!canMove);



            for(int i = 0; i < monstersList.size(); i++){

                //check if hero and monster are in same room
                if(monstersList.get(i).inSameRoom(hero)){
                    obj.fight(hero, monstersList.get(i));
                    
                }



                //if monster is dead remove it from the catacomb
                if(!monstersList.get(i).isAlive()){
                    System.out.println("monster " + (monstersList.indexOf(monstersList.get(i)) + 1) + " has been defeated.");
                    hero.toString();
                    monstersList.remove(monstersList.get(i));
                    i--;
                
                }
                }


            if(!hero.isAlive()){
                System.out.println("Ohh no you are dead");
                System.exit(0);
            }
            

            
            

            //smell for monsters
            if(!hero.hasEscaped(cataSize)){
                System.out.println("You a smell " +  obj.countNearbyMonsters(hero, monstersList) + " monsters nearby. ");
            }        
            }

            //hero exxcaped successfully
        if(hero.hasEscaped(cataSize)){
            System.out.println("You have escaped the catacomb ");
        }
        
}

/**
 * This method create an objct from class Actor having desired name from user
 * 
 * 
 * @return An object of class Actor called hero
 */
    
    public Actor makeActor(){
        System.out.print("Hey heroic adventurer, what is your name? ");
        String name = input.nextLine();
        Actor hero = new Actor(name, 100);
        hero.setMaxDamage(10);
        hero.setCol(0);
        hero.setRow(0);
        return hero;
    }


    /**
 * this method takes the size of catacomb in terms of row and column
 * 
 * @return the size of the catacomb
 */
    public int getDungeonSize(){
        int size = 0;
        while(size < 5 || size > 10){            
            System.out.print("How wide of a catacomb do you want to face (5-10)? ");
            size = input.nextInt();
            if(size < 5 || size > 10){
                System.out.println("Not a valid size of catacomb ");
            }
        }
        return size;
    }


    /**
 * this method makes one monsters for every six rooms
 * 
 * @param dungenSize number of row and columns in catacomb
 * @return An arraylist of monsters made from class Actor
 */
    
    public ArrayList<Actor> makemonsters(int dungeonSize){
        int i = 0;
        int row = 0;
        int col = 0;

        ArrayList<Actor> monstersList = new ArrayList<>();

        while(i < (dungeonSize * dungeonSize / 6)){
            row = (int) (Math.random() * dungeonSize);
            col = (int) (Math.random() * dungeonSize);
            
            i++;
            Actor monster = new Actor();
            monster.setHealth(25);
            monster.setMaxDamage(5);
            monstersList.add(monster);

            //ensure hero does not face monster in first room
            if(row == 0 && col == 0){
                monstersList.remove(monstersList.get(monstersList.size() - 1));
                i--;
            }else{
                monster.setCol(col);
                monster.setRow(row);
            }
        }

        
        return monstersList;
    }


    /**
 * this method counts monsters in adjacent rooms
 * 
 * @param hero an instance of class Actor representing hero
 * @param monsterlist an arraylist of instances of class Actor representing monster
 * @return count of the monsters in adjacent rooms to the user
 */
    public int countNearbyMonsters(Actor hero, ArrayList<Actor> monsterslist){
        int count = 0;

        for (Actor actor : monsterslist) {
            if(hero.inAdjacentRoom(actor)){
                count++;
            }
            
        }

        return count;
    }

    /**
 * this method is used to fight between the characters.
 * 
 * @param hero an instance of class Actor representing hero
 * @param monsters an arraylist of instances of class Actor representing monster
 */

    public void fight(Actor hero, Actor monster){
        int herodmg = 0;
        int monsterdmg = 0;
        
                while (hero.getHealth() > 0 && monster.getHealth() > 0) {
                //damage on monster
                herodmg = monster.dealDamage(hero);
                System.out.println("You hit for " + herodmg);

                //damage on hero
                monsterdmg = hero.dealDamage(monster);
                System.out.println("You get hit for " + monsterdmg);
                    
                
                
        }
    }


    
    /**
 * shows the current position of user and monster to user.
 * 
 * @param hero an instance of class Actor representing hero
 * @param monsters an arraylist of instances of class Actor representing monster
 * @param catasize is the size of catacomb
 */

    public void showMap(Actor hero, ArrayList<Actor> monsters, int cataSize){

        // hero location
        int heroX = hero.getCol();
        int heroY = hero.getRow();

        //monsters location
        for (int i = 0; i < cataSize; i++) {
           
            for (int j = 0; j < cataSize; j++) {

                if(i == heroY && j == heroX){
                    System.out.print(" H \t");
                }else{

                    boolean cond = true;
                    for (Actor monster : monsters) {                    
                        if(i == monster.getRow() && j == monster.getCol()){
                            System.out.print(" M \t");
                            cond = false;
                            break;
                        }
                    }
                    if(cond){
                        System.out.print(" * \t");
                    }
                    
                }
               
            }
        
        System.out.println("\n \n \n");
        
        }

    }

}