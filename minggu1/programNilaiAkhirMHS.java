package minggu1;

import java.util.Scanner;

public class programNilaiAkhirMHS {
    public static void main(String[] args) {
        Scanner insertSC = new Scanner(System.in);

       
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println(" ---------------------------");
        System.out.print(" Nilai tugas Mahasiswa : ");
        int tugasMHS = insertSC.nextInt();
        System.out.print(" Nilai kuis Mahasiswa : ");
        int kuisMHS = insertSC.nextInt();
        System.out.print(" Nilai UTS Mahasiswa : ");
        int utsMHS = insertSC.nextInt();
        System.out.print(" Nilai uas Mahasiswa : ");
        int uasMHS = insertSC.nextInt();
        System.out.println(" ---------------------------");

        // untuk memvalidasi nilai Mahasiswa
        if (tugasMHS < 0 || tugasMHS > 100 || kuisMHS < 0 || kuisMHS > 100 || utsMHS < 0 || utsMHS > 100 || uasMHS < 0 || uasMHS > 100) {
            System.out.println("Nilai yang mahasiswa masukkan tidak valid");
        } else {
            // perhitungan nilai akhir Mahasiswa
            double nilaiAkhirMHS = (0.20 * tugasMHS) + (0.20 * kuisMHS) + (0.30 * utsMHS) + (0.40 * uasMHS);

            // untuk nilai huruf peringkat Mahasiswa
            String nilaiPeringkatMHS;
            if (nilaiAkhirMHS >= 85) {
                nilaiPeringkatMHS = "A";
            } else if (nilaiAkhirMHS >= 80) {
                nilaiPeringkatMHS = "B+";
            } else if (nilaiAkhirMHS >= 70) {
                nilaiPeringkatMHS = "B";
            } else if (nilaiAkhirMHS >= 65) {
                nilaiPeringkatMHS = "C+";
            } else if (nilaiAkhirMHS >= 60) {
                nilaiPeringkatMHS = "C";
            } else if (nilaiAkhirMHS >= 50) {
                nilaiPeringkatMHS = "D";
            } else {
                nilaiPeringkatMHS = "E";
            }

            // Seleksi Kelulusan
            String MHSlulus = (nilaiPeringkatMHS.equals("A") || nilaiPeringkatMHS.equals("B+") || nilaiPeringkatMHS.equals("B") || 
                                nilaiPeringkatMHS.equals("C+") || nilaiPeringkatMHS.equals("C")) ? "LULUS" : "TIDAK LULUS";

            // Menampilkan hasil
            System.out.printf("Nilai Akhir Mahasiswa : %.2f\n", nilaiAkhirMHS);
            System.out.println("Nilai Huruf : " + nilaiPeringkatMHS);
            System.out.println(" ---------------------------");
            System.out.println("SELAMAT ANDA DINYATAKAN" + MHSlulus);
        }
        
        insertSC.close();
    }
}