package minggu13;

public class AntrianVaksinDLL13 {
    NodeVaksin13 head;
    NodeVaksin13 tail;

    public AntrianVaksinDLL13() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void tambahData(int noAntrian, String nama) {
        NodeVaksin13 newNode = new NodeVaksin13(noAntrian, nama);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public NodeVaksin13 hapusData() {
        if (isEmpty()) {
            return null;
        }

        NodeVaksin13 tmp = head;
        
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return tmp;
    }

    public void tampilData() {
        if (isEmpty()) {
            System.out.println("Daftar antrian kosong!");
            return;
        }

        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("|No.\t|Nama\t|");
        
        NodeVaksin13 current = head;
        while (current != null) {
            System.out.println("|" + current.noAntrian + "\t|" + current.nama + "\t|");
            current = current.next;
        }
        
        System.out.println("Sisa Antrian: " + hitungSisaAntrian());
    }
    public int hitungSisaAntrian() {
        int jml = 0;
        NodeVaksin13 current = head;
        while (current != null) {
            jml++;
            current = current.next;
        }
        return jml;
    }
}