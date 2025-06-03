package minggu15;

public class BinaryTree00 {
    Node00 root;

    public BinaryTree00(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }
    
    public void add(Mahasiswa00 mahasiswa){
        Node00 newNode = new Node00(mahasiswa);
        if(isEmpty()){
            root = newNode;
        } else {
            Node00 current = root;
            Node00 parent = null;
            while(true){
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk){
        boolean result = false;
        Node00 current = root;
        while(current != null){
            if(current.mahasiswa.ipk == ipk){
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk){
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node00 node){
        if (node != null){
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node00 node){
        if (node != null){
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }
    void traversePostOrder(Node00 node){
        if (node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }
    Node00 getSuccessor(Node00 del){
        Node00 successor = del.right;
        Node00 successorParent = del;

        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right){
            successorParent.left = successor.left;
            successor.right = del.right;
        }
        return successor;
    }
    void delete(double ipk){
        if (isEmpty()){
            System.out.println("Binary Tree kosong");
            return;
        }
        //Cari node (current) yang akan dihapus
        Node00 parent = root;
        Node00 current = root;
        boolean isLeftChild = false;

        while (current != null){
            if(current.mahasiswa.ipk == ipk){
                break;
            } else if (ipk < current.mahasiswa.ipk){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //penghapusan
        if(current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus.
            if(current.left == null && current.right == null){
                if(current == null){
                root = null;
            } else {
                if(isLeftChild){
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        }else if(current.left == null){//jika hanya punya 1 anak (kanan)
                if (current == root){
                    root = current.right;
                } else {
                    if(isLeftChild){
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                }
            }
        }else if(current.right == null){ //jika hanya punya 1 anak (kiri)
                if (current == root){
                    root = current.left;
                }else {
                    if(isLeftChild){
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }  
            } else {//jika punya 2 anak
                Node00 successor = getSuccessor(current);
                System.out.println(" Jika 2 Anak. current =");
                successor.mahasiswa.tampilInformasi();
                if(current == root){
                    root = successor;
                } else {
                    if(isLeftChild){
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
    //Modified
    public void addRekursif(Mahasiswa00 mahasiswa) {
        root = addRekursifAssist(root, mahasiswa);
    }

    public Node00 addRekursifAssist(Node00 node, Mahasiswa00 mahasiswa) {
        // Base case jika node kosong akan membuat node baru
        if (node == null) {
            return new Node00(mahasiswa);
        }
        // Rekursif dengan membandingkan IPK serta memilih arah
        if (mahasiswa.ipk < node.mahasiswa.ipk) {
            node.left = addRekursifAssist(node.left, mahasiswa);
        } else {
            node.right = addRekursifAssist(node.right, mahasiswa);
        }
        return node;
    }
     public Mahasiswa00 cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Binary Tree kosong");
            return null;
        }
        
        Node00 current = root;
        // IPK terkecil di node paling kiri
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa;
    }
    public Mahasiswa00 cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Binary Tree kosong");
            return null;
        }
        
        Node00 current = root;
        // IPK terbesar di node paling kanan
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa;
    }
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("\nMahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilMahasiswaIPKdiAtasAssist(root, ipkBatas);
    }

    public void tampilMahasiswaIPKdiAtasAssist(Node00 node, double ipkBatas) {
        if (node != null) {
            // Traversal InOrder
            tampilMahasiswaIPKdiAtasAssist(node.left, ipkBatas);
            
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            
            tampilMahasiswaIPKdiAtasAssist(node.right, ipkBatas);
        }
    }
}