package minggu2;

public class mahasiswaMain13 {
    public static void main(String[] args) {
        mahasiswa13 mhs1 = new mahasiswa13();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2K";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa13 mhs2 = new mahasiswa13("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa13 mhsFikar = new mahasiswa13("Fikar Bahrul Santoso", "244107020160", 2.0, "1A TI");
        mhsFikar.ubahKelas("TI 1A");
        mhsFikar.updateIpk(3.2);
        mhsFikar.tampilkanInformasi();
    }
}
