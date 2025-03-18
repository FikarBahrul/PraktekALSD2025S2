package minggu6;

public class mahasiswa13 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    //Konstruktor Default
    mahasiswa13(){
    }

    public mahasiswa13(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }
    void tampilInformasi(){
        System.out.println("Nama : "+ nama);
        System.out.println("NIM : "+ nim);
        System.out.println("Kelas : "+ kelas);
        System.out.println("IPK : "+ ipk);

    }
    
}
