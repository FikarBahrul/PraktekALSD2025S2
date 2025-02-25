package minggu3;
import java.util.Scanner;
public class mahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        mahasiswa13 [] arrayOfMahasiswa = new mahasiswa13[3];
        String dummy;
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new mahasiswa13();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = sc13.nextLine();

            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = sc13.nextLine();

            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc13.nextLine();

            System.out.print("IPK   : ");
            dummy = sc13.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------");
            
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1) + ":");
            System.out.println("NIM        : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama       : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas      : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK        : " + arrayOfMahasiswa[i].ipk);
            System.out.println("------------------------------------");
            
        }
    
    }
}
