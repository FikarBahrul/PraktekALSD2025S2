package minggu2;

public class matKulMain13 {
    public static void main(String[] args) {
        matKul13 matkul1 = new matKul13("Matkul 03", "Praktikum ALSD", 3, 6);
        matkul1.tampilInformasi();
        matkul1.ubahSKS(6);
        matkul1.tambahJam(6);
        matkul1.kurangiJam(2);
        //setelah berubah
        matkul1.tampilInformasi();
        
        matKul13 matkul2 = new matKul13("Matkul 04", "User Interface", 2, 4);
        matkul2.tampilInformasi();
        matkul2.ubahSKS(3);
        matkul2.tambahJam(1);
        matkul2.kurangiJam(2);
        //setelah berubah
        matkul2.tampilInformasi();
    }
}
