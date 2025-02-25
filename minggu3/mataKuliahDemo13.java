package minggu3;
import java.util.Scanner;

public class mataKuliahDemo13 {

    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah : ");
        int jmlMatKul = Integer.parseInt(sc13.nextLine());

        mataKuliah13[] arrayOfMatKul = new mataKuliah13[jmlMatKul];

        for (int i = 0; i < jmlMatKul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatKul[i] = new mataKuliah13("", "", 0, 0);
            arrayOfMatKul[i].tambahData(sc13);
            System.out.println("------------------------------------");
        }

        for (int i = 0; i < jmlMatKul; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatKul[i].cetakInfo();
        }
    }
}
