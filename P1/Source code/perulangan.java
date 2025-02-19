import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String angka, hasil;
        char  digit1, digit2;
        int n;

        System.out.print("Masukkan Nim: ");
        angka = sc.nextLine();

        digit1 = angka.charAt(angka.length() - 2);
        digit2 = angka.charAt(angka.length() - 1);

        hasil = "" + digit1 + digit2;

        n = Integer.parseInt(hasil);
        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i != 6 && i != 10) {
                System.out.print(i + " ");
            } else if (i % 2 != 0) {
                System.out.print(" * " );
            } else if (i == 6 || i == 10) {
                System.out.print(" * ");
            }
        }
        
    }
}
