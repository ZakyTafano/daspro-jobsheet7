import java.util.Scanner;

public class Bioskop25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerTiket = 50000;
        int totalTiketTerjual = 0;
        int jumlahTiket;
        double totalHargaPenjualan = 0;
        double hargaTotal;
        double diskon = 0;
        double totalBayar;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();
            
            if (jumlahTiket == 0) {
                break;
            }
            
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, Silakan masukkan ulang!");
                continue;
            }
            
            hargaTotal = jumlahTiket * hargaPerTiket;
            diskon = 0;
            
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }
            
            totalBayar = hargaTotal - (hargaTotal * diskon);

            totalTiketTerjual += jumlahTiket;
            totalHargaPenjualan += totalBayar;
            
            System.out.println("Diskon yang didapat: " + (int)(diskon * 100) + "%");
            System.out.println("Total yang harus dibayar pelanggan: Rp " + totalBayar);
        }
    }
}
