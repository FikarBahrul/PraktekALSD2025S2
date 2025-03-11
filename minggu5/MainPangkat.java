package minggu5;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan nilai basis elemen ke-" + (i + 1) + " : ");
            int basis = input.nextInt();

            System.out.print("Masukan nilai pangkat elemen ke-" + (i + 1) + " : ");
            int Pangkat = input.nextInt();

            png[i] = new Pangkat(basis, Pangkat);
        }

        System.out.println("\nHASIL PANGKAT BRUTE FORCE :");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.Pangkat + " : " + p.pangkatBF());
        }

        System.out.println("\nHASIL PANGKAT DIVIDE AND CONQUER :");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.Pangkat + " : " + p.pangkatDC(p.nilai, p.Pangkat));
        }
    }
}
