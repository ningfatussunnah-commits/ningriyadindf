package Pertemuan6;
import java.util.Scanner;
public class nestedAksesLab20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Apakah pengguna mahasiswa aktif? (True/False): ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang mendapatkan sanksi? (True/False): ");
        boolean sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah memiliki izin dosen? (True/False): ");
        boolean punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah status asisten lab? (True/False): ");
        boolean asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }

    }
}
