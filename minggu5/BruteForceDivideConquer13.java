package minggu5;
import java.util.Scanner;

public class BruteForceDivideConquer13 {
    public static class Faktorial {
        int faktorialBF(int n) {
            int fakto = 1, i = 1;
            while (i <= n) {
                fakto *= i;
                i++;
            }
            return fakto;
        }

        int faktorialDC(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n * faktorialDC(n - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = input13.nextInt();
        input13.close();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF : " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC : " + fk.faktorialDC(nilai));
    }
}
