
package game;


public class Game {

    
    public static void main(String[] args) {
        //Buat Objek player
        Player hero = new Player();
        Player enemy = new Player();
        
        //mengisi atribut player
        hero.name = "jeya" ;
        hero.speed = 83 ;
        hero.damage = 65 ;
        hero.armor = 76 ;
        hero.healthPoin = 0;
        
        enemy.name = "nisa";
        enemy.speed = 7;
        enemy.damage = 76;
        enemy.armor = 23;
        enemy.healthPoin = 98;
        
        //menjalankan method
        hero.run();
        hero.attack(enemy.name);
        hero.defend();
        
        
        
        if (hero.isDead()){
            System.out.println("Game Over! ");
        }
        
        Drone fa = new Drone();
        
        fa.energi = 34;
        fa.ketinggian = 0;
        fa.kecepatan = 110;
        fa.merek = "faschi";
        
        fa.terbang();
        fa.turun();
        fa.matikanMesin();
        fa.belok();
        fa.maju();
        fa.mundur();
    
    
        Mobil sa = new Mobil();
    
        sa.energi = 40;
        sa.kecepatan = 50;
        sa.belok = 34;
        sa.warna = "merah";
    
        sa.Melaju();
        sa.belok();
        sa.mundur();
        sa.MobilBerhenti();
    
    }
   
    
}
