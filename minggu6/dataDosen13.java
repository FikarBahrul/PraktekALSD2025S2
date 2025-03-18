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
}
