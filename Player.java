
package game;


public class Player {
    String name;
    int speed;
    int  damage;
    int armor;
    int healthPoin;
    String healthpoin;
    
    
    void run(){
        System.out.println(name + " is running...");
        System.out.println("Speed: " + speed);
        
}
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
        
   }
    void attack (String a){
         System.out.println (name + " attacking");
         System.out.println("damage:" + damage);
}
    void defend () {
            System.out.println(name + " is defend");
            System.out.println("armor:" + armor);
}
    
 }

    
 

