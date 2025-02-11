package minggu1;
import java.util.Scanner;
public class programDataMatkul {
    public static void main(String[] args) {
        Scanner insertSC = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah Mahasiswa : ");
        int n = insertSC.nextInt();
        insertSC.nextLine();

        // Deklarasi array untuk menyimpan data dari komponen Mahasiswa
        String[] namaMatKulMHS = new String[n];
        int[] sksMHS = new int[n];
        int[] semesterMHS = new int[n];
        String[] hariKuliah = new String[n];

        // Input data mata kuliah
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMatKulMHS[i] = insertSC.nextLine();
            System.out.print("SKS: ");
            sksMHS[i] = insertSC.nextInt();
            System.out.print("Semester: ");
            semesterMHS[i] = insertSC.nextInt();
            insertSC.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = insertSC.nextLine();
        }

        while (true) {
            System.out.println("\nMenu Program :");
            System.out.println("1. Menampilkan seluruh jadwal kuliah");
            System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Mencari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar dari Program");
            System.out.print("Silahkan untuk memilih opsi di atas : ");
            int choice = insertSC.nextInt();
            insertSC.nextLine();

            switch (choice) {
                case 1:
                    // Output Untuk seluruh jadwal kuliah
                    System.out.println("Seluruh Jadwal Kuliah :");
                    for (int i = 0; i < n; i++) {
                        menampilkanJadwal(i, namaMatKulMHS, sksMHS, semesterMHS, hariKuliah);
                    }
                    break;

                case 2:
                    // Output Untuk jadwal kuliah berdasarkan hari tertentu
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = insertSC.nextLine();
                    System.out.println("Jadwal Kuliah untuk hari " + hari + ":");
                    for (int i = 0; i < n; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(hari)) {
                            menampilkanJadwal(i, namaMatKulMHS, sksMHS, semesterMHS, hariKuliah);
                        }
                    }
                    break;

                case 3:
                    // Output Untuk jadwal kuliah berdasarkan semester tertentu
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int semesterMHSDicari = insertSC.nextInt();
                    System.out.println("Jadwal Kuliah untuk semester " + semesterMHSDicari + ":");
                    for (int i = 0; i < n; i++) {
                        if (semesterMHS[i] == semesterMHSDicari) {
                            menampilkanJadwal(i, namaMatKulMHS, sksMHS, semesterMHS, hariKuliah);
                        }
                    }
                    break;

                case 4:
                    // Mencari mata kuliah berdasarkan nama
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String pencarianNama = insertSC.nextLine();
                    boolean pencarian = false;
                    for (int i = 0; i < n; i++) {
                        if (namaMatKulMHS[i].equalsIgnoreCase(pencarianNama)) {
                            System.out.println("Informasi Mata Kuliah:");
                            menampilkanJadwal(i, namaMatKulMHS, sksMHS, semesterMHS, hariKuliah);
                            pencarian = true;
                        }
                    }
                    if (!pencarian) {
                        System.out.println("Mata kuliah dengan nama \"" + pencarianNama + "\" tidak ditemukan.");
                    }
                    break;

                case 5:
                    // Keluar dari Program
                    System.out.println("Program Selesai dijalankan, terimakasih sudah akses.");
                    insertSC.close();
                    return;

                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }

    // Fungsi Output Untuk jadwal mata kuliah berdasarkan indeks dari Array
    public static void menampilkanJadwal(int i, String[] namaMatKulMHS, int[] sksMHS, int[] semesterMHS, String[] hariKuliah) {
        System.out.println("Nama Mata Kuliah : " + namaMatKulMHS[i]);
        System.out.println("SKS : " + sksMHS[i]);
        System.out.println("Semester : " + semesterMHS[i]);
        System.out.println("Hari Kuliah Aktif : " + hariKuliah[i]);
        System.out.println("-----------------------");
    }
}    

