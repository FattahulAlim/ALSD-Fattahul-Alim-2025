package Minggu6.SourceCode;
import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Input jumlah mahasiswa: ");
        int jmlh = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16(jmlh);

        for(int i = 0; i < jmlh; i++){
            System.out.println("-------------------------");
            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("Input nim: ");
            String nim = sc.nextLine();
            System.out.print("Input nama: ");
            String nama = sc.nextLine();
            System.out.print("Input kelas: ");
            String kelas = sc.nextLine();
            System.out.print("Input ipk: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa16 mhs = new Mahasiswa16(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }



        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC): ");
        list.insertionSort();
        list.tampil();
    }
}
