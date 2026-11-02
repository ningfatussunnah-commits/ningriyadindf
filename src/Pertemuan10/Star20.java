package Pertemuan10;
import java.util.Scanner;
public class Star20 {
    public static void main(String[] args){
        Scanner fatus = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        int n = fatus.nextInt();

        for (int i = 4; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        fatus.close();
    }
}
