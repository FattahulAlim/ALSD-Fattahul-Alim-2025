package Minggu6.SourceCode;

public class DataDosen16 {
    Dosen16 dataDosen[];
    int idx = 0;

    public DataDosen16(int elemen) {
        dataDosen = new Dosen16[elemen];
    }

    void tambah(Dosen16 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh, tidak dapat ditambahkan lagi");
        }
        
    }

    void tampil() {
        for (Dosen16 dsn : dataDosen) {
            dsn.tampil();
        }
    }

    void SortingASC() {
        Dosen16 temp;
        for (int i = 0; i < dataDosen.length; i++) {
            for (int j = 1; j <= dataDosen.length - 1; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }

    }

    void SortingDSC() {
        for(int i = 1; i < dataDosen.length; i++){
            Dosen16 temp = dataDosen[i];
            int j = i-1;
            while (j >= 0 && dataDosen[j].usia < temp.usia ) {
                dataDosen[j+1] = dataDosen[j];
                j--;
            }
            dataDosen[j+1] = temp;
        }
    }
}