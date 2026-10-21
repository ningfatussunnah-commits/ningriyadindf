package Pertemuan9;

import java.util.Scanner;

public class siakadFor20 {
    public static void main (String[] args){
        Scanner fatus = new Scanner (System.in);
        double nilai, tertinggi=0, terendah=100;

        for (int i = 1; i <=10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +i+ ":");
            nilai = fatus.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
    }
    
}
