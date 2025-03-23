package Minggu5.SourceCode;

public class MainDaftarNilai {
    public static void main(String[] args) {
        int tertinggiUTS, terendahUTS, indexMax = 0, indexMin = 0;
        double rataUAS;

        DaftarNilai[] data = new DaftarNilai[8];
        data[0] = new DaftarNilai("Ahmad", "220101001", "2022", 78, 82);
        data[1] = new DaftarNilai("Budi", "220101002", "2022", 85, 88);
        data[2] = new DaftarNilai("Cindy", "220101003", "2021", 90, 87);
        data[3] = new DaftarNilai("Dian", "220101004", "2021", 76, 79);
        data[4] = new DaftarNilai("Eko", "220101005", "2023", 92, 95);
        data[5] = new DaftarNilai("Fajar", "220101006", "2020", 88, 85);
        data[6] = new DaftarNilai("Gina", "220101007", "2023", 80, 83);
        data[7] = new DaftarNilai("Hadi", "220101008", "2020", 82, 84);

        tertinggiUTS = DaftarNilai.NilaiUTSTertinggi(data, 0, data.length - 1);
        terendahUTS = DaftarNilai.NilaiUTSTerendah(data, 0, data.length - 1);
        rataUAS = DaftarNilai.rerataUAS(data);

        for(int i=0; i<data.length; i++){
            if (tertinggiUTS == data[i].nilaiUTS) {
                indexMax = i;
            }
        }
        
        for(int i=0; i<data.length; i++){
            if (terendahUTS == data[i].nilaiUTS) {
               indexMin = i;
            }
        }

        System.out.println("---------------------");
        System.out.println("Nilai UTS Terbaik");
        System.out.println("---------------------");
        System.out.println("Nama: " + data[indexMax].nama);
        System.out.println("NIM: " + data[indexMax].nim);
        System.out.println("Tahun Masuk: " + data[indexMax].tahunMasuk);
        System.out.println("Nilai UTS: " + data[indexMax].nilaiUTS);
        System.out.println("Nilai UAS: " + data[indexMax].nilaiUAS);
        System.out.println("---------------------");
        
        System.out.println("---------------------");
        System.out.println("Nilai UTS Terendah");
        System.out.println("---------------------");
        System.out.println("Nama: " + data[indexMin].nama);
        System.out.println("NIM: " + data[indexMin].nim);
        System.out.println("Tahun Masuk: " + data[indexMin].tahunMasuk);
        System.out.println("Nilai UTS: " + data[indexMin].nilaiUTS);
        System.out.println("Nilai UAS: " + data[indexMin].nilaiUAS);
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("Rata rata UAS: " + rataUAS);
        System.out.println("---------------------");
    }
}
