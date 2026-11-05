package Pertemuan10;
import java.util.Scanner;
public class RekapPenjualan20 {
    public static void main (String[] args){
        Scanner fatus = new Scanner (System.in);
        int jmlTerjual;
        int totPerProduk= 0;
        int totPenjualan= 0;
        int jmlProduk= 3;
        int jmlHari= 4;

        for (int j = 0; j < jmlHari; j++) {
            for (int i = 0; i < jmlProduk; i++) {
                System.out.print("Jumlah Terjual: "+"produk "+(i+1)+" hari "+(j+1)+": ");
                jmlTerjual = fatus.nextInt();
                totPerProduk += jmlTerjual;
            }
            System.out.println("Total Produk: " +totPerProduk);
            totPenjualan= totPenjualan + totPerProduk;
            totPerProduk=0;
        }
        System.out.println("Total Penjualan: " +totPenjualan);
    }
}
