package minggu4;

// Kelas utama untuk kafe kucing
public class kafeKucingOperasi13 {
    // Atribut utama
    private String namaKafe;
    private String lokasi;
    private String jamOperasional;
    private int kapasitas;
    
    // Konstruktor (Pastikan nama sesuai dengan kelas)
    public kafeKucingOperasi13(String namaKafe, String lokasi, String jamOperasional, int kapasitas) {
        this.namaKafe = namaKafe;
        this.lokasi = lokasi;
        this.jamOperasional = jamOperasional;
        this.kapasitas = kapasitas;
    }
    
    // Method untuk menampilkan informasi kafe
    public void infoKafe() {
        System.out.println("Nama Kafe : " + this.namaKafe);
        System.out.println("Lokasi : " + this.lokasi);
        System.out.println("Jam Operasional : " + this.jamOperasional);
        System.out.println("Kapasitas Maksimum : " + this.kapasitas + " orang");
        System.out.println("=================================");
    }

    // Method untuk menambahkan kucing ke dalam daftar
    public void tambahKucing(String nama, int umur, String jenis, String kepribadian) {
        System.out.println("Kucing baru telah ditambahkan!");
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun, Jenis: " + jenis + ", Kepribadian: " + kepribadian);
        System.out.println("=================================");
    }
    
    // Method untuk menerima reservasi kafe
    public void reservasi(String namaPelanggan, int jumlahOrang) {
        if (jumlahOrang > this.kapasitas) {
            System.out.println("Maaf, reservasi tidak bisa dilakukan. Kapasitas maksimum hanya " + this.kapasitas + " orang.");
        } else {
            System.out.println("Reservasi berhasil! " + namaPelanggan + " telah memesan untuk " + jumlahOrang + " orang.");
        }
        System.out.println("=================================");
    }
    
    // Method untuk menampilkan daftar kucing
    public void tampilkanKucing() {
        System.out.println("Daftar Kucing di Café:");
        System.out.println("1. Mochi - Kucing Ceper - Manja - 2 tahun");
        System.out.println("2. Bento - Kucing Oren - Preman Pasar - 3 tahun");
        System.out.println("3. Luna - Scottish Fold - Pemarah - 1 tahun");
        System.out.println("=================================");
    }
}
