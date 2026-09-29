import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlha elemen: ");
        int n = input.nextInt();

        if (n <2) {
            System.out.println("Arrayv harus memiliki minimal 12 elemen.");
        } else {
            int[] angka = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("masukkan angka ke-" + (i +1) + ": ");
                angka[i] = input.nextInt();
            }
            int terbesar = angka[0];
            int terbesarKedua = 0;
            boolean adaKedua = false;

            for (int i = 1; i < n; i++) {
                if (angka[i] > terbesar) {
                    terbesarKedua = terbesar;
                    terbesar = angka[i];
                    adaKedua = true;
                } else if (angka[i] < terbesar) {
                    if (!adaKedua || angka[i] > terbesarKedua) {
                        terbesarKedua = angka[i];
                        adaKedua = true;
                    }
                }
            }

            if (adaKedua) {
                System.out.println("Nilai terbesar = " + terbesar);

                System.out.println("Nilai terbesar kedua = " + terbesarKedua);
            } else {
                System.out.println("tidak ada nilai terbesar kedua yang berbeda.");
            }
        }
    }
}
