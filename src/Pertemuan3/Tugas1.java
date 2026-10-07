package Pertemuan3;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);
        double sisaHarga;
        double pokokCicilan;
        double bungaPerBulan;
        double totCicilanPerBulan;
        System.out.println("Masukkan Harga Laptop ");
        double hargaLaptop= fatus.nextDouble();
        System.out.println("Masukkan Uang Muka ");
        double uangMuka= fatus.nextDouble();
        System.out.println("Masukkan lama Cicilan ");
        int lamaCicilan= fatus.nextInt();
        sisaHarga = hargaLaptop-uangMuka;
        pokokCicilan = sisaHarga / lamaCicilan;
        bungaPerBulan = 0.02*sisaHarga;
        totCicilanPerBulan = pokokCicilan+bungaPerBulan;
        System.out.println("Total Cicilan Per Bulan adalah Rp. " +totCicilanPerBulan);
    }
}
