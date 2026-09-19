import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Angka pertama: ");
        double a = sc.nextDouble();
        System.out.print("Operator (+,-,*,/): ");
        char op = sc.next(). charAt(0);
        System.out.print("Angka kedua: ");
        double b = sc.nextDouble();

        double hasil = 0;
        switch (op) {
            case '+': hasil = a + b; break;
            case '-': hasil = a - b; break;
            case '*': hasil = a * b; break;
            case '/': hasil = a / b; break;
            default: System.out.println("Operator tidak dikenali");
        }
        System.out.println("Hasil :" + hasil);
    }
}
