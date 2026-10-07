package Pertemuan6;
import java.util.Scanner;
public class tugas2SeleksiAsisten20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif, sedangSanksi, memilikiSertif;
        double nilaiDaspro, nilaiWawancara;

        System.out.println("Apakah Status Mahasiswa Aktif? (True/False): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.println("Apakah sedang mendapatkan sanksi? (True/False): ");
        sedangSanksi = sc.nextBoolean();
        System.out.println("Masukkan nilai Dasar Pemrograman: ");
        nilaiDaspro = sc.nextDouble();
        System.out.println("Apakah memiliki sertifikat Kompetensi Pemrograman? (True/False): ");
        memilikiSertif = sc.nextBoolean();
        System.out.println("Masukkan Nilai Wawancara: ");
        nilaiWawancara = sc.nextDouble();

        if (mahasiswaAktif && !sedangSanksi) {
            System.out.println("LOLOS TAHAP 1");
            if (nilaiDaspro>=84 || memilikiSertif) {
                System.out.println("LOLOS TAHAP 2");
                if (nilaiWawancara>=79) {
                    System.out.println("LOLOS TAHAP 3");
                } else {
                    System.out.println("GAGAL, Nilai Wawancara tidak mecukupi.");
                }
            } else {
                System.out.println("GAGAL, Nilai Daspro tidak mencukupi dan tidak memiliki dan tidak memiliki Sertifikat Kompetensi Penrograman.");
            }
        } else {
            System.out.println("GAGAL, Mahasiswa tidak aktif dan sedang mendapatkan sanksi.");
        }
    }
}
