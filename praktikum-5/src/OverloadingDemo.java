public class OverloadingDemo {
    static int tambah(int a, int b) {
        return a + b;
    }

    static int tambah(int a, int b, int c) {
        return a + b + c;
    }
    static double tambah(double a, double b) {
        return a + b;
        }
        public static void main(String[] args){
            System.out.println(tambah(2, 3));
            System.out.println(tambah(2, 3, 4));

            // panggil pada method main:
            System.out.println(tambah(2.5, 3.5));
        }
    }



