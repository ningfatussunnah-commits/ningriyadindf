package Pertemuan9;
import java.util.Scanner;
public class Tugas2_20 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner (System.in);
        int jenis, durasi, total=0;
        int tarifMobil= 3000, tarifMotor= 2000;

        do {
            System.out.print("Masukkan Jenis Kendaraan (Mobil [1] / Motor [2] / Keluar [0]: ");
            jenis = fatus.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir: ");
                durasi = fatus.nextInt();
                if (jenis == 1) {
                    total += durasi * tarifMobil;
                } else {
                    total += durasi * tarifMotor;
                }
            } else if (jenis!=0) {
                System.out.println("Jenis Kendaraan tidak valid!");
            }
            
        } while (jenis!=0);

        System.out.println("Total Pembayaran Parkir: " +total);

    }
}
