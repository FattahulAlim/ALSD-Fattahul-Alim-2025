import java.util.Scanner;

public class TugasNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================");
        System.out.println("Program Jadwal Kuliah");
        System.out.println("=====================");

        System.out.print("Silahkan Masukkan Jumlah Matkul Anda: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] matkul = new String[jumlah];
        int[] sks = new int[jumlah];
        int[] semester = new int[jumlah];
        String[] hari = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Input Nama Matkul: ");
            matkul[i] = sc.nextLine();
            System.out.print("Input Jumlah SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Input Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Input Hari: ");
            hari[i] = sc.nextLine();
            if (!hari[i].equalsIgnoreCase("senin") && !hari[i].equalsIgnoreCase("selasa") &&
                    !hari[i].equalsIgnoreCase("rabu") && !hari[i].equalsIgnoreCase("kamis")
                    && !hari[i].equalsIgnoreCase("jumat")) {
                System.out.println("Input tidak valid masukkan hari senin - jumat. Silahkan input ulang");
                break;
            }
        }
        System.out.println("=====================");
        boolean kondisi = true;
        while (kondisi) {
            System.out.println("Apa yang ingin anda lakukan?");
            System.out.println("1. Menampilkan jadwal kuliah keseluruhan");
            System.out.println("2. Menampilkan jadwal kuliah di hari tertentu");
            System.out.println("3. Menampilkan jadwal kuliah di semester tertentu");
            System.out.println("4. Mencari informasi mata kuliah tertentu");
            System.out.println("5. Keluar program");
            System.out.print("Silahkan pilih berdasarkan kode angka: ");
            int kode = sc.nextInt();

            switch (kode) {
                case 1:
                    TampilanJadwal(matkul, sks, semester, hari, jumlah);
                    break;
                case 2:
                    TampilHari(matkul, sks, semester, hari, jumlah);
                    break;
                case 3:
                    TampilSemester(matkul, sks, semester, hari, jumlah);
                    break;
                case 4:
                    TampilInfoMK(matkul, sks, semester, hari, jumlah);
                    break;
                case 5:
                    System.out.println("Terimakasih");
                    kondisi = false;
                    break;
                default:
                    System.out.println("Input Invalid");
                    break;
            }
        }
    }

    static void TampilanJadwal(String[] matkul, int[] sks, int[] semester, String[] hari, int jumlah) {
        System.out.println("=====================");

        System.out.printf("%-40s%-20s%-20s%-20s\n", "MK", "SKS", "Semester", "Hari");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-40s%-20d%-20d%-20s\n", matkul[i], sks[i], semester[i], hari[i]);
        }
        System.out.println("=====================");
    }

    static void TampilHari(String[] matkul, int[] sks, int[] semester, String[] hari, int jumlah) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================");

        System.out.print("Input hari yang ingin diperiksa: ");
        String cekHari = sc.nextLine();

        System.out.printf("%-40s%-20s%-20s%-20s\n", "MK", "SKS", "Semester", "Hari");

        for (int i = 0; i < jumlah; i++) {
            if (cekHari.equalsIgnoreCase(hari[i])) {
                System.out.printf("%-40s%-20d%-20d%-20s\n", matkul[i], sks[i], semester[i], hari[i]);
            }
        }
        System.out.println("=====================");
    }

    static void TampilSemester(String[] matkul, int[] sks, int[] semester, String[] hari, int jumlah) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================");

        System.out.print("Input semester:");
        int cekSem = sc.nextInt();

        System.out.printf("%-40s%-20s%-20s%-20s\n", "MK", "SKS", "Semester", "Hari");
        for (int i = 0; i < jumlah; i++) {
            if (cekSem == semester[i]) {
                System.out.printf("%-40s%-20d%-20d%-20s\n", matkul[i], sks[i], semester[i], hari[i]);

            }
        }
        System.out.println("=====================");
    }

    static void TampilInfoMK(String[] matkul, int[] sks, int[] semester, String[] hari, int jumlah) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================");

        System.out.print("Input nama matkul: ");
        String cekMK = sc.nextLine();

        System.out.printf("%-40s%-20s%-20s%-20s\n", "MK", "SKS", "Semester", "Hari");
        for (int i = 0; i < jumlah; i++) {
            if (cekMK.equalsIgnoreCase(matkul[i])) {
                System.out.printf("%-40s%-20d%-20d%-20s\n", matkul[i], sks[i], semester[i], hari[i]);
                break;
            }
        }
        System.out.println("=====================");

    }
}
