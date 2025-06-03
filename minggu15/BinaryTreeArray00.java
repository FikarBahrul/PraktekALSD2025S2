package minggu15;

public class BinaryTreeArray00 {
    Mahasiswa00[] dataMahasiswa;
    int idxLast;
    
    public BinaryTreeArray00 (){
        this.dataMahasiswa = new Mahasiswa00[10];
    }
    void populateData(Mahasiswa00 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traversalInOrder(int idxStart){
        if(idxStart <= idxLast){
            if(dataMahasiswa[idxStart] != null){
                traversalInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traversalInOrder(2*idxStart+2);
            }
        }
    }
    //Modified
    void add(Mahasiswa00 data) {
        if (idxLast + 1 >= dataMahasiswa.length) {
            System.out.println("Binary Tree Array penuh!");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
        //Sorting array berdasarkan IPK buat mempertahankan struktur BinarySearchTree
        for (int i = idxLast; i > 0; i--) {
            if (dataMahasiswa[i].ipk < dataMahasiswa[i-1].ipk) {
                // Swap
                Mahasiswa00 temp = dataMahasiswa[i];
                dataMahasiswa[i] = dataMahasiswa[i-1];
                dataMahasiswa[i-1] = temp;
            } else {
                break;
            }
        }
    }
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2*idxStart+1);
                traversePreOrder(2*idxStart+2);
            }
        }
    }
}
