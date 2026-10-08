public class MethodArrayDemo {
    static double hitungRataRata(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return (double) total / data.length;
    }

    static int cariMaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }
        return max;
    }

    static int[] urutkanAscending(int[] data) {
        int[] hasil = data.clone(); //salin dulu agar array asli tidak berubah
        for (int i = 0; i < hasil.length - 1; i++) {
            for (int j =  0; j < hasil.length - 1 - i; j++) {
                if (hasil[j] > (hasil[j + 1])) {
                    int temp = hasil[j];
                    hasil[j] = hasil[j + 1];
                    hasil[j + 1] = temp;
                }
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        int[] nilaiUjian = {80, 75, 90, 60, 88};

        System.out.println("Rata-rata: " + hitungRataRata(nilaiUjian));
        System.out.println("Maksimum: " + cariMaksimum(nilaiUjian));

        int[] terurut = urutkanAscending(nilaiUjian);
        System.out.println("Setelah diurutkan: ");
        for (int n : terurut) {
            System.out.print(n + " ");
        }
    }
}


