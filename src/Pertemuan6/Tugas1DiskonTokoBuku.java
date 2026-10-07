package Pertemuan6;
import java.util.Scanner;
public class Tugas1DiskonTokoBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;
        double diskon;

        System.out.println("Masukkan Jenis Buku Anda: ");
        jenisBuku = sc.nextLine();
        System.out.println("Masukkan Jumlah Buku yang Anda Beli: ");
        jumlahBuku = sc.nextInt();
        
        if (jenisBuku.equalsIgnoreCase("kamus") && jumlahBuku>2) {
            diskon = 0.10;
        } else if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.08;
        } else if (jenisBuku.equalsIgnoreCase("novel") && jumlahBuku>3){
            diskon = 0.05;
        } else if (jenisBuku.equalsIgnoreCase("novel") && jumlahBuku<=3){
            diskon = 0.01;
        } else if (!jenisBuku.equalsIgnoreCase("kamus") && !jenisBuku.equalsIgnoreCase("novel") && jumlahBuku>3){
            diskon = 0.03;
        } else {
            diskon = 0.0;
        }
        System.out.print("Selamat anda mendapatkan diskon: " + (int)(diskon*100) + "%");
    }
}
