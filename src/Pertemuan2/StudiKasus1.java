import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Gaji Pokok: ");
        int jml_gajipokok = input.nextInt();
        System.out.println("Masukkan Tunjangan Anak: ");
        int tunjangan_anak_perbulan = input.nextInt();
        System.out.println("Masukkan Jumlah Anak: ");
        int jml_anak = input.nextInt();
        double potongan =0.10;

        int total_Tunjangan = tunjangan_anak_perbulan * jml_anak;
        double potongan_Pensiun= potongan * jml_gajipokok;
        double gaji_Bersih = jml_gajipokok + total_Tunjangan - potongan_Pensiun;

        System.out.println("Gaji bersih " + gaji_Bersih);
    }
    
}
