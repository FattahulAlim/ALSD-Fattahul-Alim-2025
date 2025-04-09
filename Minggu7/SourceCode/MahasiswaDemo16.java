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
        System.out.println("===========================");
        System.out.println("Data Mahasiswa");
        list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        // list.bubbleSort();
        // list.tampil();
     
        // list.SelectionSort();
        // System.out.println("Data secara otomatis diurutkan menggunakan SELECTION SORT (ASC): ");

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC): ");
        // list.insertionSort();
        // list.tampil();


        System.out.println("-----------------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("-----------------------------------");
        System.out.println("Menggunakan sequential searching");
        System.out.println("-----------------------------------");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("-----------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("-----------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jmlh-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }

}
