package minggu9;

public class surat13 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // S untuk Sakit, I untuk Izin
    int durasi; //Durasi untuk Sakit/Izin

    public surat13(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilkanInfo() {
        System.out.printf("ID: %s | Nama: %s | Kelas: %s | Jenis: %c | Durasi: %d hari\n", 
                          idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
    }
}
