package minggu13;

public class NodeFilm13 {
    int idFilm;
    String judulFilm;
    double rating;
    NodeFilm13 prev, next;

    public NodeFilm13(int id, String judul, double rate) {
        this.idFilm = id;
        this.judulFilm = judul;
        this.rating = rate;
        this.prev = null;
        this.next = null;
    }
}