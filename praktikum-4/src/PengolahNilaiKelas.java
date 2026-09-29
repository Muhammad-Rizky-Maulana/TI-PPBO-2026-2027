import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int KKM = 70;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = input.nextInt();

        if (N <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
        } else {
            int[] nilai = new int[N];

            int totalNilai = 0;
            int jumlahLulus = 0;
            int jumlahTidakLulus = 0;

            for (int i = 0; i < N; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilai[i] = input.nextInt();

                totalNilai += nilai[i];

                if (nilai[i] >= KKM) {
                    jumlahLulus++;
                } else {
                    jumlahTidakLulus++;
                }
            }

            double rataRata = (double) totalNilai / N;

            int tertinggi = nilai[0];
            int terendah = nilai[0];

            for (int i = 1; i < N; i++) {
                if (nilai[i] > tertinggi) {
                    tertinggi = nilai[i];
                }

                if (nilai[i] < terendah) {
                    terendah = nilai[i];
                }
            }

            System.out.println("\n====================");
            System.out.println("  LAPORAN NILAI KELAS ");
            System.out.println("======================");

            System.out.print("Nilai sebelum diurutkan : ");
            for (int i = 0; i < N; i++) {
                System.out.print(nilai[i] + " ");
            }

            for (int i = 0; i < N - 1; i++) {
                for (int j = 0; j < N - 1 - i; j++) {
                    if (nilai[j] > nilai[j + 1]) {
                        int sementara = nilai[j];
                        nilai[j] = nilai[j + 1];
                        nilai[j + 1] = sementara;
                    }
                }
            }
            System.out.print("Nilai setelah diurutkan: ");
            for (int i = 0; i < N; i++) {
                System.out.print(nilai[i] + " ");
            }

            System.out.println("\n\n---------HASIL----------");
            System.out.printf("Jumlah mahasiswa         : %d%n", N);
            System.out.printf("Nilai rata-rata kelas    : %.2f%n", rataRata);
            System.out.println("Nilai tertinggi          : " + tertinggi);
            System.out.println("Nilai terendan           : " + terendah);
            System.out.println("Nilai KKm                : " + KKM);
            System.out.println("Jumlah mahasiswa lulus   : " + jumlahLulus);
            System.out.println("Jumlah tidak lulus       : " + jumlahTidakLulus);
            System.out.println("================================");
        }

        input.close();
    }
}
