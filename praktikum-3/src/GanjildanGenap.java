import java.util.Scanner;

public class GanjildanGenap {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan bilangan: ");
            int angka = sc.nextInt();
            if (angka % 2 == 0) {
                System.out.println("Bilanggan tersebut adalah GENAP");
            } else {
                System.out.println("Bilangan tersebut adalah GANJIL");
            }
        }
    }


