package Pertemuan12.SourceCode;

import java.util.Scanner;

public class LInkedListQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListQueue16 sllq = new LinkedListQueue16();
        
        int pilih;
        String nim, nama, kelas;
        double ipk;

        do{
            System.out.println("Silahkan Pilih Menu");
            System.out.println("1. Tambah antrian");
            System.out.println("2. Memanggil antrian");
            System.out.println("3. Tampilkan antrian terdepan");
            System.out.println("4. Tampilkan antrian terakhir");
            System.out.println("5. Tampilkan jumlah antrian");
            System.out.println("6. Mengosongkan antrian");
            System.out.println("7. Keluar program");
            System.out.print("Input menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("-------------");
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();

                    Mahasiswa16 mhs1 = new Mahasiswa16(nim, nama, kelas, ipk);
                    sllq.tambahLast(mhs1);
                    System.out.println("-------------");

                    break;
                case 2:
                    System.out.println("-------------");
                    Mahasiswa16 hasil = sllq.removeFirst();
                    System.out.println("Mahasiswa berikut telah diproses: ");
                    hasil.tampilInformasi();
                    System.out.println("-------------");

                    break;
                case 3:
                    System.out.println("-------------");
                    sllq.antrianDepan();
                    System.out.println("-------------");

                    break;
                case 4:
                    System.out.println("-------------");
                    sllq.antrianTerakhir();
                    System.out.println("-------------");

                    break;
                case 5:
                    System.out.println("-------------");
                    System.out.println("Jumlah Mahasiswa Dalam Antrian: " + sllq.getJumlahAntrian());
                    System.out.println("-------------");

                    break;
                case 6:
                    System.out.println("-------------");
                    sllq.mengosongkanAntrian();
                    System.out.println("-------------");

                    break;
                case 7:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
        }while(pilih != 7);
    }
}
