package Pertemuan5;

import java.util.Scanner;

public class TugasAnteran20 {
     public static void main(String[] args) {
          Scanner fatus = new Scanner (System.in);
          int kodeLayanan;
          System.out.println("SELAMAT DATANG DILAYANAN AKADEMIK KAMPUS!!!");
          System.out.println("Berikut Daftar Layanan:");
          System.out.println("[1] Legalisir Ijazah");
          System.out.println("[2] Surat Keterangan Aktif Kuliah");
          System.out.println("[3] Pembayaran UKT");
          System.out.println("[4] Pengajuan Cuti Akademik");
          System.out.print("Masukkan Kode Layanan yang Anda Butuhkan: ");
          kodeLayanan= fatus.nextInt();
          switch (kodeLayanan) {
               case 1:
                    System.out.println("Layanan: LEGALISIR IJAZAH");
                    System.out.println("Loket tujuan: LOKET A");
                    System.out.println("Silahkan Menuju Loket Tujuan Anda!");
                    break;
               case 2:
                    System.out.println("Layanan: SURAT KETERANGAN AKTIF KULIAH");
                    System.out.println("Loket tujuan: LOKET B");
                    System.out.println("Silahkan Menuju Loket Tujuan Anda!");
                    break;
               case 3:
                    System.out.println("Layanan: PEMBAYARAN UKT");
                    System.out.println("Loket tujuan: LOKET C");
                    System.out.println("Silahkan Menuju Loket Tujuan Anda!");
                    break;
               case 4:
                    System.out.println("Layanan: PENGAJUAN CUTI AKADEMIK");
                    System.out.println("Loket tujuan: LOKET D");
                    System.out.println("Silahkan Menuju Loket Tujuan Anda!");
                    break;
               default:
                    System.out.println("Mohon Maaf, Layanan Tidak Tersedia");
                    System.out.println("Silahkan Masukkan Ulang, Kode Layanan Antara 1-4");
                    break;
          }
          System.out.println("-TERIMAKASIH ATAS KUNJUNGAN ANDA-");
     }
}

