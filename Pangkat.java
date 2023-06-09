import java.util.Scanner;

public class Pangkat {
    public static double hitungPangkat(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return x * hitungPangkat(x, n - 1);
        } else {
            return (1 / x) * hitungPangkat(x, n + 1);
        }
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan yang akan dipangkatkan: ");
        double angka = input.nextDouble();

        System.out.print("Masukkan pangkat yang diinginkan: ");
        int pangkat = input.nextInt();

        double hasil = hitungPangkat(angka, pangkat);
        System.out.println(angka + " pangkat " + pangkat + " adalah: " + hasil);
    }
}
