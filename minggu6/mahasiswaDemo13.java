package minggu6;

import java.util.Scanner;

public class mahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = sc13.nextInt();
        sc13.nextLine();

        mahasiswaBerprestasi13 list = new mahasiswaBerprestasi13(jumlah);

        // Input data mahasiswa dari keyboard
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + " :");
            System.out.print("NIM : ");
            String nim = sc13.nextLine();
            System.out.print("Nama : ");
            String nama = sc13.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc13.nextLine();
            System.out.print("IPK : ");
            double ipk = sc13.nextDouble();
            sc13.nextLine();

            mahasiswa13 m = new mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting :");
        list.tampil();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        list.bubblesort();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        list.selectionsort();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionsortASC();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DSC)");
        list.insertionsortDSC();
        list.tampil();
    }
}
