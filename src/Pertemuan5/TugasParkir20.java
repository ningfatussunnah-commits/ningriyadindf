package Pertemuan5;
import java.util.Scanner;
public class TugasParkir20 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner (System.in);
        int tarifDasar= 2000;
        int tarifTambahan= 1000;
        int lamaParkir;
        int totBiaya;
        System.out.println("Masukkan lama parkir: ");
        lamaParkir= fatus.nextInt();
        if(lamaParkir <= 2){
            totBiaya = tarifDasar;
        } else {
            totBiaya= tarifDasar + ((lamaParkir-2)*tarifTambahan);
        }
        System.out.println("Maka total biaya parkir anda: " +totBiaya);

    }

    
}
