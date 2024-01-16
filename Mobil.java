
package game;


public class Mobil {
    int energi;
    int kecepatan;
    int belok;
    String warna;
    
    void Melaju(){
        energi--;
        if (energi > 35) {
            kecepatan++;
            System.out.println("Mobil Melaju..");
        }else {
            System.out.println("Energi kurang : mobil tidak bisa melaju");
        }
        
    }
    void belok(){
        energi--;
        if (energi > 50) {
            kecepatan++;
            System.out.println("Mobil belok kekanan");
        } else {
            System.out.println(" Mobil belok kekiri");
        }
    }
    
    void mundur(){
        energi--;
        System.out.println(" Mobil mundur");
        kecepatan++;
    }
    
    void MobilBerhenti(){
        energi--;
        if (kecepatan < 60) {
            kecepatan++;
            System.out.println("Mobil berhenti");
        } else {
            System.out.println("Mobil tidaka bisa berhenti karena terlalu cepat");
        }
    }
}
