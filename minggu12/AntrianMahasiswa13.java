package minggu12;

public class AntrianMahasiswa13 {
    NodeAntrianMahasiswa13 front; 
    NodeAntrianMahasiswa13 rear;  
    int jumlahAntrian;

    AntrianMahasiswa13() {
        front = null;
        rear = null;
        jumlahAntrian = 0;
    }

    boolean isEmpty() {
        return jumlahAntrian == 0;
    }

    boolean isFull() {
        return jumlahAntrian >= 100;
    }

    void tambahAntrian(Mahasiswa13 mahasiswa) {
        NodeAntrianMahasiswa13 nodeBaru = new NodeAntrianMahasiswa13(mahasiswa);
        
        if (isEmpty()) {
            front = nodeBaru;
        } else {
            rear.next = nodeBaru;
        }
        
        rear = nodeBaru;
        jumlahAntrian++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian!");
    }

    Mahasiswa13 panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        
        Mahasiswa13 mahasiswa = front.data;
        front = front.next;
        
        if (front == null) {
            rear = null;
        }
        
        jumlahAntrian--;
        return mahasiswa;
    }

    Mahasiswa13 antrianTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        return front.data;
    }

    Mahasiswa13 antrianTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        return rear.data;
    }

    int getJumlahAntrian() {
        return jumlahAntrian;
    }

    void kosongkanAntrian() {
        front = null;
        rear = null;
        jumlahAntrian = 0;
        System.out.println("Antrian berhasil dikosongkan!");
    }
}
