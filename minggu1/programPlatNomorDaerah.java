package minggu1;

import java.util.Scanner;

public class programPlatNomorDaerah{
    public static void main(String[] args) {
        // Array untuk kode plat
        String[] kodePlat = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        
        // Array untuk nama kota
        String[] kota = {
            "BANTEN", "JAKARTA","BANDUNG","CIREBON","BOGOR","PEKALONGAN","SEMARANG","SURABAYA","MALANG","TEGAL"
        };
        
        // Membuat input plat untuk user
        Scanner insertSC = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor yang ingin dicari : ");
        String inputKodePlat = insertSC.nextLine().toUpperCase(); //menjadikan Kapital
        // pencarian kode plat yang ada di Array
        boolean pencarian = false;
        for (int i = 0; i < kodePlat.length; i++) {
            if (kodePlat[i].equals(inputKodePlat)) {
                System.out.println("Kode plat " + inputKodePlat + " berasal dari kota : " + kota[i]);
                pencarian = true;
                break;
            }
        }

        // Jika kode yang dicari tidak dapat ditemukan
        if (!pencarian) {
            System.out.println("Kode plat " + inputKodePlat + " tidak ditemukan.");
        }
        
        insertSC.close();
    }
}
