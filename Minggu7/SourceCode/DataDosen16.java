public class DataDosen16 {
    Dosen16 dataDosen[] = new Dosen16[10];
    int idx = 0;

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

    int PencarianDataSequential16(String cari){
        int posisi = -1;
        int counter = 0;
        for(int i = 0; i < dataDosen.length; i++){
            if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
                if (counter == 0) {
                    posisi = i;
                } else if (counter != 0) {
                    System.out.println("Peringatan ada lebih dari 1 dosen dengan nama sama");
                }
                counter++;
            }
        }

        return posisi;
    }

    int findBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (cari == dataDosen[mid].usia) {
                if (cari == dataDosen[mid - 1].usia) {
                    System.out.println("Peringatan ada lebih dari satu dosen dengan usia sama");
                } else if (cari == dataDosen[mid + 1].usia) {
                    System.out.println("Peringatan ada lebih dari satu dosen dengan usia sama");
                }
                return mid;           
            } else if (dataDosen[mid].usia > cari) {
                return findBinarySearch(cari, left, mid-1);
            } else{
                return findBinarySearch(cari, mid+1, right);
            }
        } else {
            return -1;
        }
    }

    void tampilDataSequentialSearch(String x, int pos){
        if (pos != -1) {
            System.out.println("Kode          : " + dataDosen[pos].kode);
            System.out.println("Nama          : " + dataDosen[pos].nama);
            System.out.println("Jenis Kelamin : " + (dataDosen[pos].jenisKelamin ? "Wanita" : "pria"));
            System.out.println("Usia          : " + dataDosen[pos].usia);
        } else {
            System.out.println("Data Dosen dengan Nama: " + x + " tidak ditemukan");
        } 
    }

    void tampilDataBinarySearch(int x, int pos){
        if (pos != -1) {
            System.out.println("Kode          : " + dataDosen[pos].kode);
            System.out.println("Nama          : " + dataDosen[pos].nama);
            System.out.println("Jenis Kelamin : " + (dataDosen[pos].jenisKelamin ? "Wanita" : "pria"));
            System.out.println("Usia          : " + dataDosen[pos].usia);
        } else {
            System.out.println("Data Dosen dengan Usia: " + x + " tidak ditemukan");
        } 
    }

    
}
