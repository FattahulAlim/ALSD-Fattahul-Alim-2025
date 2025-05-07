import java.util.Scanner;
public class SuratMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat data = new StackSurat(5);
        int pilih;

        do{
            System.out.println("Menu");
            System.out.println("1. Input surat");
            System.out.println("2. Verifikasi surat");
            System.out.println("3. Lihat surat izin terbaru");
            System.out.println("4. Cari surat");
            System.out.println("5. Keluar program");
            System.out.print("Input menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Id surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nm = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kls = sc.nextLine();
                    System.out.print("Jenis izin: ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi izin (jam): ");
                    int durasi = sc.nextInt();
                    Surat16 surat = new Surat16(id, nm, kls, jenis, durasi);
                    data.tambahSurat(surat);
                    break;
                case 2:
                    Surat16 verif = data.prosesSurat();
                    if (verif != null) {
                        System.out.println("Informasi surat yang baru saja diverifikasi");
                        System.out.println("ID Surat: " + verif.idSurat);
                        System.out.println("Nama : " + verif.namaMahasiswa);
                        System.out.println("Kelas : " + verif.kelas);
                        System.out.println("Jenis izin: " + verif.jenisIzin);
                        System.out.println("Durasi: " + verif.durasi);
                    }
                    break;
                case 3:
                    Surat16 lihat = data.lihatSuratTeratas();
                    if (lihat != null) {
                        System.out.println("Informasi surat terakhir yang dikirim");
                        System.out.println("ID Surat: " + lihat.idSurat);
                        System.out.println("Nama : " + lihat.namaMahasiswa);
                        System.out.println("Kelas : " + lihat.kelas);
                        System.out.println("Jenis izin: " + lihat.jenisIzin);
                        System.out.println("Durasi: " + lihat.durasi);
                    }
                    break;
                case 4:
                    System.out.print("Input nama yang ingin dicari: ");
                    String cari = sc.nextLine();
                    int hasil = data.cariSurat(cari);
                    System.out.println("Terdapat "+ hasil + " hasil pencarian yang cocok");
                    break;
                case 5:
                    System.out.println("Terima Kasih");
                    break;
                default:
                System.out.println("Input invalid, silahkan input ulang");
                    break;
            }
            
        } while (pilih >= 1 && pilih < 5);

    }
}
