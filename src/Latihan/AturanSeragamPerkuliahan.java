package Latihan;

import java.util.Scanner;

public class AturanSeragamPerkuliahan {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);

        int kodeHari;
        char statusSeragam;

        System.out.println("Masukkan Kode Hari (1-7): ");
        kodeHari = fatus.nextInt();

        switch (kodeHari) {
            case 1:
                System.out.println("Apakah anda menggunakan seragam? (Y/T): ");
                statusSeragam = fatus.next().charAt(0);
                if (statusSeragam == 'Y') {
                    System.out.println("Boleh mengikuti perkulihan.");
                } else {
                    System.out.println("Dikenakan sanksi dan tidak boleh mengikuti perkuliahan");
                }
                break;
            case 2:
                System.out.println("Apakah anda menggunakan seragam? (Y/T): ");
                statusSeragam = fatus.next().charAt(0);
                if (statusSeragam == 'Y') {
                    System.out.println("Boleh mengikuti perkulihan.");
                } else {
                    System.out.println("Dikenakan sanksi dan tidak boleh mengikuti perkuliahan");
                }
                break;
            case 3:
                System.out.println("Boleh memakai pakaian yang rapi dan sopan.");
                break;
            case 4:
                System.out.println("Boleh memakai pakaian yang rapi dan sopan.");
                break;
            case 5:
                System.out.println("Apakah anda menggunakan seragam? (Y/T): ");
                statusSeragam = fatus.next().charAt(0);
                if (statusSeragam == 'Y') {
                    System.out.println("Boleh mengikuti perkulihan.");
                } else {
                    System.out.println("Dikenakan sanksi dan tidak boleh mengikuti perkuliahan");
                }
                break;
            case 6:
                System.out.println("Tidak ada perkuliahan.");
                break;
            case 7:
                System.out.println("Tidak ada perkuliahan.");
                break;
            default:
                System.out.println("Kode hari tidak valid!");
                break;
        }
    }
}
