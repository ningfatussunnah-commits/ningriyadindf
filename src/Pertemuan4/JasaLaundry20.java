package Pertemuan4;
import java.util.Scanner;
public class JasaLaundry20{
    public static void main(String[] args){
        Scanner fatus = new Scanner (System.in);
        int beratCucian;
        int tarifPaket= 70000;
        int tarifPerKg= 6000;
        int biayaPewangi= 2500;
    
        System.out.print("Nama Pelanggan: ");
        String namaPelanggan = fatus.nextLine();
        System.out.print("Berat Cucian: ");
        beratCucian = fatus.nextInt();

        int totTarifPerKg = tarifPerKg * beratCucian;
        int beratKelebihan = beratCucian - 10;
        int biayaKelebihan = totTarifPerKg - 70000;
        int totTagihan = tarifPaket + totTarifPerKg + biayaPewangi + biayaKelebihan;

        System.out.println("Berat kelebihan: " +beratKelebihan);
        System.out.println("Biaya Kelebihan: " +biayaKelebihan);
        System.out.println("Total Tagihan: " +totTagihan);
        
    }
}
//Nama Pelanggan: Ning Riyadin Dannis Fatussunnah
//Berat Cucian: 20
//Berat kelebihan: 10
//Biaya Kelebihan: 50000
//Total Tagihan: 242500