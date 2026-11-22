package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai20 {
    public static void main(String[] Args){
        int[] nilaiAkhir = new int[10];
        Scanner fatus = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = fatus.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++){
           String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
           System.out.println("Mahasiswa ke-" + (i +  1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }
    }
}
