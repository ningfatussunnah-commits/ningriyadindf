package Pertemuan10;
import java.util.Scanner;
public class Tugas1_20 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = fatus.nextInt();

        int totAngka = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totAngka++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak: " +totAngka);
    }
}
