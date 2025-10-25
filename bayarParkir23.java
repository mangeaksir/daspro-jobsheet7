import java.util.Scanner;
public class bayarParkir23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total=0;
        System.out.println("Jenis kendaraan");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0. Keluar");

        do {
            System.out.print("Masukkan jenis kendaraan (1/2/0): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                System.out.println("Program Selesai");
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Tidak valid ");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += durasi*3000;
            } else if (jenis == 2) {
                total += durasi*2000;
            }

        } while (true);

        System.out.println("Total Pendapatan Parkir: " + total);
    }
    
}
