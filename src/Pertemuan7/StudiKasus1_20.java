package Pertemuan7;

import java.util.Scanner;

public class StudiKasus1_20 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;

        System.out.println("Masukkan jumlah cup: ");
        jumlahCup = fatus.nextInt();

        System.out.println("Masukkan uang bayar: ");
        uangBayar = fatus.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga - diskon;
        }
            System.out.println("Total harga: " +totalHarga);
            System.out.println("Diskon: " +diskon);
            System.out.println("Total bayar:" +totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian anda: " +kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang anda tidak cukup, kurang Rp. " +kurang);
        }

    }
    
}
