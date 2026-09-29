import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();

        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\nArray sebelum di urutkan:");

        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (angka[j] > angka[j + 1]) {
                    int sementara = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = sementara;
                }
            }
        }

        System.out.println("\n\nArray setelah diurutkan:");

        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");

        }

    }
}