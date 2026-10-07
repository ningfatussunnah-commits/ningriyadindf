package Pertemuan2;
import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lebar Tanah ");
        double lebarTanah = input.nextInt();
        System.out.println("Panjang Tanah ");
        double panjangTanah = input.nextInt();
        System.out.println("Diameter Kolam ");
        double diameterKolam = input.nextInt();
        System.out.println("Sisi Taman ");
        double sisiTaman = input.nextInt();

        double luas_Tanah = lebarTanah * panjangTanah;
        double jariJariKolam = diameterKolam/2;
        double luasKolam = 3.14 * jariJariKolam * jariJariKolam;
        double luasTaman = sisiTaman * sisiTaman;
        double luasTanahYangTidakDigunakan = luas_Tanah - luasKolam - luasTaman;

        System.out.println("Luas Tanah Yang Tidak Digunakan " + luasTanahYangTidakDigunakan);
    }
    
}
