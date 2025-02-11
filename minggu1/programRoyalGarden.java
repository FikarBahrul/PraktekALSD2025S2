package minggu1;

class programRoyalGarden {
    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7},  // RoyalGarden 1
            {6, 4, 11, 9},   // RoyalGarden 2
            {2, 10, 10, 5},  // RoyalGarden 3
            {5, 7, 12, 9}    // RoyalGarden 4
        }; int[] harga = {75000, 50000, 60000, 10000};  // Harga: Aglonema, Keladi, Alocasia, Mawar
    
        tampilkanPendapatan(stok, harga);
        hitungTotalStok(stok);
        kurangiStokMati(stok);
    }


// Fungsi untuk menghitung Pendapatan setiap cabang
public static void tampilkanPendapatan(int[][] stok, int[] harga) {
    System.out.println("Pendapatan setiap cabang jika semua stokBarang habis terjual:");
    for (int i = 0; i < stok.length; i++) {
        int pendapatan = 0;
        for (int j = 0; j < stok[i].length; j++) {
            pendapatan += stok[i][j] * harga[j];
        }
        System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
    }
    System.out.println();
}
// Fungsi untuk menghitung total stok setiap jenis bunga
public static void hitungTotalStok(int[][] stok) {
    int[] total = new int[4];  // Total untuk Aglonema, Keladi, Alocasia, Mawar
    for (int i = 0; i < stok.length; i++) {
        for (int j = 0; j < stok[i].length; j++) {
            total[j] += stok[i][j];
        }
    }
    System.out.println("Total stok setiap jenis bunga:");
    System.out.println("Aglonema: " + total[0]);
    System.out.println("Keladi: " + total[1]);
    System.out.println("Alocasia: " + total[2]);
    System.out.println("Mawar: " + total[3]);
    System.out.println();
}

// Fungsi untuk mengurangi stok bunga yang mati dan menampilkan hasilnya
public static void kurangiStokMati(int[][] stok) {
    int[] pengurangan = {1, 2, 0, 5};  // Pengurangan stok: Aglonema -1, Keladi -2, Alocasia -0, Mawar -5
    for (int i = 0; i < stok.length; i++) {
        for (int j = 0; j < stok[i].length; j++) {
            stok[i][j] = Math.max(0, stok[i][j] - pengurangan[j]);  // Pastikan stok tidak negatif
        }
    }

    System.out.println("Stok setelah pengurangan bunga yang mati:");
    for (int i = 0; i < stok.length; i++) {
        System.out.println("RoyalGarden " + (i + 1) + ": Aglonema=" + stok[i][0] +
                           ", Keladi=" + stok[i][1] +
                           ", Alocasia=" + stok[i][2] +
                           ", Mawar=" + stok[i][3]);
    }
}
}
