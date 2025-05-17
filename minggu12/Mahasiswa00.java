package minggu12;

public class Mahasiswa00 {
    String nama;
    String nim;
    String kelas;
    Double ipk;
    
    public Mahasiswa00(String nama, String nim, String kelas, Double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    
    public void tampilInformasi() {
    System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}