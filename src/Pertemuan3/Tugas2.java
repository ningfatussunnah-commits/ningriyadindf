package Pertemuan3;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);
        int jmlLembar;
        int biayaPerLembar=500;
        int biayaJilid=5000;
        int totBiaya;
        int totBayar;
        System.out.println("Masukkan Jumlah Lembar ");
        jmlLembar= fatus.nextInt();
        totBiaya= jmlLembar * biayaPerLembar;
        totBayar= totBiaya + biayaJilid;
        System.out.println("Total Bayar= " +totBayar);

    }
}