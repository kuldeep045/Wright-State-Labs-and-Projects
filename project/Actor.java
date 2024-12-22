public class Actor {

    //instance variables
    private String name;    
    private int health;
    private int maxDamage;
    private int row = 0;
    private int col = 0;

    // constructor without parameters
    public Actor() {
    }

    
    /**
 * deals the damage from the other actor
 * deals damage randomly between 0 to max damage of other actor
 * 
 * @param othrActor instance of class Actor which deal damage on current actor
 * @return amount of damage got from other actor
 * 
 */
    public int dealDamage(Actor otherActor){
            int damage = 0;
            damage = (int)(Math.random() * otherActor.getMaxDamage() + 1);
            setHealth(getHealth() - damage);

            return damage;


    }


    
/**
 * constructor with name and health
 * @param name Name given by the user to hero
 * @param health health of the Actor
 */
    public Actor(String name, int health) {
        setName(name);
        setHealth(health);   
}

    
    
    /**
    * getter for name
    * 
    * @return name of the actor
    */    
    public String getName() {
        return name;
    }

    
    /**
    * setter for name
    * 
    */     
    public void setName(String name) {
        this.name = name;
    }


    
    /**
    * getter for health
    * 
    * @return health of the actor
    */ 
    public int getHealth() {
        return health;
    }

    
    /**
    * setter for health
    * 
    * @param health of the actor
    */ 
    public void setHealth(int health) {
        this.health = health;
    }


    
    /**
    * getter for maxDamage
    * 
    * @return maximum Damage of the actor
    */ 
    public int getMaxDamage() {
        return maxDamage;
    }

    
    /**
    * setter for maxDamage
    * 
    * @param maxDamage Damage of the actor
    */ 
    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    
    /**
    * getter for row
    * 
    * @return current row of user    
    */     
    public int getRow() {
        return row;
    }

    
    /**
    * setter for row
    * 
    * @param row set current row of actor    
    */  
    public void setRow(int row) {
        this.row = row;
    }

    
    /**
    * getter for column
    * 
    * @return column of current actor    
    */ 
    public int getCol() {
        return col;
    }

    
    /**
    * getter for column
    * 
    * @param col col of  current user  
    */ 
    public void setCol(int col) {
        this.col = col;
    }

    /**
    * check if actor is alive or not.
    * if health is greater than 0 than the actor is alive else dead
    * 
    * @return true if actor is alive.
    */ 
    public boolean isAlive(){
        return getHealth() > 0;
    }

    /**
    * check if other actor is present in adjacent room.
    * 
    * @param otherActor object of other actor.
    * @return true if adjacent room contains another actor.
    */ 
    public boolean inAdjacentRoom(Actor otherActor){

        return (getCol() == otherActor.getCol() + 1 && getRow() == otherActor.getRow())
                || (getRow() == otherActor.getRow() + 1  && getCol() == otherActor.getCol())
                || (getCol() == otherActor.getCol() - 1 && getRow() == otherActor.getRow())
                || (getRow() == otherActor.getRow() - 1 && getCol() == otherActor.getCol());
    }

     /**
    * check if the hero and monster in same room.
    * 
    * @param otherActor object of other actor.
    * @return true if same room contains another actor.
    */ 
    public boolean inSameRoom(Actor otherActor){
        return getCol() == otherActor.getCol() && getRow() == otherActor.getRow();
    }






     /**
    * check if actor can move or not in the given direction
    * decrease health by 2 if can move
    * 
    * @param direction which way user wants to move("east", "west", "north", "south")
    * @param dungeonSize size of the catacomb

    * @return true if user is able to move in their specified direction, else false
    */     
    public boolean move(String direction, int dungeonSize){

        switch(direction.toLowerCase()){
            case "east":
                if(getCol() == dungeonSize - 1){
                    return false;
                }else{
                    setCol(getCol() + 1);
                }
                break;


            case "west":
                if(getCol() == 0){
                    return false;
                }else{
                    setCol(getCol() - 1);
                }
                break;
                
            

            case "north":
                if(getRow() == 0){
                    return false;
                }else{
                    setRow(getRow() - 1);
                }
                break;
                

            case "south":
                if(getRow() == dungeonSize - 1){
                    return false;
                }else{
                    setRow(getRow() + 1);
                }
                break;                

            default:
                return false;


        }

        setHealth(getHealth() - 2);
        return true;
    }


    @Override
    public String toString() {
        return getName() + " is at column: " + getCol() + ", and row: " + getRow() + " with " + getHealth() + " health";
    }
    
    /**
    * check if user has escaped from catacomb.
    * 
    * @param dungeonSize The size of the catacomb.
    * @return True if the actor has reached the exit, located at the bottom-right corner.
    */ 
    public boolean hasEscaped(int dungeonSize){
        return getCol() == dungeonSize - 1 && getRow() == dungeonSize - 1;
    } 
    
    
}