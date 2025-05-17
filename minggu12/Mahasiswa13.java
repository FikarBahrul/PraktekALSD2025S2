package minggu12;

public class Mahasiswa13 {
    String nama;
    String nim;
    String jurusan;
    String keperluan;

    Mahasiswa13(String nama, String nim, String jurusan, String keperluan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.keperluan = keperluan;
    }

    String tampilkanInfo() {
        return "Nama: " + nama + 
               "\nNIM: " + nim + 
               "\nJurusan: " + jurusan + 
               "\nKeperluan: " + keperluan;
    }
}
