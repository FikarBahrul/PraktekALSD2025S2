package minggu2;
public class mahasiswa13 {
    public mahasiswa13(){

    }
    public mahasiswa13(String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
        String nama;
        String nim;
        String kelas;
        double ipk;
    void tampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Kelas : " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK yang kamu masukkan tidak valid. IPK bernilai antara 0.0 dan 4.0");
        }
    }
    String kinerjaNilai(){
        if (ipk >= 3.5) {
            return "Kinerja kamu sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja kamu baik";
        } else if (ipk >= 2.0) {
            return "Kinerja kamu cukup";
        } else {
            return "Kinerja kamu kurang nih";
        }
    }
}
