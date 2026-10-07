package Latihan;

import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa aktif? (true/false)       : ");
        boolean mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah sedang kena sanksi? (true/false)   : ");
        boolean sedangSanksi = sc.nextBoolean();

        if (mahasiswaAktif && !sedangSanksi) {

            System.out.print("Masukkan Nilai Daspro (0-100)             : ");
            double nilaiDaspro = sc.nextDouble();

            System.out.print("Memiliki sertifikat? (true/false)          : ");
            boolean memilikiSertif = sc.nextBoolean();

            if (nilaiDaspro >= 80 || memilikiSertif) {

                System.out.print("Masukkan Nilai Wawancara (0-100)          : ");
                double nilaiWawancara = sc.nextDouble();
      
                if (nilaiWawancara >= 75) {
                    System.out.println("\nHASIL: Selamat, mahasiswa DITERIMA sebagai asisten praktikum!");
                } else {
                    System.out.println("\nHASIL GAGAL: Nilai wawancara kurang dari 75 (Nilai: " + nilaiWawancara + ").");
                }

            } else {
                System.out.println("\nHASIL GAGAL: Nilai Daspro kurang dari 80 (" + nilaiDaspro + ") DAN tidak memiliki sertifikat.");
            }

        } else {
            System.out.println("\nHASIL GAGAL: Mahasiswa tidak aktif atau sedang mendapatkan sanksi akademik.");
        }

        sc.close();
    }
}
