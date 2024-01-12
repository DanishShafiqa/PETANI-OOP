
package gamee;


public class Player {
 
    String name, nama;
    int speed, healthPoin, damage, shield;
   int hasil= healthPoin-damage+shield;
    
    void run(){
        System.out.println(name+" is running...");
        System.out.println("Speed: "+ speed);
    }
    void attack(String nama){
        System.out.println(name+" is attacking " + nama);
        System.out.println("Damage: "+ damage);
    }
    
    void defense(){
        System.out.println(name+" is defending...");
        System.out.println("health: "+hasil);
        
        
    }
    
    boolean isDead(){
        if(healthPoin<=0) return true;
        return false;
    }
}
