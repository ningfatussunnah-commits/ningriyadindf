package Pertemuan12;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);

            String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh tarik", "Cappucino", "Chocolate Ice"};
            int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

            for (int i = 0; i < menu.length; i++) {
                System.out.println((i+1) + ". " + menu[i] + " - Rp. " + harga[i]);
            }
            System.out.print("Jumlah yang ingin dipesan: ");
            int jmlPesanan = fatus.nextInt();
            fatus.nextLine();

            String[] pesanan = new String[jmlPesanan];
            int[] hargaPesanan = new int[jmlPesanan];
            int totBiaya = 0;

            for (int i = 0; i < jmlPesanan; i++) {
                System.out.print("Masukkan menu pesanan: ");
                String menuPesanan = fatus.nextLine();

                int ditemukan = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(menuPesanan)) {
                        ditemukan = j;
                        break;
                    }
                }

                if (ditemukan != -1) {
                    pesanan[i] = menu[ditemukan];
                    hargaPesanan[i] = harga[ditemukan];
                    totBiaya += harga[ditemukan];
                } else {
                    System.out.println("Menu tidak tersedia. Masukkan ulang!");
                    i--;
                }
            }

            for (int j = 0; j < pesanan.length; j++) {
                System.out.println((j+1) + ". " + pesanan[j] + ": Rp. " + hargaPesanan[j]);
            }
            System.out.println("Total Biaya: " + totBiaya);
    }
}
