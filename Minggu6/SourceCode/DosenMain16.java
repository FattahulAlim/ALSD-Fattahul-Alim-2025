package Minggu6.SourceCode;

import java.util.Scanner;

public class DosenMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input jumlah dosen: ");
        int jmlh = sc.nextInt();
        sc.nextLine();
        DataDosen16 data = new DataDosen16(jmlh);

        Boolean perulangan = true;

        while (perulangan) {
            System.out.println("---------------------------------");
            System.out.println("Opsi menu");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Urutkan data berdasarkan usia dosen secara ascending");
            System.out.println("4. Urutkan data berdasarkan usia dosen secara descending");
            System.out.println("5. Keluar program");
            System.out.print("Pilih opsi: ");
            int kondisi = sc.nextInt();
            sc.nextLine();
            switch (kondisi) {
                case 1:
                    for (int i = 0; i < jmlh; i++) {
                        System.out.println("Input data dosen ke-" + (i+1));
                        System.out.print("Input kode dosen: ");
                        String kode = sc.nextLine();
                        System.out.print("Input nama dosen: ");
                        String nama = sc.nextLine();
                        System.out.print("Input jenis kelamin dosen: ");
                        Boolean jenis = sc.nextBoolean();
                        System.out.print("Input usia dosen: ");
                        int usia = sc.nextInt();
                        Dosen16 dsn = new Dosen16(kode, nama, jenis, usia);
                        data.tambah(dsn);
                        sc.nextLine();
                    }
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.SortingASC();
                    System.out.println("-------------");
                    System.out.println("Data telah diurutkan secara ascending");
                    break;
                case 4:
                    data.SortingDSC();
                    System.out.println("-------------");
                    System.out.println("Data telah diurutkan secara descending");
                    break;
                case 5:
                    System.out.println("-------------");
                    System.out.println("Terima Kasih!");
                    perulangan = false;
                    break;
                default:
                    System.out.println("Opsi Invalid mohon input ulang");
                    break;
            }
        }

    }
}
