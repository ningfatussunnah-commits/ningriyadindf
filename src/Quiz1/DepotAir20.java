package Quiz1;
import java.util.Scanner;
public class DepotAir20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kapasitasGalon=19l;
        double hargaGalon=19.500;
        int waktuOperasionalDepot=8;
        double rataRataPendapatanPerJam;
        int sisaAir;

        System.out.println("Jumlah Galon= ");
        int jumlahGalon=input.nextInt();
        rataRataPendapatanPerJam=(double)(hargaGalon*jumlahGalon)*waktuOperasionalDepot;
        sisaAir=kapasitasGalon*jumlahGalon;
        System.out.println("Rata-Rata Pendapatan Per Jam= " +rataRataPendapatanPerJam);
        System.out.println("Sisa Air= " +sisaAir);
        
    }
    
}
