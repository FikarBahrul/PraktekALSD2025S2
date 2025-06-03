package minggu15;

public class Node00 {
     Mahasiswa00 mahasiswa;
     Node00 left, right;
     
     public Node00(){
     }
     public Node00(Mahasiswa00 mahasiswa){
        this.mahasiswa = mahasiswa;
        left = right = null;
     }
}