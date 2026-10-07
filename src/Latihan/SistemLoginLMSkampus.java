package Latihan;

import java.util.Scanner;

public class SistemLoginLMSkampus {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);

        String passwoard;
        char perangkat;
        int jmlGagal;

        System.out.println("Masukkan Passwoard: ");
        passwoard = fatus.nextLine();
        System.out.println("Masukkan Status perangkat anda ('Y' jika sudah login / 'T' jika perangkat baru): ");
        perangkat = fatus.next().charAt(0);
        System.out.println("Masukkan jumlah gagal login sebelumnya: ");
        jmlGagal = fatus.nextInt();

        if (passwoard.equals("daspro2026")) {

            if (perangkat == 'Y') {
                System.out.println("Log in berhasil, Selamat Datang di Dashboard.");
            } else {
                System.out.println("Kode OTP telah dikirim ke E-mail kampus anda.");
            }

        } else {

            if (jmlGagal <2) {
                System.out.println("Passwoard salah, Silahkan coba lagi!!!");
            } else {
                System.out.println("Akun dikunci selama 15 menit.");
            }

        }
    }
    
}
