package minggu6;

import java.util.Scanner;

public class mahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        //int jumlah = 5;
        // sc13.nextLine();
        int jumMhs=sc13.nextInt();
        sc13.nextLine();
        mahasiswaBerprestasi13 list = new mahasiswaBerprestasi13(jumMhs);
        
        // Input data mahasiswa dari keyboard
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-----------------------------");
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + " :");
            System.out.print("NIM \t: ");
            String nim = sc13.nextLine();
            System.out.print("Nama \t: ");
            String nama = sc13.nextLine();
            System.out.print("Kelas \t: ");
            String kelas = sc13.nextLine();
            System.out.print("IPK \t: ");
            double ipk = sc13.nextDouble();
            sc13.nextLine();

            mahasiswa13 m = new mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        list.tampil();
        // melakukan pencarian data sequential
        System.out.println("-------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari = sc13.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        System.out.println("-------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-------------------------------------");

        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 = (int) posisi2;

        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        // System.out.println("Data mahasiswa sebelum sorting :");
        // list.tampil();
        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        // list.bubblesort();
        // list.tampil();
        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        // list.selectionsort();
        // list.tampil();
        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.insertionsortASC();
        // list.tampil();
        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DSC)");
        // list.insertionsortDSC();
        // list.tampil();
    }
}
