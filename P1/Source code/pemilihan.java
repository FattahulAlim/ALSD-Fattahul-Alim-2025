import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tugas, kuis, uts, uas, total=0;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan nilai tugas: ");
        tugas = sc.nextDouble();

        System.out.print("Masukkan nilai kuis: ");
        kuis = sc.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        uts = sc.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        uas = sc.nextDouble();
        System.out.println("=======================");
        System.out.println("=======================");

        if (tugas > 100 || tugas < 0) {
            System.out.println("nilai tidak valid");
            System.out.println("=======================");
            System.out.println("=======================");
        } else if (kuis > 100 || kuis < 0) {
            System.out.println("nilai tidak valid");
            System.out.println("=======================");
            System.out.println("=======================");
        } else if (uts > 100 || uts < 0) {
            System.out.println("nilai tidak valid");
            System.out.println("=======================");
            System.out.println("=======================");
        } else if (uas > 100 || uas < 0) {
            System.out.println("nilai tidak valid");
            System.out.println("=======================");
            System.out.println("=======================");
        } else{
            tugas = tugas * 0.2;
            kuis = kuis * 0.2;
            uts = uts * 0.3;
            uas = uas * 0.3;
            total += tugas + kuis + uts + uas;

            System.out.println("Nilai akhir : " + total);
            if (total <= 100 && total > 80) {
                System.out.println("Nilai Huruf : A");
            } else if (total <= 80 && total > 73 ) {
                System.out.println("Nilai Huruf : B+");
            } else if (total <= 73 && total > 65) {
                System.out.println("Nilai Huruf : B");                
            } else if (total <= 65 && total > 60) { 
                System.out.println("Nilai Huruf : C+");
            } else if (total <= 60 && total > 50) {
                System.out.println("Nilai Huruf : C");
            } else if (total <= 50 && total < 39) {
                System.out.println("Nilai Huruf : D");
            } else {
                System.out.println("Nilai Huruf : E");
            } 

            System.out.println("=======================");
            System.out.println("=======================");
    
            if (total <= 100 && total > 50) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("MOHON MAAF ANDA TIDAK LULUS");
            }
        } 
    }
}