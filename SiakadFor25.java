import java.util.Scanner;

public class SiakadFor25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi = 0, terendah = 100;
        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 1; i <=10; i++){
            System.out.println("Masukkan nilai mahasiswa Ke-" + i + ":");
            nilai = sc.nextDouble();

            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }

            if (nilai >= 60){
                jmlLulus++;
            } else {
                jmlTidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi:" + tertinggi);
        System.out.println("Nilai terendah:" + terendah);
        System.out.println("Jumlah Mahasiswa Lulus:" + jmlLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus:" + jmlTidakLulus);
    }
}