public class Latihan2 {
    static boolean isPrima(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Bilangan prima dari 1 sapai 50:");

        for (int i = 1; i <= 50; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
