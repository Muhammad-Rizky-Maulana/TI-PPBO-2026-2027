public class OperasiArray {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 88};
        int total = 0;

        for (int n : nilai) {
            total += n;
        }
        double rataRata = (double) total / nilai.length;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);
        int max = nilai[0];
        int min = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai maksimum: " + max);
        System.out.println("Nilai minimum: " + min);
        int cari = 90;
        int posisi = -1;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Nilai " + cari + "ditemukan di indeks " + posisi);
        } else {
            System.out.println("Nilai "+ cari + "tidak di temukan");
        }
    }
}
