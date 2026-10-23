// P= 20
// Harga Kopi= 10.000 + (20 mod 5) x 1.000= 10.000 + 0 x 1.000= 10.000
// Harga Teh= 5.000 + (20 mod 4) x 1.000= 5.000 + 0 x 1.000= 5.000
// Harga Roti= 15.000 + (20 mod 6) x 1.000= 15.000 + 2 x 1.000= 17.000
package Pertemuan9;
import java.util.Scanner;
public class KafeDoWhile20 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner (System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi=10000, hargaTeh=5000, hargaRoti=17000;

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
