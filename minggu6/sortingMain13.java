package minggu6;

public class sortingMain13 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = { 30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};

        sorting13 dataurut1 = new sorting13(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubblesort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        System.out.println();

        sorting13 dataurut2 = new sorting13(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.bubblesort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        System.out.println();

        sorting13 dataurut3 = new sorting13(c, c.length);
        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.bubblesort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();

    }
}
