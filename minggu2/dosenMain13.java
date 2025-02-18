package minggu2;

// Kelas DosenMain untuk memanggil Kelas Dosen
public class dosenMain13 {
    public static void main(String[] args) {
        // Membuat objek dosen pertama
        dosen13 dosen1 = new dosen13("C777", "Ananda Pratama", true, 2000, "Software Engineer");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Machine Learning");
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        //setelah berubah
        dosen1.tampilInformasi();

        // Membuat objek dosen kedua
        dosen13 dosen2 = new dosen13("D666", "Ahmad Pratama", true, 2000, "CyberSecurity");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false);
        System.out.println("Masa kerja: " + dosen2.hitungMasaKerja(2020) + " tahun");
        dosen2.ubahKeahlian("Database Administrator");
        //setelah berubah
        dosen2.tampilInformasi();
    }
}
