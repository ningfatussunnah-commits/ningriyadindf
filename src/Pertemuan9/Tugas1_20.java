package Pertemuan9;
import java.util.Scanner;
public class Tugas1_20 {
    public static void main (String[] args){
        Scanner fatus = new Scanner(System.in);
        int hargaTiket= 50000, totTiketTerjual= 0;
        int totHargaPenjualan=0;

        while (true) {
            System.out.print("Masukkan Jumlah Tiket yang Dibeli (Ketik 0 jika ingin berhenti): ");
            int jmlTiket = fatus.nextInt();

            if (jmlTiket == 0) {
                break;
            }

            if (jmlTiket < 0) {
                System.out.println("Input Tidak Valid, Mohon Input Ulang.");
                continue;
            }

            int diskon= 0;
            if (jmlTiket > 10){
                diskon = 15;
                System.out.println("Diskon: 15%");
            } else if (jmlTiket > 4) {
                diskon = 10;
                System.out.println("Diskon: 10%");
            } else {
                System.out.println("Diskon: 0%");
            }

            int totHarga = jmlTiket * hargaTiket;
            int totHargaAkhir = totHarga - (totHarga * diskon / 100);

            totTiketTerjual += jmlTiket;
            totHargaPenjualan += totHargaAkhir;

            System.out.println("Total Harga: " +totHargaAkhir);
        }
        System.out.println("Total Tiket Terjual: " +totTiketTerjual);
        System.out.println("Total Penjualan Tiket: " +totHargaPenjualan);
    }
}
