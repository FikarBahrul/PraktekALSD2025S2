package minggu10;

public class AntriMahasiswa13 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public AntriMahasiswa13(String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }
    public void tampilkanData(){
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
