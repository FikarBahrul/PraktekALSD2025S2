package minggu12;

// import java.util.Scanner;

public class SLLMain00 {
    public static void main(String[] args) {
     // Scanner sc = new Scanner(System.in);
    SingleLinkedList00 sll = new SingleLinkedList00();
        Mahasiswa00 mhs1 = new Mahasiswa00("Dirga", "21212203", "4D", 3.6);
        Mahasiswa00 mhs2 = new Mahasiswa00("Cintia","22212202",  "3C", 3.5);
        Mahasiswa00 mhs3 = new Mahasiswa00("Bimon", "23212201", "2B", 3.8);
        Mahasiswa00 mhs4 = new Mahasiswa00("Alvaro","24212200",  "1A", 4.0);
        
        sll.addFirst(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);
        
        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : "+sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    //     int pilihan;
    //     do {
    //         System.out.println("\n=<>= MENU =<>=");
    //         System.out.println("1. Tambah Data Awal");
    //         System.out.println("2. Tambah Data Akhir");
    //         System.out.println("3. Tambah Data di Posisi Tertentu");
    //         System.out.println("4. Tambah Data Setelah Nama Tertentu");
    //         System.out.println("5. Tampilkan Data");
    //         System.out.println("0. Keluar");
    //         System.out.print("Pilih menu: ");
    //         pilihan = sc.nextInt();
    //         sc.nextLine(); 
            
    //         switch (pilihan) {
    //             case 1:
    //                 tambahDataAwal(sc, sll);
    //                 break;
    //             case 2:
    //                 tambahDataAkhir(sc, sll);
    //                 break;
    //             case 3:
    //                 tambahDataPosisi(sc, sll);
    //                 break;
    //             case 4:
    //                 tambahDataSetelahNama(sc, sll);
    //                 break;
    //             case 5:
    //                 sll.print();
    //                 break;
    //             case 0:
    //                 System.out.println("Program Selesai . . .");
    //                 break;
    //             default:
    //                 System.out.println("Pilihan tidak valid!");
    //         }
    //     } while (pilihan != 0);
        
    //     sc.close();
    // }
    
    // static void tambahDataAwal(Scanner sc, SingleLinkedList00 sll) {
    //     System.out.println("\n=<>= Tambah Data Awal =<>=");
    //     System.out.print("Masukkan Nama: ");
    //     String nama = sc.nextLine();
    //     System.out.print("Masukkan NIM: ");
    //     String nim = sc.nextLine();
    //     System.out.print("Masukkan Kelas: ");
    //     String kelas = sc.nextLine();
    //     System.out.print("Masukkan Ipk: ");
    //     double ipk = sc.nextDouble();
    //     sc.nextLine(); 
        
    //     Mahasiswa00 mhs = new Mahasiswa00(nama, nim, kelas, ipk);
    //     sll.addFirst(mhs);
    //     System.out.println("Data berhasil ditambahkan di awal!");
    // }
    
    // static void tambahDataAkhir(Scanner sc, SingleLinkedList00 sll) {
    //     System.out.println("\n=<>= Tambah Data Akhir =<>=");
    //     System.out.print("Masukkan Nama: ");
    //     String nama = sc.nextLine();
    //     System.out.print("Masukkan NIM: ");
    //     String nim = sc.nextLine();
    //     System.out.print("Masukkan Kelas: ");
    //     String kelas = sc.nextLine();
    //     System.out.print("Masukkan Ipk: ");
    //     double ipk = sc.nextDouble();
    //     sc.nextLine(); 
        
    //     Mahasiswa00 mhs = new Mahasiswa00(nama, nim, kelas, ipk);
    //     sll.addLast(mhs);
    //     System.out.println("Data berhasil ditambahkan di akhir!");
    // }
    
    // static void tambahDataPosisi(Scanner sc, SingleLinkedList00 sll) {
    //     System.out.println("\n=<>= Tambah Data di Posisi Tertentu =<>=");
    //     System.out.print("Masukkan posisi : ");
    //     int index = sc.nextInt();
    //     sc.nextLine(); 
        
    //     System.out.print("Masukkan Nama: ");
    //     String nama = sc.nextLine();
    //     System.out.print("Masukkan NIM: ");
    //     String nim = sc.nextLine();
    //     System.out.print("Masukkan Kelas: ");
    //     String kelas = sc.nextLine();
    //     System.out.print("Masukkan Ipk: ");
    //     double ipk = sc.nextDouble();
    //     sc.nextLine(); 
        
    //     Mahasiswa00 mhs = new Mahasiswa00(nim, nama, kelas, ipk);
    //     sll.insertAt(index, mhs);
    //     System.out.println("Data berhasil ditambahkan di posisi " + index + "!");
    // }
    
    // static void tambahDataSetelahNama(Scanner sc, SingleLinkedList00 sll) {
    //     System.out.println("\n=<>= Tambah Data Setelah Nama Tertentu =<>=");
    //     System.out.print("Masukkan nama mahasiswa yang menjadi acuan: ");
    //     String key = sc.nextLine();
        
    //     System.out.print("Masukkan Nama: ");
    //     String nama = sc.nextLine();
    //     System.out.print("Masukkan NIM: ");
    //     String nim = sc.nextLine();
    //     System.out.print("Masukkan Kelas: ");
    //     String kelas = sc.nextLine();
    //     System.out.print("Masukkan Ipk: ");
    //     double ipk = sc.nextDouble();
    //     sc.nextLine(); 
        
    //     Mahasiswa00 mhs = new Mahasiswa00(nim, nama, kelas, ipk);
    //     sll.insertAfter(key, mhs);
    //     System.out.println("Data berhasil ditambahkan setelah mahasiswa " + key + "!");
    }
}