package minggu1;
import java.util.Scanner;

public class programDeretBilangan {
    public static void main(String[] args) {
        Scanner insertSC = new Scanner(System.in);

        // Input NIM Mahasiswa
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = insertSC.nextLine();

        // untuk mengambil dua digit terakhir dari NIM Mahasiswa
        char digit1 = nim.charAt(nim.length() - 2);
        char digit2 = nim.charAt(nim.length() - 1);

        // untuk menghitung nilai n secara manual
        int n = (digit1 - '0') * 10 + (digit2 - '0');

        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        System.out.println("--------------------------------");
        System.out.println("n : " + n);
        System.out.print("Output: ");

        // Menampilkan deretan bilangan sesuai ketentuan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Lewati angka 6 dan 10
            }
            if (i % 2 == 1) {
                System.out.print("* "); // Jika Angka Mahasiswa bernilai ganjil diubah jadi asteriks/bintang
            } else {
                System.out.print(i + " "); // Jika Angka Mahasiswa bernilai genap akan menampilkan bilangan aslinya
            }
        }

        insertSC.close();
    }
}
