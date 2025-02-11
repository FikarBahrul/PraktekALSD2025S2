package minggu1;

public class programRoyalGarden {
    public static void main(String[] args) {
        int[][] stokBunga = {
            {10, 5, 15, 7},  // RoyalGarden 1
            {6, 4, 11, 9},   // RoyalGarden 2
            {2, 10, 10, 5},  // RoyalGarden 3
            {5, 7, 12, 9}    // RoyalGarden 4
        }; int[] hargaBunga = {75000, 50000, 60000, 10000};  // Harga Bunga : Aglonema, Keladi, Alocasia, Mawar
    
        mesinPendapatan(stokBunga, hargaBunga);
        mesinHitungTotalStok(stokBunga);
    }


// Fungsi untuk menghitung Pendapatan setiap cabang
public static void mesinPendapatan(int[][] stokBunga, int[] hargaBunga) {
    System.out.println("Pendapatan setiap cabang jika semua stokBarang habis terjual :");
    for (int i = 0; i < stokBunga.length; i++) {
        int pendapatan = 0;
        for (int j = 0; j < stokBunga[i].length; j++) {
            pendapatan += stokBunga[i][j] * hargaBunga[j];
        }
        System.out.println("RoyalGarden " + (i + 1) + " : Rp. " + pendapatan);
    }
    System.out.println();
}
// Fungsi untuk menghitung total stok setiap jenis bunga
public static void mesinHitungTotalStok(int[][] stokBunga) {
    int[] total = new int[4];  // Total untuk Aglonema, Keladi, Alocasia, Mawar
    for (int i = 0; i < stokBunga.length; i++) {
        for (int j = 0; j < stokBunga[i].length; j++) {
            total[j] += stokBunga[i][j];
        }
    }
    System.out.println("Total stok setiap jenis bunga : ");
    System.out.println("Aglonema : " + total[0]);
    System.out.println("Keladi : " + total[1]);
    System.out.println("Alocasia : " + total[2]);
    System.out.println("Mawar : " + total[3]);
    System.out.println();
}
}
