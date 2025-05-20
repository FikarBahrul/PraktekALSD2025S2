package minggu13;

public class NodeVaksin13 {
    int noAntrian;
    String nama;
    NodeVaksin13 prev, next;

    public NodeVaksin13(int noAntrian, String nama) {
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.prev = null;
        this.next = null;
    }
}