import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int angka2 = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int angka3 = sc.nextInt();

        if (angka1 >= angka2 && angka1 >= angka3) {
            System.out.println("Bilangan terbesar adaalah: " + angka1);
        } else if (angka2 >= angka1 && angka2 >= angka3) {
            System.out.println("Bilangan terbesar adalah: " + angka2);
        } else {
            System.out.println("Bilangan terbesar adalah: " + angka3);
        }
    }
}
