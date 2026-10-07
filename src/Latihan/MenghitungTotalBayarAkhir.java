package Latihan;
import java.util.Scanner;
public class MenghitungTotalBayarAkhir {
    public static void main(String[] args) {
        Scanner fatus = new Scanner (System.in);
        System.out.println("");
        System.out.println("-SELAMAT DATANG & SELAMAT BERBELANJA-");
        System.out.println("");
        int totalBelanja;
        System.out.print("Masukkan Total Belanja Anda: ");
        totalBelanja = fatus.nextInt();
        int diskon=5000;
        int totBayarAkhir;
        if (totalBelanja >= 50000) {
            totBayarAkhir = totalBelanja - diskon;
            System.out.println("Selamat, Anda Mendapat Diskon Sebesar Rp. 5000,-"); 
            System.out.println("Maka, Total Belanja Anda Menjadi: " +totBayarAkhir);  
        } else {
            totBayarAkhir = totalBelanja;
            System.out.println("Sayang Sekali, Anda Tidak Dapat Diskon");
        }
        System.out.println("");
        System.out.println("-TERIMAKASIH SUDAH BELANJA DITOKO KAMI-");
        System.out.println("");
    }
    
}
