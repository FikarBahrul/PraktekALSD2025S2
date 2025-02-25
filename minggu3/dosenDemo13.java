package minggu3;
import java.util.Scanner;

public class dosenDemo13 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jmlDosen = sc13.nextInt();
        sc13.nextLine();

        dosen13[] daftarDosen = new dosen13[jmlDosen];

        for (int i = 0; i < jmlDosen; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.print("Masukkan kode : ");
            String kode = sc13.nextLine();

            System.out.print("Masukkan nama : ");
            String nama = sc13.nextLine();

            System.out.print("Masukkan jenis kelamin ketik true untuk Laki-laki atau ketik false untuk Perempuan : ");
            Boolean jenisKelamin = sc13.nextBoolean();

            System.out.print("Masukkan usia : ");
            int usia = sc13.nextInt();
            sc13.nextLine();

            daftarDosen[i] = new dosen13(kode, nama, jenisKelamin, usia);
        }

        //Method untuk Menampilkan semua data dosen
        System.out.println("\nData Seluruh Dosen :");
        dataDosen13.dataSemuaDosen(daftarDosen);

        //Method untuk Menampilkan jumlah dosen lakik dan perempuan
        dataDosen13.jmlDosenPerJenisKelamin(daftarDosen);

        //Method untuk Menampilkan rata-rata usia dosen lakik dan perempuan
        dataDosen13.rerataRataUsiaDosenPerJenisKelamin(daftarDosen);

        //Method untuk Menampilkan dosen paling tua dan paling muda
        dataDosen13.infoDosenPalingTua(daftarDosen);
        dataDosen13.infoDosenPalingMuda(daftarDosen);
    }
}
