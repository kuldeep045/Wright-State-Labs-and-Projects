public class Driver {
    

    public static void main(String[] args) {
      Player p1 = new Player("One man punch", 20);  
      Player p2 = new Player("Alien", 5);

      //run the loop until one player dies
        while(p1.getHp() > 0 && p2.getHp() > 0){
            System.out.print(p1.toString() + "\t \t");
            System.out.println(p2.toString());
            p1.dealDamage(p2);
            p2.dealDamage(p1);
        }
        if(p1.getHp() > 0){
            System.out.println("Winner is " + p1.toString());
            
        }else{
            System.out.println("Winner is " + p2.toString());

        }

    }
}
