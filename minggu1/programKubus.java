package minggu1;
import java.util.Scanner;

public class programKubus {
public static void main(String[] args) {
    Scanner insertSC = new Scanner(System.in);
     System.out.print("Masukkan panjang sisi kubus: ");
      int s = insertSC.nextInt();

        tampilkanMenu();
        int choice = insertSC.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Volume kubus : " + mesinVolKubus(s));
                break;
            case 2:
                System.out.println("Luas permukaan kubus : " + mesinLuasPermukaanKubus(s));
                break;
            case 3:
                System.out.println("Keliling kubus : " + mesinKelilingKubus(s));
                break;
            default:
                System.out.println("Aksi tidak valid.");
    }
    insertSC.close();
}

public static void tampilkanMenu() {
        System.out.println("Pilih perhitungan yang ingin dilakukan:");
        System.out.println("1. Menentukan Volume Kubus");
        System.out.println("2. Menentukan Luas Permukaan Kubus");
        System.out.println("3. Menentukan Keliling Kubus");
        System.out.print("Masukkan Aksi User dari opsi di atas : ");
}
    // Fungsi ini menghitung volume kubus
public static int mesinVolKubus(int s) {
        return s * s * s;
    }
    // Fungsi ini menghitung luas permukaan kubus
    public static int mesinLuasPermukaanKubus(int s) {
        return 6 * (s * s);
    }
    // Fungsi ini menghitung keliling kubus
    public static int mesinKelilingKubus(int s) {
        return 12 * s;
    }

}
