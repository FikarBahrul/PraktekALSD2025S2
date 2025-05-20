package minggu13;

import java.util.Scanner;

public class AntrianFilmDLLMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianFilmDLL13 daftarFilm = new AntrianFilmDLL13();
        int pilihan;
        
        do {
            System.out.println("===================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("===================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("===================================");
            System.out.print("Pilih menu (1-10): ");
            pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n1");
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID Film: ");
                    int idAwal = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String judulAwal = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double ratingAwal = sc.nextDouble();
                    
                    daftarFilm.tambahDataAwal(idAwal, judulAwal, ratingAwal);
                    break;
                
                case 2:
                    System.out.println("\n2");
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.println("ID Film: ");
                    int idAkhir = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String judulAkhir = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double ratingAkhir = sc.nextDouble();
                    
                    daftarFilm.tambahDataAkhir(idAkhir, judulAkhir, ratingAkhir);
                    break;
                
                case 3:
                    System.out.println("\n3");
                    System.out.println("Masukkan Data Film");
                    System.out.print("Urutan ke-");
                    int posisi = sc.nextInt();
                    System.out.println("ID Film: ");
                    int idTengah = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String judulTengah = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double ratingTengah = sc.nextDouble();
                    
                    boolean berhasil = daftarFilm.tambahDataIndex(idTengah, judulTengah, ratingTengah, posisi - 1);
                    if (berhasil) {
                        System.out.println("Data Film ini akan masuk di urutan ke-" + posisi);
                    } else {
                        System.out.println("Posisi tidak valid. Penambahan data gagal.");
                    }
                    break;
                
                case 4:
                    NodeFilm13 hapusAwal = daftarFilm.hapusDataPertama();
                    if (hapusAwal != null) {
                        System.out.println("\nData film pertama berhasil dihapus");
                    } else {
                        System.out.println("\nDaftar film kosong");
                    }
                    break;
                
                case 5:
                    NodeFilm13 hapusAkhir = daftarFilm.hapusDataTerakhir();
                    if (hapusAkhir != null) {
                        System.out.println("\nData film terakhir berhasil dihapus");
                    } else {
                        System.out.println("\nDaftar film kosong");
                    }
                    break;
                
                case 6:
                    System.out.print("\nMasukkan indeks data yang akan dihapus: ");
                    int indeksHapus = sc.nextInt();
                    NodeFilm13 hapusPos = daftarFilm.hapusDataTertentu(indeksHapus - 1);
                    if (hapusPos != null) {
                        System.out.println("Data film ke-" + indeksHapus + " berhasil dihapus");
                    } else {
                        System.out.println("Indeks tidak valid atau daftar film kosong");
                    }
                    break;
                
                case 7:
                    System.out.println("\n7");
                    daftarFilm.cetakData();
                    break;
                
                case 8:
                    System.out.println("\n8");
                    System.out.println("Cari Data");
                    System.out.print("Masukkan ID Film yang dicari: ");
                    int idCari = sc.nextInt();
                    daftarFilm.cariFilm(idCari);
                    break;
                
                case 9:
                    daftarFilm.urutRatingDesc();
                    System.out.println("\nData film telah diurutkan berdasarkan rating secara descending");
                    break;
                
                case 10:
                    System.out.println("\nProgram Selesai . . .");
                    break;
                
                default:
                    System.out.println("\nPilihan tidak valid. Silakan pilih 1-10.");
            }
            
            System.out.println();
        } while (pilihan != 10);
        
        sc.close();
    }
}