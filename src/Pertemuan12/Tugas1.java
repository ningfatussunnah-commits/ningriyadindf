package Pertemuan12;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args){
        Scanner fatus = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jmlMhs = fatus.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        int tot = 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = fatus.nextInt();
            tot += nilaiMhs[i];
        }
        double rata2 = (double) tot / nilaiMhs.length;
        System.out.println("Rata-rata: " +rata2);
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " (" + status + ")");
        }
        
    }
}
