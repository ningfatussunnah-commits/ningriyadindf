// P= 20
// Jumlah Mahasiswa= 8 + (20 mod 5)= 8 + 0= 8
// Batas Kelulusan= 55 + (20 mod 11)= 55 + 9= 64
package Pertemuan9;

import java.util.Scanner;

public class siakadFor20 {
    public static void main (String[] args){
        Scanner fatus = new Scanner (System.in);
        double nilai, tertinggi=0, terendah=100;
        int lulus= 0, tidakLulus= 0;

        for (int i = 1; i <=8; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +i+ ": ");
            nilai = fatus.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >=64) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + tidakLulus);

    }
    
}
