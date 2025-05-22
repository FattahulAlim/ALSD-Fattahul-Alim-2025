package Pertemuan12.SourceCode;

import java.util.Scanner;

public class SLLMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // SingleLinkedList16 sll = new SingleLinkedList16();
        
        // int pilih;
        // String nim, nama, kelas;
        // double ipk;

        // do{
        //     System.out.println("Silahkan Pilih Menu");
        //     System.out.println("1. Tambah Data Diawal");
        //     System.out.println("2. Tambah data setelah data x");
        //     System.out.println("3. Tambah data di indeks ke-x");
        //     System.out.println("4. Tambah data di posisi akhir");
        //     System.out.println("5. Print linked list");
        //     System.out.print("Input menu: ");
        //     pilih = sc.nextInt();
        //     sc.nextLine();

        //     switch (pilih) {
        //         case 1:
        //             System.out.println("-------------");
        //             System.out.print("NIM: ");
        //             nim = sc.nextLine();
        //             System.out.print("Nama: ");
        //             nama = sc.nextLine();
        //             System.out.print("Kelas: ");
        //             kelas = sc.nextLine();
        //             System.out.print("IPK: ");
        //             ipk = sc.nextDouble();

        //             Mahasiswa16 mhs1 = new Mahasiswa16(nim, nama, kelas, ipk);
        //             sll.addFirst(mhs1);
        //             break;
        //         case 2:
        //             System.out.println("-------------");
        //             System.out.print("NIM: ");
        //             nim = sc.nextLine();
        //             System.out.print("Nama: ");
        //             nama = sc.nextLine();
        //             System.out.print("Kelas: ");
        //             kelas = sc.nextLine();
        //             System.out.print("IPK: ");
        //             ipk = sc.nextDouble();
        //             System.out.println("-------");
        //             System.out.println("Data ingin diinput setelah ?");
        //             System.out.print("Input nama mahasiswa: ");
        //             String key = sc.nextLine();
        //             System.out.println("-------");

        //             Mahasiswa16 mhs2 = new Mahasiswa16(nim, nama, kelas, ipk);
        //             sll.insertAfter(key, mhs2);
        //             break;
        //         case 3:
        //             System.out.println("-------------");
        //             System.out.print("NIM: ");
        //             nim = sc.nextLine();
        //             System.out.print("Nama: ");
        //             nama = sc.nextLine();
        //             System.out.print("Kelas: ");
        //             kelas = sc.nextLine();
        //             System.out.print("IPK: ");
        //             ipk = sc.nextDouble();
        //             System.out.println("-------");
        //             System.out.println("Data ingin diinput indeks berapa ?");
        //             System.out.print("Input indeks: ");
        //             String indeks = sc.nextLine();
        //             System.out.println("-------");

        //             Mahasiswa16 mhs3 = new Mahasiswa16(nim, nama, kelas, ipk);
        //             sll.insertAfter(indeks, mhs3);
        //             break;
        //         case 4:
        //             System.out.println("-------------");
        //             System.out.print("NIM: ");
        //             nim = sc.nextLine();
        //             System.out.print("Nama: ");
        //             nama = sc.nextLine();
        //             System.out.print("Kelas: ");
        //             kelas = sc.nextLine();
        //             System.out.print("IPK: ");
        //             ipk = sc.nextDouble();

        //             Mahasiswa16 mhs4 = new Mahasiswa16(nim, nama, kelas, ipk);
        //             sll.addLast(mhs4);
        //             break;
        //         case 5:
        //             sll.print();
        //             break;
        //         case 6: 
        //             System.out.println("Terima Kasih.");
        //             break;
        //         default:
        //             System.out.println("Input invalid");
        //             break;
        //     }
        // } while (pilih != 6); 

        Mahasiswa16 mhs1 = new Mahasiswa16("24212200","Alvaro" , "1A", 4.0);
        Mahasiswa16 mhs2 = new Mahasiswa16("23212201", "Bimon", "2B", 3.8);
        Mahasiswa16 mhs3 = new Mahasiswa16("22212202", "Cintia", "3C", 3.5);
        Mahasiswa16 mhs4 = new Mahasiswa16("21212203", "Dirga", "4D", 3.6);

        SingleLinkedList16 sll = new SingleLinkedList16();
       
        System.out.println("------------");
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
        System.out.println("------------");
        
        System.out.println("------------");
        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        System.out.println("------------");

    }
}