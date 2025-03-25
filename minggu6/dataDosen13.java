package minggu6;
public class dataDosen13 {
    dosenDemo13[] dataDosen13 = new dosenDemo13[10];
    int idx = 0;

    void tambah(dosenDemo13 lecturer) {
        if (idx < dataDosen13.length) {
            dataDosen13[idx] = lecturer;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen13[i].tampil();
        }
    }

    void bubblesortASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen13[j].usia > dataDosen13[j + 1].usia) {
                    dosenDemo13 temp = dataDosen13[j];
                    dataDosen13[j] = dataDosen13[j + 1];
                    dataDosen13[j + 1] = temp;
                }
            }
        }
    }

    void selectionsortDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen13[j].usia > dataDosen13[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            dosenDemo13 temp = dataDosen13[maxIndex];
            dataDosen13[maxIndex] = dataDosen13[i];
            dataDosen13[i] = temp;
        }
    }
    void insertionsortDSC() {
        for (int i = 1; i < idx; i++) {
            dosenDemo13 key = dataDosen13[i];
            int j = i - 1;
            while (j >= 0 && dataDosen13[j].usia < key.usia) {
                dataDosen13[j + 1] = dataDosen13[j];
                j = j - 1;
            }
            dataDosen13[j + 1] = key;
        }
    }
    // Searching Sequential nama Dosen
    void PencarianDataSequential13(String nama) {
        if (idx == 0) {
            System.out.println("Input masih kosong ! coba tambahin data baru.");
            return;
        }
    
        boolean ditemukan = false;
        for (int i = 0; i < idx; i++) {
            if (dataDosen13[i].nama.equalsIgnoreCase(nama)) {
                dataDosen13[i].tampil();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan.");
        }
    }
    

    // Searching Binary Usia Dosen
    void PencarianDataBinary13(int usia) {
        bubblesortASC();
        int left = 0, right = idx - 1, count = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dataDosen13[mid].usia == usia) {
                System.out.println("Data ditemukan pada indeks ke-" + mid);
                dataDosen13[mid].tampil();
                count++;
                
                int i = mid - 1;
                while (i >= left && dataDosen13[i].usia == usia) {
                    dataDosen13[i].tampil();
                    count++;
                    i--;
                }
                
                i = mid + 1;
                while (i <= right && dataDosen13[i].usia == usia) {
                    dataDosen13[i].tampil();
                    count++;
                    i++;
                }
                
                break;
            } else if (dataDosen13[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (count == 0) {
            System.out.println("Dosen yang memiliki Usia " + usia + " tidak ditemukan.");
        } else if (count > 1) {
            //Peringatan jika ada lebih dari satu dosen yang memiliki usia yang sama
            System.out.println("WARNING : Telah ditemukan lebih dari satu dosen dengan usia " + usia + ".");
        }
    }
}
