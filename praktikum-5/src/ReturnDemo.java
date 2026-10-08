public class ReturnDemo {
    static int tambah(int a, int b) {
        return a + b;
    }
    static boolean isGenap(int angka) {
        return angka % 2 == 0;
    }

    public static void main(String[] args) {
        int hasil = tambah(15, 7);
        System.out.println("Hasil tambah: " + hasil);

        System.out.println("Apakah 8 genap? " + isGenap(8));
        System.out.println("Apakah 7 genap? " + isGenap(7));
    }
}
