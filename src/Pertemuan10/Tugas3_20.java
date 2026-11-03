package Pertemuan10;
import java.util.Scanner;
public class Tugas3_20 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);
        int jmlToko;
        int jmlPelanggan;
        int jmlBarang= 0;
        int totBarangPerToko;
        int totBarangSeluruhToko= 0;
        int tokoTerbanyak= 0;
        int maksJmlBarang= -1;

        System.out.print("Jumlah Toko (minimal 1): ");
        jmlToko = fatus.nextInt();
        System.out.println();
        
        for(int i = 1; i <= jmlToko; i++) {
            System.out.print("Jumlah Pelanggan Toko " + i + ": ");
            jmlPelanggan = fatus.nextInt();
            while (jmlPelanggan < 0) {
                System.out.print("Jumlah Pelanggan tidak boleh negatif. Masukkan Ulang: ");
                jmlPelanggan = fatus.nextInt();
            }
            totBarangPerToko= 0;
            for (int j = 1; j <= jmlPelanggan; j++) {
                System.out.print("Jumlah Barang Pelanggan " + j + " - Toko " + i + ": ");
                jmlBarang = fatus.nextInt();
                while (jmlBarang < 0) {
                    System.out.print("Jumlah Barang tidak boleh negatif. Masukkan Ulang: ");
                    jmlBarang = fatus.nextInt();
                }
                totBarangPerToko += jmlBarang;
            }
            System.out.println("Toko " + i + " - Pelanggan: " + jmlPelanggan + ", Total Barang: " + totBarangPerToko);
            totBarangSeluruhToko += totBarangPerToko;
            if (totBarangPerToko > maksJmlBarang) {
                maksJmlBarang = totBarangPerToko;
                tokoTerbanyak = i;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Barang Seluruh Toko: " + totBarangSeluruhToko);
        System.out.println("Toko dengan Barang Terbanyak: " + tokoTerbanyak);
    }
}
