package minggu12;

import java.util.Scanner;

public class AntrianMahasiswaMain13 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        AntrianMahasiswa13 antrian = new AntrianMahasiswa13();
        int opsi = 0;
        
        do {
            System.out.println("\n=<->= PROGRAM ANTRIAN LAYANAN MAHASISWA =<->=");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Tampilkan Antrian Terdepan");
            System.out.println("6. Tampilkan Antrian Terakhir");
            System.out.println("7. Tampilkan Jumlah Antrian");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan anda : ");
            
            opsi = sc13.nextInt();
            sc13.nextLine(); 
            
            switch (opsi) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian sudah penuh!");
                    } else {
                        System.out.println("\n=|= ANTRIAN MAHASISWA =|=");
                        System.out.print("Nama: ");
                        String nama = sc13.nextLine();
                        System.out.print("NIM: ");
                        String nim = sc13.nextLine();
                        System.out.print("Jurusan: ");
                        String jurusan = sc13.nextLine();
                        System.out.print("Keperluan: ");
                        String keperluan = sc13.nextLine();
                        
                        Mahasiswa13 mhs = new Mahasiswa13(nama, nim, jurusan, keperluan);
                        antrian.tambahAntrian(mhs);
                    }
                    break;
                    
                case 2:
                    Mahasiswa13 dipanggil = antrian.panggilAntrian();
                    if (dipanggil != null) {
                        System.out.println("\n=~= MEMANGGIL MAHASISWA =~=");
                        System.out.println(dipanggil.tampilkanInfo());
                    }
                    break;
                    
                case 3:
                    System.out.println(antrian.isEmpty() ? "Status : Antrian Kosong!" : "Status : Antrian Tidak Kosong!");
                    break;
                    
                case 4:
                    System.out.println(antrian.isFull() ? "Status : Antrian Penuh!" : "Status : Antrian Tidak Penuh!");
                    break;
                    
                case 5:
                    Mahasiswa13 terdepan = antrian.antrianTerdepan();
                    if (terdepan != null) {
                        System.out.println("\n=<>= MAHASISWA TERDEPAN =<>=");
                        System.out.println(terdepan.tampilkanInfo());
                    }
                    break;
                    
                case 6:
                    Mahasiswa13 terakhir = antrian.antrianTerakhir();
                    if (terakhir != null) {
                        System.out.println("\n=><= MAHASISWA TERAKHIR =><=");
                        System.out.println(terakhir.tampilkanInfo());
                    }
                    break;
                    
                case 7:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                    
                case 8:
                    antrian.kosongkanAntrian();
                    break;
                    
                case 0:
                    System.out.println("Program Selesai . . .");
                    break;
                    
                default:
                    System.out.println("Opsi tidak valid!");
            }
            
        } while (opsi != 0);
        
        sc13.close();
    }
}
