package minggu15;

public class BinaryTreeMain00 {
    public static void main(String[] args) {
        BinaryTree00 bst = new BinaryTree00();

        bst.add(new Mahasiswa00("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa00("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa00("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa00("244160220", "Dewi", "D", 3.54));

        System.out.println("\nDaftar semua mahasiswa:");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54)?"Ditemukan":"Tidak Ditemukan";
        System.out.println(hasilCari);
        
        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22)?"Ditemukan":"Tidak Ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa00("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa00("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa00("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("\nInOrderTraversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrderTraversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrderTraversal:");
        bst.traversePostOrder(bst.root);

        System.out.print("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        //Modified
        System.out.println("\nPenambahan berdasarkan rekursif : ");
        bst.addRekursif(new Mahasiswa00("244160999", "Rina", "A", 3.92));
        bst.traverseInOrder(bst.root);
        
        // mencari ipk terkecil dan terbesar
        System.out.println("\nMahasiswa IPK terkecil:");
        bst.cariMinIPK().tampilInformasi();
        System.out.println("Mahasiswa IPK terbesar:");
        bst.cariMaxIPK().tampilInformasi();
        
        // mencari mahasiswa yang ipknya diatas 3.50
        bst.tampilMahasiswaIPKdiAtas(3.50);
    }
}
