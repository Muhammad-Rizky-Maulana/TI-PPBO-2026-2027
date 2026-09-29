import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriks = new int[3][3];
        int total = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan angka [" + i + "][" + j + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatriks:");

        for (int i = 0; i < 3; i++) {
            int jumlahBaris = 0;

            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + "\t");
                jumlahBaris += matriks[i][j];
                total += matriks[i][j];
            }

            System.out.println("| Jumlah baris = " + jumlahBaris);
        }
        System.out.println("Jumlah seluruh elemen = " + total);
    }
}
