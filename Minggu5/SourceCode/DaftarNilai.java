package Minggu5.SourceCode;

public class DaftarNilai {
    String nama;
    String nim;
    String tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public DaftarNilai(String nm, String nim, String thn, int uts, int uas){
        nama = nm;
        this.nim = nim;
        tahunMasuk = thn;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }

    static int NilaiUTSTertinggi(DaftarNilai[] data, int l, int r){
        int maxUTS = 0;
        if (l == r) {
            return data[l].nilaiUTS;
        }

        int mid = (l+r) / 2;
        int maxRight = NilaiUTSTertinggi(data, l, mid);
        int maxLeft = NilaiUTSTertinggi(data, mid+1, r);

        if (maxRight > maxLeft) {
            maxUTS = maxRight;
        } else {
            maxUTS = maxLeft;
        }

        return maxUTS;
    } 

    static int NilaiUTSTerendah(DaftarNilai[] data, int l, int r){
        int minUTS = 0;
        if (l == r) {
            return data[l].nilaiUTS;
        }

        int mid = (l+r) / 2;
        int minRight = NilaiUTSTerendah(data, l, mid);
        int minLeft = NilaiUTSTerendah(data, mid+1, r);

        if (minRight < minLeft) {
            minUTS = minRight;
        } else {
            minUTS = minLeft;
        }

        return minUTS;
    } 

    static double rerataUAS(DaftarNilai[] data){
        double rerata = 0;
        int total = 0;

        for(int i = 0; i < data.length; i++){
            total += data[i].nilaiUAS;
        }

        rerata += (total / data.length);
        return rerata;
    }
}
