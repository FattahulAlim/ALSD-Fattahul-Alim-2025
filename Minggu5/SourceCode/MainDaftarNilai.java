package Minggu5.SourceCode;
import java.util.Scanner;

public class MainDaftarNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elemen, tertinggiUTS, terendahUTS, indexMax = 0, indexMin = 0;
        double rataUAS;

        System.out.print("Input jumlah Mahasiswa: ");
        elemen = sc.nextInt();
        sc.nextLine();

        DaftarNilai data = new DaftarNilai(elemen);
        System.out.println("Input data mahasiswa");

        for (int i = 0; i < elemen; i++){
            System.out.println("Data ke-" + (i+1));
            System.out.print("Nama Mahasiswa: ");
            data.nama[i] = sc.nextLine();

            System.out.print("NIM: ");
            data.nim[i] = sc.nextLine();

            System.out.print("Tahun Masuk: ");
            data.tahunMasuk[i] = sc.nextLine();

            System.out.print("Nilai UTS: ");
            data.nilaiUTS[i] = sc.nextInt();

            System.out.print("Nilai UAS: ");
            data.nilaiUAS[i] = sc.nextInt();
            sc.nextLine();
        }

        tertinggiUTS = data.NilaiUTSTertinggi(data.nilaiUTS, 0, elemen-1);
        terendahUTS = data.NilaiUTSTerendah(data.nilaiUTS, 0, elemen-1);
        rataUAS = data.rerataUAS(elemen);

        for(int i=0; i<elemen; i++){
            if (tertinggiUTS == data.nilaiUTS[i]) {
                indexMax = i;
            }
        }
        
        for(int i=0; i<elemen; i++){
            if (terendahUTS == data.nilaiUTS[i]) {
               indexMin = i;
            }
        }

        System.out.println("---------------------");
        System.out.println("Nilai UTS Terbaik");
        System.out.println("---------------------");
        System.out.println("Nama: " + data.nama[indexMax]);
        System.out.println("NIM: " + data.nim[indexMax]);
        System.out.println("Tahun Masuk: " + data.tahunMasuk[indexMax]);
        System.out.println("Nilai UTS: " + data.nilaiUTS[indexMax]);
        System.out.println("Nilai UAS: " + data.nilaiUAS[indexMax]);
        System.out.println("---------------------");
        
        System.out.println("---------------------");
        System.out.println("Nilai UTS Terendah");
        System.out.println("---------------------");
        System.out.println("Nama: " + data.nama[indexMin]);
        System.out.println("NIM: " + data.nim[indexMin]);
        System.out.println("Tahun Masuk: " + data.tahunMasuk[indexMin]);
        System.out.println("Nilai UTS: " + data.nilaiUTS[indexMin]);
        System.out.println("Nilai UAS: " + data.nilaiUAS[indexMin]);
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("Rata rata UAS: " + rataUAS);
        System.out.println("---------------------");
    }
}
