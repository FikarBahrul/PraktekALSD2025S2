package minggu2;

public class matKul13 {
    
     String kodeMK;
     String nama;
     int sks;
     int jumlahJam;

    // Konstruktor default
    public matKul13() {
        this.kodeMK = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }
    public matKul13(String kodeMatkul13, String nm13, int sks13, int jumlahJam13) {
        this.kodeMK = kodeMatkul13;
        this.nama = nm13;
        this.sks = sks13;
        this.jumlahJam = jumlahJam13;
    }
    //Method untuk menampilkan informasi MataKuliah
    public void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam Kuliah : " + jumlahJam);
    }
    //Method untuk merubah SKS
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS sudah berubah menjadi : " + sks);
    }
    //Method untuk menambahkan Jam Kuliah
    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam setelah bertambah : " + jumlahJam);
    }
    //Method untuk mengurangi Jam Kuliah
    public void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan jam kamu tidak bisa dilaksanakan karena jumlah jam kamu tidak cukup.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam setelah berkurang : " + jumlahJam);
        }
    }
}
