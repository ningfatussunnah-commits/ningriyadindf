// P= 20
// Harga Tiket= 40.000 + (20 mod 6) x 2.000= 40.000 + 2 x 2.000= 44.000
// Syarat Diskon 1= 3 + (20 mod 3)= 3 + 2= 5, mendapat Diskon=  8 + (20 mod 5)= 8 + 0= 8%
// Syraat Diskon 2= 8 + (20 mod 4)= 8 + 0= 8, mendapat Diskon= 15 + (20 mod 4)= 15 + 0= 15%
package Pertemuan9;
import java.util.Scanner;
public class Tugas1_20 {
    public static void main (String[] args){
        Scanner fatus = new Scanner(System.in);
        int hargaTiket= 44000, totTiketTerjual=0;
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
            if (jmlTiket > 8) {
                diskon = 15;
                System.out.println("Diskon: 15%");
            } else if (jmlTiket > 5) {
                diskon = 8;
                System.out.println("Diskon: 8%");
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
