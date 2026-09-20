import java.util.Scanner;

public class KlasifikasiBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berat badan (Kg): ");
        double berat = sc.nextDouble();

        System.out.print("Masukkan tinggi badan (meter): ");
        double tinggi = sc.nextDouble();

        double bmi = berat / (tinggi * tinggi);
        System.out.println("BMI Anda: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else if (bmi < 30) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }
}
