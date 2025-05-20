package minggu13;

import java.util.Scanner;

public class AntrianVaksinDLLMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianVaksinDLL13 antrian = new AntrianVaksinDLL13();
        
        int pilihan;
        do {
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("---------------------------");
                    System.out.println("Nomor Antrian: ");
                    int noAntrian = sc.nextInt();1
                    sc.nextLine();
                    System.out.println("Nama Penerima: ");
                    String nama = sc.nextLine();
                    antrian.tambahData(noAntrian, nama);
                    break;
                    
                case 2:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong!");
                    } else {
                        NodeVaksin13 vaksinasi = antrian.hapusData();
                        System.out.println("++++++++++++++++++++++++++++++");
                        System.out.println(vaksinasi.nama + " telah selesai divaksinasi.");
                        System.out.println();
                        System.out.println("Daftar Pengantri Vaksin");
                        System.out.println("|No.\t|Nama\t|");
                        
                        NodeVaksin13 current = antrian.head;
                        while (current != null) {
                            System.out.println("|" + current.noAntrian + "\t|" + current.nama + "\t|");
                            current = current.next;
                        }
                        
                        System.out.println("Sisa Antrian: " + antrian.hitungSisaAntrian());
                    }
                    break;
                    
                case 3:
                    System.out.println("++++++++++++++++++++++++++++++");
                    antrian.tampilData();
                    break;
                    
                case 4:
                    System.out.println("Program Selesai . . .");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-4.");
            }
            
            System.out.println();
        } while (pilihan != 4);
        
        sc.close();
    }
}