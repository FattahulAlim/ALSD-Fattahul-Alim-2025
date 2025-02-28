package P3.SourceCode;

import java.util.Scanner;

public class DosenDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen16 arrayOfDosen[] = new Dosen16[3];
        String kode, nama;
        boolean jenisKelamin = false;
        int usia;

        for(int i = 0; i < 3; i++) {
            System.out.println("Input Data Dosen ke- " + (i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc.nextBoolean();
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen16(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------------");
        }
        
        int i = 1;
        for (Dosen16 dsn : arrayOfDosen) {
            System.out.println("Data dosen ke-" + i);
            if (jenisKelamin) {
                System.out.println("Kode            : " + dsn.kode);
                System.out.println("Nama            : " + dsn.nama);
                System.out.println("Jenis Kelamin   : Wanita");
                System.out.println("Usia            : " + dsn.usia);
            } else {
                System.out.println("Kode            : " + dsn.kode);
                System.out.println("Nama            : " + dsn.nama);
                System.out.println("Jenis Kelamin   : Pria");
                System.out.println("Usia            : " + dsn.usia);
                
            }
            i++;
            System.out.println("--------------------------------------");
            
        }

        System.out.println("=============================");
        System.out.println("Pemanggilan class DataDosen16");
        System.out.println("=============================");
        DataDosen16.dataSemuaDosen(arrayOfDosen);
        DataDosen16.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen16.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen16.infoDosenPalingTua(arrayOfDosen);
        DataDosen16.infoDosenPalingMuda(arrayOfDosen);
    }
}
