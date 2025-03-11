package minggu5;
//Konstruktor
class Mahasiswa {
    String nama;
    String NIM;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa(String nama, String NIM, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.NIM = NIM;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
}
//Class
public class nilaiMHS {
    public static void main(String[] args) {
        // Data mahasiswa berdasarkan tabel
        Mahasiswa[] dataMahasiswa = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        // Mencari mahasiswa dengan nilai UTS tertinggi dan terendah
        Mahasiswa mahasiswaUTSTertinggi = cariMHSMax(dataMahasiswa, 0, dataMahasiswa.length - 1);
        Mahasiswa mahasiswaUTSTerendah = cariMHSMin(dataMahasiswa, 0, dataMahasiswa.length - 1);

        // Menghitung rata-rata nilai UAS
        double rataRataUAS = hitungRataRataUAS(dataMahasiswa);

        System.out.println("=<><><>= Hasil Nilai Mahasiswa =<><><>=\n");

        System.out.println("Mahasiswa dengan Nilai UTS Tertinggi:");
        tampilkanDataMahasiswa(mahasiswaUTSTertinggi);

        System.out.println("\nMahasiswa dengan Nilai UTS Terendah:");
        tampilkanDataMahasiswa(mahasiswaUTSTerendah);

        System.out.printf("\nRata-rata Nilai UAS: %.2f\n", rataRataUAS);
    }

    // Divide and Conquer untuk mencari mahasiswa dengan nilai UTS tertinggi
    public static Mahasiswa cariMHSMax(Mahasiswa[] array, int l, int r) {
        if (l == r) {
            return array[l];
        }
        int mid = (l + r) / 2;
        Mahasiswa lMaks = cariMHSMax(array, l, mid);
        Mahasiswa rMaks = cariMHSMax(array, mid + 1, r);

        return (lMaks.nilaiUTS > rMaks.nilaiUTS) ? lMaks : rMaks;
    }

    // Divide and Conquer untuk mencari mahasiswa dengan nilai UTS terendah
    public static Mahasiswa cariMHSMin(Mahasiswa[] array, int l, int r) {
        if (l == r) {
            return array[l];
        }
        int mid = (l + r) / 2;
        Mahasiswa lMin = cariMHSMin(array, l, mid);
        Mahasiswa rMin = cariMHSMin(array, mid + 1, r);

        return (lMin.nilaiUTS < rMin.nilaiUTS) ? lMin : rMin;
    }

    // Brute Force untuk menghitung rata-rata nilai UAS
    public static double hitungRataRataUAS(Mahasiswa[] array) {
        int total = 0;
        for (Mahasiswa mhs : array) {
            total += mhs.nilaiUAS;
        }
        return (double) total / array.length;
    }

    // Menampilkan data mahasiswa
    public static void tampilkanDataMahasiswa(Mahasiswa mhs) {
        System.out.println("Nama        : " + mhs.nama);
        System.out.println("NIM         : " + mhs.NIM);
        System.out.println("Tahun Masuk : " + mhs.tahunMasuk);
        System.out.println("Nilai UTS   : " + mhs.nilaiUTS);
        System.out.println("Nilai UAS   : " + mhs.nilaiUAS);
    }
}
