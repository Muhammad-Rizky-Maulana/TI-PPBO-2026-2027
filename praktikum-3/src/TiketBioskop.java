import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = sc.nextBoolean();

        if (mahasiswa && umur < 25) {
            System.out.println("Harga tiket: Rp25.000");
            System.out.println("Anda mendapatkan harga khusus mahasiswa.");
        } else {
            System.out.println("Harga tiket: Rp40.000");
            System.out.println("Anda mendapatkan harga tiket tidak normal");
        }
    }
}
