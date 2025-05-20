package minggu13;
public class AntrianFilmDLL13 {
    NodeFilm13 head;
    NodeFilm13 tail;
    int size;

    public AntrianFilmDLL13() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahDataAwal(int id, String judul, double rating) {
        NodeFilm13 newNode = new NodeFilm13(id, judul, rating);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void tambahDataAkhir(int id, String judul, double rating) {
        NodeFilm13 newNode = new NodeFilm13(id, judul, rating);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public boolean tambahDataIndex(int id, String judul, double rating, int indeks) {
        if (indeks < 0 || indeks > size) {
            return false;
        }

        if (indeks == 0) {
            tambahDataAwal(id, judul, rating);
            return true;
        } else if (indeks == size) {
            tambahDataAkhir(id, judul, rating);
            return true;
        } else {
            NodeFilm13 newNode = new NodeFilm13(id, judul, rating);
            NodeFilm13 current = head;
            
            for (int i = 0; i < indeks - 1; i++) {
                current = current.next;
            }
            
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
            return true;
        }
    }

    public NodeFilm13 hapusDataPertama() {
        if (isEmpty()) {
            return null;
        }
        
        NodeFilm13 temp = head;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return temp;
    }

    public NodeFilm13 hapusDataTerakhir() {
        if (isEmpty()) {
            return null;
        }
        
        NodeFilm13 temp = tail;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return temp;
    }

    public NodeFilm13 hapusDataTertentu(int indeks) {
        if (isEmpty() || indeks < 0 || indeks >= size) {
            return null;
        }
        
        if (indeks == 0) {
            return hapusDataPertama();
        } else if (indeks == size - 1) {
            return hapusDataTerakhir();
        } else {
            NodeFilm13 current = head;
            for (int i = 0; i < indeks; i++) {
                current = current.next;
            }
            
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            return current;
        }
    }

    public void cetakData() {
        if (isEmpty()) {
            System.out.println("List masih kosong");
            return;
        }
        
        System.out.println("Cetak Data");
        NodeFilm13 current = head;
        int i = 1;
        while (current != null) {
            System.out.println("ID: " + current.idFilm);
            System.out.println("Judul Film: " + current.judulFilm);
            System.out.println("Ipk: " + current.rating);
            System.out.println();
            current = current.next;
            i++;
        }
    }

    public NodeFilm13 cariFilm(int id) {
        if (isEmpty()) {
            return null;
        }
        
        NodeFilm13 current = head;
        int index = 1;
        while (current != null) {
            if (current.idFilm == id) {
                System.out.println("Data ID Film: " + id + " berada di node ke- " + index);
                System.out.println("IDENTITAS");
                System.out.println("ID Film: " + current.idFilm);
                System.out.println("Judul Film: " + current.judulFilm);
                System.out.println("IMDB Rating: " + current.rating);
                return current;
            }
            current = current.next;
            index++;
        }
        System.out.println("Data ID Film " + id + " tidak ditemukan");
        return null;
    }

    public void urutRatingDesc() {
        if (isEmpty() || size == 1) {
            return;
        }
        
        boolean ditukar;
        NodeFilm13 current;
        NodeFilm13 index;
        int id;
        String judul;
        double rating;
        
        do {
            ditukar = false;
            current = head;
            
            while (current.next != null) {
                index = current.next;
                
                if (current.rating < index.rating) {
                    id = current.idFilm;
                    judul = current.judulFilm;
                    rating = current.rating;
                    
                    current.idFilm = index.idFilm;
                    current.judulFilm = index.judulFilm;
                    current.rating = index.rating;
                    
                    index.idFilm = id;
                    index.judulFilm = judul;
                    index.rating = rating;
                    
                    ditukar = true;
                }
                current = current.next;
            }
        } while (ditukar);
    }
}