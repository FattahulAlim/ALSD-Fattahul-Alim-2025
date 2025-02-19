import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int index = -1;
        String hasil = " ";
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] kota = {{'B', 'A', 'N', 'T', 'E', 'N'}, 
        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
        {'B', 'O', 'G', 'O', 'R'},
        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
        {'M', 'A', 'L', 'A', 'N', 'G'},
        {'T', 'E', 'G', 'A', 'L'}
    };

        System.out.println("Plat nomor mana yang ingin anda cari dari beberapa plat nomor dibawah?");
        System.out.println("A, B, D, E, F, G, H, L, N, T");
        System.out.print("Silahkan input plat nomor yang ingin anda cari: ");
        String plat = sc.nextLine().toUpperCase();

        for(int i = 0; i < kode.length; i++) {
            if (kode[i] == plat.charAt(0)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Plat tidak ditemukan");
        } else {
            for(int i = 0; i<kota[index].length; i++) {
                hasil += kota[index][i];
            }
            System.out.println("Plat " + plat + " merupakan kode untuk kota " + hasil);
        }
    }    
}
