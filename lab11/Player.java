public class Player {

    private String name;
    private int Hp = 100;
    private int maxDamage;

    /**
    * This is a constructor function of class Player.
    *
    */
    public Player(String name, int maxDamage) {
        setName(name);        
        setMaxDamage(maxDamage);;
    }

    /**
    * This method deals damage from other player.
    * @param otherPlayer object of the class Player
    */
    public void dealDamage(Player otherPlayer){
        int damage = 0;
        
        //I want to avoid zero damage so added  1 here
            damage = (int) (Math.random() * otherPlayer.getMaxDamage() + 1);
            setHp(getHp() - damage);      
    }

    @Override
    public String toString() {
        return  
        "name = " + getName() + " : " + 
        "Hp = " + getHp() ;        
    }


    //getter for name
    public String getName() {
        return name;
    }


    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    //getter for hp
    public int getHp() {
        return Hp;
    }


    // setter for hp
    public void setHp(int hp) {
        Hp = hp;
    }


    //getter for maxdamage
    public int getMaxDamage() {
        return maxDamage;
    }


    //setter for maxdamage
    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

}