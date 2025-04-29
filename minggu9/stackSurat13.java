package minggu9;

public class stackSurat13 {
    surat13[] stack;
    int top;

    public stackSurat13(int kapasitas) {
        stack = new surat13[kapasitas];
        top = -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(surat13 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack penuh, tidak dapat menerima surat lagi.");
        }
    }

    public surat13 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong, tidak ada surat untuk diproses.");
            return null;
        }
    }

    public surat13 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public void cariSuratBerdasarkanNama(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                stack[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan untuk mahasiswa bernama : " + nama);
        }
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                stack[i].tampilkanInfo();
            }
        } else {
            System.out.println("Belum ada surat yang dikumpulkan.");
        }
    }
}
