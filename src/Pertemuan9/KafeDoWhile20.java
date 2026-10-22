package Pertemuan9;
import java.util.Scanner;
public class KafeDoWhile20 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner (System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi=12000, hargaTeh=7000, hargaRoti=20000;

        do {
            System.out.print("Masukkan Nama Pelanggan (Ketik 'batal' untuk keluar): ");
            namaPelanggan = fatus.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;                
            }
            System.out.print("Jumlah Kopi: ");
            kopi = fatus.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = fatus.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = fatus.nextInt();
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp. " + totalHarga);
            fatus.nextLine();
        } while (true);

        System.out.println("Semua Transaksi Selesai.");
    }    
}
