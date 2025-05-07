public class DataAbsensi {
    Absensi[] DataAbsen = new Absensi[7];
    int idx = 0;

    void tambahData(Absensi absn){
        if (idx < DataAbsen.length) {
            DataAbsen[idx] = absn;
            idx++;
        } else {
            System.out.println("Data penuh");
        }
    }

    void cariAlpha(){
        int max = 0;
        for(int i = 0; i < DataAbsen.length; i++){
            if (DataAbsen[i].alpa > max) {
                max = DataAbsen[i].alpa;
            }
        }

        System.out.println("Data Mahasiswa dengan alpha terbanyak: ");
        for(int j = 0; j < DataAbsen.length; j++){
            if (max == DataAbsen[j].alpa) {
                System.out.println("Nama: " + DataAbsen[j].mahasiswa.namaMahasiswa);
                System.out.println("NIM: " + DataAbsen[j].mahasiswa.nim);
                System.out.println("Matkul: " + DataAbsen[j].mataKuliah.namaMK);
                System.out.println("Jumlah Alpha: " + DataAbsen[j].alpa);
                System.out.println();
            }
        }
    }
}
