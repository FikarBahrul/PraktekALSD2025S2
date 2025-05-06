package minggu10;

public class AntrianKRS13 {
    MahasiswaKRS13[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahDilayani = 0;

    public AntrianKRS13(int max) {
        this.max = max;
        this.data = new MahasiswaKRS13[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan:");
            data[front].tampilkanData();
            if (size > 1) {
                int kedua = (front + 1) % max;
                data[kedua].tampilkanData();
            }
        }
    }

    public void LihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa paling belakang: ");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian sudah kosong.");
        }
    }

    public void tambahAntrian(MahasiswaKRS13 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambahkan mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil ditambahkan ke antrian.");
    }

    public void panggilUntukKRS() {
        if (size < 2) {
            System.out.println("Antrian tidak cukup untuk memanggil 2 mahasiswa.");
            return;
        }
        System.out.println("Memanggil 2 mahasiswa untuk proses KRS:");
        for (int i = 0; i < 2; i++) {
            MahasiswaKRS13 mhs = layaniMahasiswa();
            if (mhs != null) {
                mhs.tampilkanData();
            }
        }
    }

    public MahasiswaKRS13 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        MahasiswaKRS13 mhs = data[front];
        front = (front + 1) % max;
        size--;
        jumlahDilayani++;
        return mhs;
    }

    public int getJumlahDilayani() {
        return jumlahDilayani;
    }
}
