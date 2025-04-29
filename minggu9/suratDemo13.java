package minggu9;

import java.util.Scanner;

public class suratDemo13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        stackSurat13 stack = new stackSurat13(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama Mahasiswa");
            System.out.println("5. Keluar dari Program");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    stack.push(new surat13(id, nama, kelas, jenis, durasi));
                    break;
                case 2:
                    surat13 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.print("Memproses surat: ");
                        diproses.tampilkanInfo();
                    }
                    break;
                case 3:
                    surat13 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir:");
                        terakhir.tampilkanInfo();
                    }
                    break;
                case 4:
                    System.out.print("Cari nama mahasiswa: ");
                    String cariNama = scan.nextLine();
                    stack.cariSuratBerdasarkanNama(cariNama);
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}
