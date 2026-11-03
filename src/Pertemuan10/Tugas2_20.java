package Pertemuan10;
import java.util.Scanner;
public class Tugas2_20 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = fatus.nextInt();

        int jmlSeluruhAngka= 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                jmlSeluruhAngka += hasil;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + jmlSeluruhAngka);
    }
}
