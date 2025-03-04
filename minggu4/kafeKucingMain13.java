package minggu4;
public class kafeKucingMain13 {
    public static void main(String[] args) {

        kafeKucingOperasi13 kafe = new kafeKucingOperasi13("NyanNyan Cafe", "Jl. Perunggu Demak No. 10", "09:00 - 21:00", 20);
        
        // Menampilkan informasi kafe
        kafe.infoKafe();
        
        // Menambahkan kucing ke dalam daftar
        kafe.tambahKucing("Mochi", 2, "Kucing Ceper", "Manja");
        kafe.tambahKucing("Bento", 3, "Kucing Oren", "Preman Pasar");
        kafe.tambahKucing("Luna", 1, "Scottish Fold", "Pemarah");
        
        // Menampilkan daftar kucing
        kafe.tampilkanKucing();
        
        // Melakukan reservasi
        kafe.reservasi("Budi", 10);
    }
}
