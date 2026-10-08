import java.util.Scanner;

public class Latihan5 {
    static int hitungTotal(int[] data) {
        int total =0;
        for (int nilai : data) {
            total += nilai;
        }
            return total;
    }
    static int[] filterDiAtasRataRata(int[] data) {
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        int jumlah = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                jumlah++;
            }
        }
        int[] hasil = new int[jumlah];
        int index = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai: ");
        int jumlah = input.nextInt();
        int[] data = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        int[] hasil = filterDiAtasRataRata(data);
        System.out.println("\nTotal nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);

        System.out.println("nilai di atas rata-rata: ");

        for (int nilai : hasil) {
            System.out.print(nilai + " ");
        }

        input.close();
    }
}
