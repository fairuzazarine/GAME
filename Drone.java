
package game;


public class Drone {
   // atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    // method
    void terbang(){
        energi--;
        if(energi > 10){
            ketinggian++;
            System.out.println("Drone terbang...");
        } else {
            System.out.println("Energi lemah : Drone nggak bisa terbang ");
        }
    }
    
    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa terbang karena sedang terbang");
        }else {
            System.out.println("Mesin dimatikan...");
        }
    }
    
    void turun(){
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }
    
    void belok(){
        energi--;
        System.out.println("Drone maju kedepan");
        kecepatan++;
        
    }
    
    void maju(){
        energi--;
        System.out.println("Drone maju kedepan");
        kecepatan++;
    }
    
    void mundur(){
        energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }
    
} 

