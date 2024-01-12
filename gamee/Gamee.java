
package gamee;


public class Gamee {

    
    public static void main(String[] args) {
        
        //buat objek
        Player Hero = new Player();
        Player Enemy = new Player();
        
        //memberi nilai atribut
        Enemy.nama = "ratarbi";
        
        Hero.name= "Avatar";
        Hero.speed= 91;
        Hero.healthPoin= 67;
        
        Hero.run();
        Hero.attack(Enemy.nama);
        
        if(Hero.isDead()){
            System.out.println("Game Over!");
            
        }
    }
    
}
