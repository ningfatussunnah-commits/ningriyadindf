package Pertemuan10;
import java.util.Scanner;
public class Star20 {
    public static void main(String[] args){
        Scanner fatus = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        int n = fatus.nextInt();

        for (int i = 1; i <= 12; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        fatus.close();
    }
}
