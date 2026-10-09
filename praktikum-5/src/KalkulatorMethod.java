import java.util.Scanner;

public class KalkulatorMethod {
    // Method untuk penjumlahan 2 angka
    static double tambah(double a, double b) {
        return a + b;
    }
    // Method overloading untuk penjumlahan 3 angka
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }
    // Method untuk pengurangan
    static double kurang(double a, double b) {
        return a - b;
    }
    // Method untuk perkalian
    static double kali(double a, double b) {
        return a * b;
    }
    // Method untuk pembagian
    static double bagi(double a, double b) {
        return a / b;
    }
    // Method untuk perpangkatan
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }
    // Method untuk akar kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }
    // Methid untuk mencari hasil terbesar dari riwayat perhitungan
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > maksimum) {
                maksimum = riwayatHasil[i];
            }
        }
        return maksimum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array untuk menyimoang hasil perhitungan
        double[]  riwayatHasil = new double[100];
        int jumlahRiwayat = 0;

        int pilihan;

        do {
            System.out.println("\n==============================");
            System.out.println("       KALKULATOR METHOD        ");
            System.out.println("==============================");
            System.out.println("1. Tambah 2 angka");
            System.out.println("2. Tambah 3 angka");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("0. Keluar");
            System.out.println("==============================");
            System.out.println("Pilih operasi: ");
            pilihan = input.nextInt();

            double a, b, c, hasil;

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = tambah(a, b);

                    System.out.println("Hasil = " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    System.out.print("Masukkan angka ketiga ");
                    c = input.nextDouble();

                    hasil = tambah(a, b, c);

                    System.out.println("Hasil = " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kurang(a, b);

                    System.out.println("Hasil = " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kali(a, b);

                    System.out.println("Hasil = " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua ");
                    b = input.nextDouble();

                    if (b == 0) {
                        System.out.println("Error: anglka pembagi tidak boleh 0.");
                    } else {
                        hasil = bagi(a, b);

                        System.out.println("Hasil = " + hasil);

                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;
                    }
                    break;

                case 6:
                    System.out.print("Masukkan bilangan: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan pangkat: ");
                    b = input.nextDouble();

                    hasil = pangkat(a, b);

                    System.out.println("Hasil = " + hasil);
                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 7:
                    System.out.print("Masukkan bilangan: ");
                    a = input.nextDouble();

                    if (a < 0) {
                        System.out.println("Error: tidak mencari akar kuadrat bilangan negatif.");
                    } else {
                        hasil = akarKuadrat(a);

                        System.out.println("Hasil = " + hasil);

                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;
                    }
                    break;

                case 0:
                    System.out.println("\nProgram selesai.");

                    if (jumlahRiwayat > 0) {
                        // Membuat array baru sesuai jumlah hasil yang digunakan
                        double[] dataRiwayat = new double[jumlahRiwayat];

                        for (int i = 0; i < jumlahRiwayat; i++) {
                          dataRiwayat[i] = riwayatHasil[i];
                        }

                        double maksimum = riwayatKeMaksimum(dataRiwayat);

                        System.out.println("Hasil terbsesar dari seluruh perhitungan = " + maksimum);
                    } else {
                        System.out.println("Belum ada perhitungan yang dilakukan.");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 0);

        input.close();
    }
}
