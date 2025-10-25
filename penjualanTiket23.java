import java.util.Scanner;
public class penjualanTiket23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket = 50000, totalTiket, totalHarga;
        double diskon, totalBayar;

        do {
            System.out.print("Masukkan jumlah tiket (ketik '0' untuk keluar): ");
            totalTiket = sc.nextInt();
        
        if (totalTiket == 0) {
            System.out.println("Program diakhiri");
            break;
        }
        if (totalTiket < 0) {
            System.out.println("Tidak Valid");
            continue;
        }

        totalHarga = totalTiket*tiket;

        if (totalTiket > 10) {
            diskon = totalHarga*0.15;
        } else if (totalTiket > 4) {
            diskon = totalHarga*0.1;
        } else {
            diskon = 0;
        }

        totalBayar = totalHarga-diskon;

        System.out.println("-----Harga Tiket-----");
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + (int) diskon);
        System.out.println("Total Bayar: " + (int) totalBayar);
        } while (true);
        
    }
}
