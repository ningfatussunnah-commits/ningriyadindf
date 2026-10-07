package Latihan;
import java.util.Scanner;
public class LaundryKiloanDekatKampus {
    public static void main(String[] args){
        Scanner fatus = new Scanner(System.in);

        int beratCucian;
        int tarifPerkg;
        int totBiaya;

        System.out.print("Masukkan Berat Cucian Anda: ");
        beratCucian= fatus.nextInt();

        if (beratCucian <3) {
            tarifPerkg = 7000;
            System.out.println("Anda dikenakan tarif 7000");
        } else if (beratCucian <=6) {
            tarifPerkg = 6000;
            System.out.println("Anda dikenakan tarif 6000");
        } else {
            tarifPerkg = 5000;
            System.out.println("Anda dikenakan tarif 5000");
        }

        totBiaya = beratCucian * tarifPerkg;
        System.out.println("Total Biaya Laubdry anda: " +totBiaya);
    }
}
