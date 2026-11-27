package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = fatus.nextLine();
            System.out.print("Masukkan baris: ");
            baris = fatus.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = fatus.nextInt();
            fatus.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = fatus.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }

        }
    }
}
