package minggu6;

public class mahasiswaBerprestasi13 {
    mahasiswa13 [] listMhs = new mahasiswa13[5];
    int idx;

    mahasiswaBerprestasi13(int jumlah) {
        listMhs = new mahasiswa13[jumlah];
        idx = 0;
    }

    void tambah(mahasiswa13 m){
        if (idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil (){
        for (mahasiswa13 m:listMhs)
        m.tampilInformasi();
        System.out.println("-----------------------------");
    }
    void bubblesort(){
        for (int i=0; i<listMhs.length-1;i++){
            for (int j = 1; j<listMhs.length-i;j++){
                if(listMhs[j].ipk>listMhs[j-1].ipk){
                    mahasiswa13 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
    void selectionsort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            mahasiswa13 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    void insertionsortASC() {
        for (int i = 1; i < listMhs.length; i++) {
            mahasiswa13 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
    void insertionsortDSC() {
        for (int i = 1; i < listMhs.length; i++) {
            mahasiswa13 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
