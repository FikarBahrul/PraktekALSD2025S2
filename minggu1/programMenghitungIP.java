package minggu1;
import java.util.Scanner;

public class programMenghitungIP {
    public static void main(String[] args) {
        Scanner insertSC = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester Berdasarkan Nilai Angka");
        System.out.println("======================================================");

        // input Mata Kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatKulMHS = insertSC.nextInt();
        insertSC.nextLine(); // Membersihkan newline

        String[] namaMatKulMHS = new String[jumlahMatKulMHS];
        int[] sksMHS = new int[jumlahMatKulMHS];
        int[] nilaiAngkaMHS = new int[jumlahMatKulMHS];
        double[] nilaiSetaraMHS = new double[jumlahMatKulMHS];
        String[] nilaiHurufMHS = new String[jumlahMatKulMHS];
        String[] kualifikasi = new String[jumlahMatKulMHS];

        double totalNilai = 0;
        int totalsksMHS = 0;

        // Input data untuk setiap mata kuliah
        for (int i = 0; i < jumlahMatKulMHS; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMatKulMHS[i] = insertSC.nextLine();

            System.out.print("Bobot sks:");
            sksMHS[i] = insertSC.nextInt();

            System.out.print("Nilai Angka (0-100): ");
            nilaiAngkaMHS[i] = insertSC.nextInt();
            insertSC.nextLine();

            // Konversi nilai angka ke nilai huruf, nilai setara, serta kualifikasi Mahasiswa
            if (nilaiAngkaMHS[i] >= 80) {
                nilaiHurufMHS[i] = "A";
                nilaiSetaraMHS[i] = 4.0;
                kualifikasi[i] = "Sangat Baik";
            } else if (nilaiAngkaMHS[i] >= 73) {
                nilaiHurufMHS[i] = "B+";
                nilaiSetaraMHS[i] = 3.5;
                kualifikasi[i] = "Lebih dari Baik";
            } else if (nilaiAngkaMHS[i] >= 65) {
                nilaiHurufMHS[i] = "B";
                nilaiSetaraMHS[i] = 3.0;
                kualifikasi[i] = "Baik";
            } else if (nilaiAngkaMHS[i] >= 60) {
                nilaiHurufMHS[i] = "C+";
                nilaiSetaraMHS[i] = 2.5;
                kualifikasi[i] = "Lebih dari Cukup";
            } else if (nilaiAngkaMHS[i] >= 50) {
                nilaiHurufMHS[i] = "C";
                nilaiSetaraMHS[i] = 2.0;
                kualifikasi[i] = "Cukup";
            } else if (nilaiAngkaMHS[i] >= 39) {
                nilaiHurufMHS[i] = "D";
                nilaiSetaraMHS[i] = 1.0;
                kualifikasi[i] = "Kurang";
            } else {
                nilaiHurufMHS[i] = "E";
                nilaiSetaraMHS[i] = 0.0;
                kualifikasi[i] = "Gagal";
            }

            // perhitungan nilai total Mahasiswa
            totalNilai += nilaiSetaraMHS[i] * sksMHS[i];
            totalsksMHS += sksMHS[i];
        }

        // Perhitungan IP untuk Semester
        double ipSemesterMHS= totalNilai / totalsksMHS;

        // Output Hasil Nilai
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("=====================================================================");
        System.out.printf("%-30s %-10s %-10s %-10s %-10s\n", "Mata Kuliah", "SKS", "Nilai Angka", "Nilai Huruf", "Kualifikasi");
        for (int i = 0; i < jumlahMatKulMHS; i++) {
            System.out.printf("%-30s %-10d %-10d %-10s %-10s\n", namaMatKulMHS[i], sksMHS[i], nilaiAngkaMHS[i], nilaiHurufMHS[i], kualifikasi[i]);
        }

        System.out.println("=====================================================================");
        System.out.printf("IP Semester: %.2f\n", ipSemesterMHS);

        insertSC.close();
    }
}
