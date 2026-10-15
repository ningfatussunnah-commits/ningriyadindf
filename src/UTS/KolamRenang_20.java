// P=20; HargaTiket1= 15000; HargaTiket2= 25000; HargaTiket3= 10000; B=8; S=18
package UTS;
import java.util.Scanner;
public class KolamRenang_20 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner (System.in);

        int hargaTiket1 = 15000;
        int hargaTiket2 = 25000;
        int hargaTiket3 = 10000;
        int diskon= 0;
        System.out.println("Masukkan Kode (1:anak, 2:dewasa, 3: lansia): ");
        String statusRombongan = fatus.nextLine();
        System.out.println("Masukkan Jumlah Tiket Anda: ");
        int jmlTiket = fatus.nextInt();
        int totBayar;



        switch (statusRombongan) {
            case 1:
                System.out.println("Status Rombongan: Anak");
                break;
            case 2:
                System.out.println("Status Rombongan: Dewasa");
                break;
            case 3:
                System.out.println("Status Rombongan: Lansia");
                break;
            default:
                System.out.println("Kode Tidal Valid.");
                break;
        }

        if (jmlTiket>=1 && <=30) {
            if (statusRombongan=="anak") {
                System.out.println("HargaTiket");
                totBayar = jmlTiket * hargaTiket1;
            }
        } else {
            System.out.println("input tidak valid.");
        }

    }
}
