package minggu2;

public class dosen13 {
    private String idDosen;
    private String nama;
    private boolean statusAktif;
    private int tahunBergabung;
    private String bidangKeahlian;

    public dosen13() {
        this.idDosen = "???";
        this.nama = "???";
        this.statusAktif = false;
        this.tahunBergabung = 2000;
        this.bidangKeahlian = "Teknis";
    }

    public dosen13(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // Method untuk menampilkan informasi dosen
    public void tampilInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Status : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
    }

    // Method untuk mengatur status aktif dosen
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println(nama + " saat ini " + (status ? "aktif" : "tidak aktif"));
    }

    // Method untuk menghitung masa kerja dosen
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    // Method untuk mengubah bidang keahlian dosen
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian " + nama + " berubah menjadi " + bidang);
    }
}
