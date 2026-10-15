package Latihan;

import java.util.Scanner;

public class sistemTransaksiKantinKejujuran {
    public static void main(String[] args) {
        Scanner fatus = new Scanner (System.in);

        System.out.print("Masukkan Jenis Makanan (Nasi Kantin [1] / Paket Hemat [2]): ");
        int jenisMakanan = fatus.nextInt();
        System.out.print("Jumlah Porsi Makanan: ");
        int jmlMakanan = fatus.nextInt();
        System.out.print("Jumlah Minuman: ");
        int jmlMinuman = fatus.nextInt();
        System.out.print("Apakah Memiliki Member? (true/false): ");
        boolean isMember = fatus.nextBoolean();
        int hargaMakanan = 25000;
        int hargaMinuman = 9000;
        int diskon = 0;
        int totHarga;
        int totBiayaAkhir;

        switch (jenisMakanan) {
            case 1:
                System.out.println("Nasi Kantin");
                break;
            case 2:
                System.out.println("Paket Hemat");
        }

        totHarga= (jmlMakanan*hargaMakanan) + (jmlMinuman*hargaMinuman);
        System.out.println("Total Harga: " +totHarga);

        if (totHarga > 70000) {
            diskon=5;
            int nominalDiskon = totHarga * diskon /100;
            System.out.println("Diskon= 5% (Rp."+nominalDiskon+" )");
            if (isMember == true) {
                int potonganHarga = 5000;
                System.out.println("Potongan Harga= 5.000");
            } else {
                System.out.println("Tidak ada potongan tambahan.");
            }
        } else {
            System.out.println("Tidak mendapat diskon.")
        }

        totBiayaAkhir = totHarga - diskon;
    }
}
