import java.util.Scanner;

public class DosenDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen16 dsn1 = new Dosen16("1111", "Fulan", false, 32);
        Dosen16 dsn2 = new Dosen16("2222", "Aisyah", true, 29);
        Dosen16 dsn3 = new Dosen16("3333", "Budi", false, 45);
        Dosen16 dsn4 = new Dosen16("4444", "Citra", true, 38);
        Dosen16 dsn5 = new Dosen16("5555", "Darmawan", false, 50);
        Dosen16 dsn6 = new Dosen16("6666", "Putri", true, 34);
        Dosen16 dsn7 = new Dosen16("7777", "Fikri", false, 41);
        Dosen16 dsn8 = new Dosen16("8888", "Gita", true, 34);
        Dosen16 dsn9 = new Dosen16("9999", "Hendri", false, 45);
        Dosen16 dsn10 = new Dosen16("1010", "Intan", true, 29);

        DataDosen16 list = new DataDosen16();

        list.tambah(dsn1);
        list.tambah(dsn2);
        list.tambah(dsn3);
        list.tambah(dsn4);
        list.tambah(dsn5);
        list.tambah(dsn6);
        list.tambah(dsn7);
        list.tambah(dsn8);
        list.tambah(dsn9);
        list.tambah(dsn10);

        list.tampil();

        System.out.println("----------------------------------------");
        list.SortingASC();
        System.out.println("Data telah otomatis diurutkan secara ASC");
        System.out.println("----------------------------------------");

        System.out.println("-----------------------------------------------------------");
        System.out.println("Pencarian Data Nama Dosen");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Masukkan nama dosen yang ingin dicari");
        System.out.print("Nama : ");
        String namaDsn = sc.nextLine();
        int pss = list.PencarianDataSequential16(namaDsn);
        list.tampilDataSequentialSearch(namaDsn, pss);

        System.out.println("-----------------------------------------------------------");
        System.out.println("Pencarian Data Berdasarkan Usia Dosen");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Masukkan usia dosen yang ingin dicari");
        System.out.print("Usia : ");
        int usiaDsn = sc.nextInt();
        int pss1 = list.findBinarySearch(usiaDsn, 0, 9);
        list.tampilDataSequentialSearch(namaDsn, pss1);

    }
}
