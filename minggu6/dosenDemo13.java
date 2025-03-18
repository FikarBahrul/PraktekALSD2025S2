package minggu6;
import java.util.Scanner;
class dosenDemo13 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public dosenDemo13(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Kode Dosen : " + kode + ", Nama Dosen : " + nama + ", Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan") + ", Usia : " + usia);
    }

    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        dataDosen13 data = new dataDosen13();
        
        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Menambahkan Dosen ");
            System.out.println("2. Menampilkan Data");
            System.out.println("3. Pengurutan Secara Ascending (Bubble Sort)");
            System.out.println("4. Pengurutan Secara Descending (Selection Sort)");
            System.out.println("5. Pengurutan Secara Descending (Insertion Sort)");
            System.out.println("6. Keluar dari Menu");
            System.out.print("Pilih menu : ");
            int opsi = sc13.nextInt();
            sc13.nextLine();
            
            if (opsi == 1) {
                System.out.print("Masukkan kode dosen : ");
                String kode = sc13.nextLine();
                System.out.print("Masukkan nama dosen : ");
                String nama = sc13.nextLine();
                System.out.print("Jenis Kelamin dosen (true untuk laki-laki, false untuk perempuan) : ");
                boolean jk = sc13.nextBoolean();
                System.out.print("Masukkan usia dosen : ");
                int usia = sc13.nextInt();
                
                data.tambah(new dosenDemo13(kode, nama, jk, usia));
            } else if (opsi == 2) {
                data.tampil();
            } else if (opsi == 3) {
                data.bubblesortASC();
                System.out.println("Data berhasil diurutkan secara Ascending (Bubble Sort.");
            } else if (opsi == 4) {
                data.selectionsortDSC();
                System.out.println("Data berhasil diurutkan secara Descending (Selection Sort).");
            } else if (opsi == 5) {
                data.insertionsortDSC();
                System.out.println("Data berhasil diurutkan secara Descending (Insertion Sort).");
            } else if (opsi == 6) {
                break;
            } else {
                System.out.println("Opsi yang anda berikan tidak valid");
            }
        }
    }
}