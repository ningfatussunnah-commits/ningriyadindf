package Pertemuan5;
import java.util.Scanner;
public class Tugas1Pemilihan20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas ? "Pembayaran UKT terverifikasi" : "Pembayaran UKT belum lunas";
        System.out.println(pesan);
            
        }
}

