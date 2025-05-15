package Minggu10.SourceCode;

import java.util.Scanner;

public class TugasLayananSiakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TugasAntrianLayanan antriKRS = new TugasAntrianLayanan();
        int pilihan;

        do{
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambahkan Mahasiswa ke Antrian");
            System.out.println("2. Layani 2 atau kurang Mahasiswa");
            System.out.println("3. Menampilkan Semua Antrian");
            System.out.println("4. Menampilkan 2 antrian Terdepan");
            System.out.println("5. Menampilkan Antrian Paling Akhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Mahasiswa yang Sudah Melakukan Proses KRS");
            System.out.println("8. Cetak jumlah Mahasiswa yang Belum Melakukan Proses KRS");
            System.out.println("9. Mengosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antriKRS.tambahAntrian(mhs);
                    break;
                case 2:
                    for(int i = 0; i < 2; i++){
                        Mahasiswa dilayani = antriKRS.layaniMahasiswa();
                        if (dilayani != null) {
                            System.out.println("Melayani mahasiswa: ");
                            dilayani.tampilkanData();
                        }
                }
                    break;
                case 3:
                    antriKRS.tampilkanSemua();
                    break;
                case 4:
                    antriKRS.DuaAntrianTerdepan();
                    break;                
                case 5:
                    antriKRS.lihatTerakhir();
                    break;
                case 6:
                    System.out.println("Jumlah Antrian: " + antriKRS.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah Mahasiswa yang telah proses KRS: " + antriKRS.getJumlahSudahKRS());
                    break;
                case 8:
                    System.out.println("Jumlah Mahasiswa yang telah proses KRS: " + antriKRS.getJumlahBelumKRS());
                    break;
                case 9 :
                    antriKRS.mengosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while(pilihan != 0);
    }
    
}
