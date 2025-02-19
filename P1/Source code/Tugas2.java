import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rusuk;
        int angka;

        System.out.print("Masukkan rusuk Kubus: ");
        rusuk = sc.nextDouble();

        System.out.println("1. Volume kubus");
        System.out.println("2. Luas permukaan kubus");
        System.out.println("3. Keliling kubus");
        System.out.print("Apa yang ingin anda cari (Masukkan kode angka): ");
        angka = sc.nextInt();
        if (angka > 3 || angka < 1) {
            System.out.println("Invalid input");
        } else {
            switch (angka) {
                case 1:
                    System.out.println("Volume kubus bernilai: " + volume(rusuk));
                    break;

                case 2:
                    System.out.println("Volume kubus bernilai: " + luasPermukaan(rusuk));
                    break;
                case 3:
                    System.out.println("Volume kubus bernilai: " + keliling(rusuk));
                    break;
                default:
                    break;
            }
        }
    }

    static double volume(double rusuk) {
        double vol;

        vol = rusuk * rusuk * rusuk;
        return vol;
    }

    static double luasPermukaan(double rusuk) {
        double lp;

        lp = 6 * rusuk * rusuk;
        return lp;
    }

    static double keliling(double rusuk) {
        double kel;

        kel = 12 * rusuk;
        return kel;
    }
}
