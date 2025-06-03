package minggu15;
public class BinaryTreeArrayMain00 {
    public static void main(String[] args) {
        BinaryTreeArray00 bta = new BinaryTreeArray00();
        Mahasiswa00 mhs1 = new Mahasiswa00("244160121","Ali","A",3.57);
        Mahasiswa00 mhs2 = new Mahasiswa00("244160185","Candra","C",3.41);
        Mahasiswa00 mhs3 = new Mahasiswa00("244160221","Badar","B",3.75);
        Mahasiswa00 mhs4 = new Mahasiswa00("244160220","Dewi","B",3.35);

        Mahasiswa00 mhs5 = new Mahasiswa00("244160131","Devi","A",3.48);
        Mahasiswa00 mhs6 = new Mahasiswa00("244160205","Ehsan","D",3.61);
        Mahasiswa00 mhs7 = new Mahasiswa00("244160170","Fizi","E",3.86);

        Mahasiswa00[] dataMahasiswas = {mhs1,mhs2,mhs3,mhs4,mhs5,mhs6,mhs7,null,null,null};
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa : ");
        bta.traversalInOrder(0);

        //Modified
        System.out.println("\nMenambah mahasiswa dengan method add :");
        bta.add(new Mahasiswa00("244160888", "Yanto", "A", 3.92));
        bta.traversalInOrder(0);
        System.out.println("\nPreOrder Traversal:");
        bta.traversePreOrder(0);
    }
}
