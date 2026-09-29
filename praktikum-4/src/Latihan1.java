import java.util.Scanner;
public class Latihan1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int angka =  input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }
    }
}
