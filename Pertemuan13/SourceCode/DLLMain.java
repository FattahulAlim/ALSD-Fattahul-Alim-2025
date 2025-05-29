package Pertemuan13.SourceCode;

import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList01 list = new DoubleLinkedList01();
        Scanner sc = new Scanner(System.in);
        int pilihan;
        String nim, nama, kelas;
        double ipk;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah Di Awal");
            System.out.println("2. Tambah di Akhir");
            System.out.println("3. Hapus di Awal");
            System.out.println("4. Hapus di Akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("7. Tambah Setelah NIM mahasiswa tertentu");
            System.out.println("8. Menambah node pada index tertentu");
            System.out.println("9. Menghapus node setelah NIM mahasisa tertentu");
            System.out.println("10. Menghapus node pada index tertentu");
            System.out.println("11. Mendapatkan informasi data pada urutan pertama");
            System.out.println("12. Mendapatkan informasi data pada urutan terakhir");
            System.out.println("13. Mendapatkan informasi data pada urutan tertentu");
            System.out.println("14. Mendaptkan jumlah antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
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

                    Mahasiswa01 mhs = new Mahasiswa01(nim, nama, kelas, ipk);
                    list.addFirst(mhs);
                    System.out.println("-------------");
                    break;
                case 2: 
                    System.out.println("-------------");
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();

                    Mahasiswa01 mhs1 = new Mahasiswa01(nim, nama, kelas, ipk);
                    list.addLast(mhs1);
                    System.out.println("-------------");
                    break;
                case 3:
                    System.out.println("-------------");
                    list.deleteFirst();
                    System.out.println("-------------");
                    break;
                case 4:
                    System.out.println("-------------");
                    list.deleteLast();
                    System.out.println("-------------");
                    break;
                case 5:
                    System.out.println("-------------");
                    list.print();
                    System.out.println("-------------");
                    break;
                case 6:
                    System.out.println("-------------");
                    System.out.print("Input NIM mahasiswa yang ingin dicari: ");
                    String key = sc.nextLine();
                    Mahasiswa01 hasil = list.search(key);

                    if (hasil == null) {
                        System.out.println("Node dengan NIM: " + key + " Tidak ditemukan.");
                    } else {
                        hasil.tampil();
                    }
                    System.out.println("-------------");
                    break;
                case 7:
                    System.out.println("-------------");
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa01 mhs2 = new Mahasiswa01(nim, nama, kelas, ipk);
                    System.out.print("Setelah NIM berapa data mahasiswa ingin diinputkan: ");
                    String afterNIM = sc.nextLine();
                    list.insertAfter(afterNIM, mhs2);
                    System.out.println("-------------");
                    break;
                case 8:
                    System.out.println("-------------");
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa01 mhs3 = new Mahasiswa01(nim, nama, kelas, ipk);
                    System.out.print("Pada index berapa data mahasiswa ingin diinputkan: ");
                    int idxKey = sc.nextInt();
                    list.add(idxKey, mhs3);
                    System.out.println("-------------");
                    break;
                case 9:
                    System.out.println("-------------");
                    System.out.println("Silahkan Input NIM mahasiswa, nantinya data setelah nim tersebut akan dihapus");
                    System.out.print("NIM: ");
                    String keyNIM = sc.nextLine();
                    list.removeAfter(keyNIM);
                    System.out.println("-------------");
                    break;
                case 10: 
                    System.out.println("-------------");
                    System.out.print("Input di index berapa data ingin dihapus: ");
                    int idxRemove = sc.nextInt();
                    list.removeAt(idxRemove);
                    System.out.println("-------------");
                    break;
                case 11: 
                    System.out.println("-------------");
                    System.out.println("Informasi data pada urutan pertama");
                    Mahasiswa01 HeadInfo = list.getFirst();
                    HeadInfo.tampil();
                    System.out.println("-------------");
                    break;
                case 12:
                    System.out.println("-------------");
                    System.out.println("Informasi data pada urutan terakhir");
                    Mahasiswa01 TailInfo = list.getLast();
                    TailInfo.tampil();
                    System.out.println("-------------");
                    break;
                case 13:
                    System.out.println("-------------");
                    System.out.print("Index data yang ingin diketahui: ");
                    int urutan = sc.nextInt();
                    System.out.println("Informasi data pada urutan index ke-" + urutan);
                    Mahasiswa01 AtInfo = list.getIndex(urutan);
                    AtInfo.tampil();
                    System.out.println("-------------");
                    break;
                case 14:
                    System.out.println("Jumlah Data: " + list.getSize());
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Input tidak valid");
                    break;
            }
        } while (pilihan != 0); 
    }
}
