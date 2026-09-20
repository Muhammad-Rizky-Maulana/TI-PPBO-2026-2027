import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tarif listrik per KWH
        final double TARIF_450 = 500;
        final double TARIF_900 = 1000;
        final double TARIF_1300 = 1500;
        final double TARIF_2200 = 1700;
        final double TARIF_DIATAS_2200 = 2000;

        System.out.println("====PROGRAM HITUNG TARIF LISTRIK====");

        System.out.print("Masukkan golongan daya (450/900/1300/2200/>2200): ");
        int daya = sc.nextInt();

        System.out.print("Masukkan jumlah pemakaian listrik (kwh): ");
        double kwh = sc.nextDouble();

        // Validasi kwh
        if (kwh <= 0) {
            System.out.println("ERROR: Pemakaian kwh harus lebih besar dari 0.");
            return;
        }

        double tarif;
        String golongan;

        //Menentukan golongan dan tarif
        switch (daya) {
            case 450:
                golongan = "450 VA";
                tarif = TARIF_450;
                break;

            case 900:
                golongan = "900 VA";
                tarif = TARIF_900;
                break;

            case 1300:
                golongan = "1300 VA";
                tarif = TARIF_1300;
                break;

            case 2200:
                golongan = "2200 VA";
                tarif = TARIF_2200;
                break;

            default:
                if (daya > 2200) {
                    golongan = "Di atas 2200  VA";
                    tarif = TARIF_DIATAS_2200;
                } else {
                    System.out.println("ERROR: Golongan daya tidak valid.");
                    return;
                }
        }

        //Menghitung total tagihan
        double total = kwh * tarif;

        //Menampilkan hasil
        System.out.println();
        System.out.println("====HASIL PERHITUNGAN====");
        System.out.println("Golongan daya : " + golongan);
        System.out.println("Pemakaian     : " + kwh + " kwh");
        System.out.println("Tarif per kwh : Rp" + tarif);
        System.out.println("Total tagihan : Rp" + total);

    }
}
