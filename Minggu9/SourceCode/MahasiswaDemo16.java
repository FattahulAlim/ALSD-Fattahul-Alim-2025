import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa16 stack = new StackTugasMahasiswa16(5);
        int pilih;

        do{
            System.out.println("\nMenu: ");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Melihat daftar tugas");
            System.out.println("5. Melihat tugas pertama yang dikumpulkan");
            System.out.println("6. Melihat Jumlah tugas terkumpul");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa16 mhs = new Mahasiswa16(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan", mhs.nama);
                    break;
                case 2:
                    Mahasiswa16 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa16 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkann oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNim\tKelas");
                    stack.print();
                    break;
                case 5: 
                    Mahasiswa16 lihatPertama = stack.peekTugasPertama();
                    if (lihatPertama != null) {
                        System.out.println(lihatPertama.nama + " Orang pertama yang mengumpulkan tugas");
                    }
                    break;
                case 6:
                    int jumlah = stack.jumlahTugas();
                    System.out.println("Jumlah tugas yang telah terkumpul: " + jumlah);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }while(pilih >= 1 && pilih <= 6);
    }
}
