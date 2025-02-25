package minggu3;

class dataDosen13 {
    public static void dataSemuaDosen(dosen13[] daftarDosen) {
        for (dosen13 dosen : daftarDosen) {
            dosen.tampilkanInfo();
        }
    }

    public static void jmlDosenPerJenisKelamin(dosen13[] daftarDosen) {
        int laki2 = 0, peremPuan = 0;
        for (dosen13 dosen : daftarDosen) {
            if (dosen.jenisKelamin) laki2++;
            else peremPuan++;
        }
        System.out.println("Jumlah Dosen Pria : " + laki2);
        System.out.println("Jumlah Dosen Wanita : " + peremPuan);
    }

    public static void rerataRataUsiaDosenPerJenisKelamin(dosen13[] daftarDosen) {
        int totalLaki2 = 0, totalPeremPuan = 0;
        int hitungLaki2 = 0, hitungPeremPuan = 0;
        for (dosen13 dosen : daftarDosen) {
            if (dosen.jenisKelamin) {
                totalLaki2 += dosen.usia;
                hitungLaki2++;
            } else {
                totalPeremPuan += dosen.usia;
                hitungPeremPuan++;
            }
        }
        System.out.println("Rata-rata usia dosen pria : " + (hitungLaki2 > 0 ? (totalLaki2 / hitungLaki2) : 0));
        System.out.println("Rata-rata usia dosen wanita : " + (hitungPeremPuan > 0 ? (totalPeremPuan / hitungPeremPuan) : 0));
    }

    public static void infoDosenPalingTua(dosen13[] daftarDosen) {
        dosen13 tertua = daftarDosen[0];
        for (dosen13 dosen : daftarDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen Paling Sepuh :");
        tertua.tampilkanInfo();
    }

    public static void infoDosenPalingMuda(dosen13[] daftarDosen) {
        dosen13 termuda = daftarDosen[0];
        for (dosen13 dosen : daftarDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Fresh :");
        termuda.tampilkanInfo();
    }
}