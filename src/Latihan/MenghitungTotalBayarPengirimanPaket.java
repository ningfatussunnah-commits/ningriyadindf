package Latihan;

import java.util.Scanner;

public class MenghitungTotalBayarPengirimanPaket {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);

        int beratPaket;
        int tarifLayanan= 0;
        String jenisLayanan;
        int totalBiayaPengiriman;

        System.out.println("Masukkan Jenis Layanan Pengiriman Anda: ");
        jenisLayanan = fatus.nextLine();
        System.out.println("Masukkan Berat Paket Anda: ");
        beratPaket = fatus.nextInt();

        if (jenisLayanan.equalsIgnoreCase("Layanan Reguler") && beratPaket<=1 ) {
            tarifLayanan = 10000;
        } else if (jenisLayanan.equalsIgnoreCase("Layanan Reguler") && beratPaket>1) {
            int lebihanBerat = beratPaket - 1;
            tarifLayanan = 10000 + (lebihanBerat * 5000);
        } else if (jenisLayanan.equalsIgnoreCase("Layanan Express") && beratPaket<=1) {
            tarifLayanan = 25000;
        } else if (jenisLayanan.equalsIgnoreCase("Layanan Express") && beratPaket>1) {
            int lebihanBerat = beratPaket - 1;
            tarifLayanan = 25000 + (lebihanBerat * 10000); 
        } else {
            System.out.println("Jenis Layanan Tidak valid!!!");
        }
        totalBiayaPengiriman = tarifLayanan;
        System.out.println("Total Biaya Pengiriman anda: " +totalBiayaPengiriman);
    }

}