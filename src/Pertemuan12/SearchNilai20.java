package Pertemuan12;

import java.util.Scanner;

public class SearchNilai20 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);

        System.out.print("Banyak Nilai: ");
        int j = fatus.nextInt();
        int[] nilai = new int[j];

        for (int i = 0; i < nilai.length;i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = fatus.nextInt();
        }

        System.out.print("Nilai yang dicari: ");
        int key = fatus.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari " + key + " tidak ditemukan.");
        }
    }
}
