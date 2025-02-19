import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] matkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar",
    "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};

        double[] nilai = new double[8];
        double[] NilaidanBobot = new double[8];
        double[] bobot = new double[8];
        String[] huruf = new String[8];
        double hasilNilai = 0;

        System.out.println("=====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=====================");
        for (int i=0; i<matkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkul[i] + ": ");
            nilai[i] = sc.nextInt();
        } 
        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.printf("%-40s%-20s%-20s%-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i=0; i < matkul.length; i++) {

            if (nilai[i] <= 100 && nilai[i] > 80) {
                huruf[i] = "A";
                bobot[i] = 4;
            } else if (nilai[i] <= 80 && nilai[i] > 73 ) {
                huruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilai[i] <= 73 && nilai[i] > 65) {
               huruf[i] = "B";            
               bobot[i] = 3;
            } else if (nilai[i] <= 65 && nilai[i] > 60) { 
                huruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilai[i] <= 60 && nilai[i] > 50) {
                huruf[i] = "C";
                bobot[i] = 2;
            } else if (nilai[i] <= 50 && nilai[i] < 39) {
                huruf[i] = "D";
                bobot[i] = 1;
            } else {
                huruf[i] = "E";
                bobot[i] = 0;
            } 
            if (i == 3 || i == 6) {
                NilaidanBobot[i] = bobot[i] * 3;
            } else {
                NilaidanBobot[i] = bobot[i] * 2;
            }

            System.out.printf("%-40s%-20.1f%-20s%-20.1f\n", matkul[i], nilai[i], huruf[i], bobot[i]);
        }
        System.out.println("======================");

        for (int i=0; i<matkul.length;i++) {
         hasilNilai += NilaidanBobot[i];
        }
        hasilNilai /= 18;
        
        System.out.println("IP :  " + hasilNilai);
    }
}
