package Minggu5.SourceCode;

public class DaftarNilai {
    String nama[];
    String nim[];
    String tahunMasuk[];
    int nilaiUTS[];
    int nilaiUAS[];

    public DaftarNilai(int el){
        nama = new String[el];
        nim = new String[el];
        tahunMasuk = new String[el];
        nilaiUTS = new int[el];
        nilaiUAS = new int[el];
    }

    int NilaiUTSTertinggi(int arr[], int l, int r){
        int maxUTS = 0;
        if (l == r) {
            return arr[l];
        }

        int mid = (l+r) / 2;
        int maxRight = NilaiUTSTertinggi(arr, l, mid);
        int maxLeft = NilaiUTSTertinggi(arr, mid+1, r);

        if (maxRight > maxLeft) {
            maxUTS = maxRight;
        } else {
            maxUTS = maxLeft;
        }

        return maxUTS;
    } 

    int NilaiUTSTerendah(int arr[], int l, int r){
        int minUTS = 0;
        if (l == r) {
            return arr[l];
        }

        int mid = (l+r) / 2;
        int minRight = NilaiUTSTerendah(arr, l, mid);
        int minLeft = NilaiUTSTerendah(arr, mid+1, r);

        if (minRight < minLeft) {
            minUTS = minRight;
        } else {
            minUTS = minLeft;
        }

        return minUTS;
    } 

    double rerataUAS(double el){
        double rerata = 0;
        int total = 0;

        for(int i = 0; i < el; i++){
            total += nilaiUAS[i];
        }

        rerata += (total / el);
        return rerata;
    }
}
