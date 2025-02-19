import java.util.Scanner;

public class fungsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cabang = { "RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4" };
        String[] bunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        int[][] stok = { { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 } };
        int[] harga = { 75000, 50000, 60000, 10000 };

        pendapatan(cabang, bunga, stok, harga);
        jumlahStok(cabang, bunga, stok);

    }

    static void pendapatan(String[] cabang, String[] bunga, int[][] stok, int[] harga) {
        System.out.println("====================");
        System.out.println("Penampil Pendapatan");
        System.out.println("====================");

        for (int i = 0; i < bunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < bunga.length; j++) {
                pendapatan += stok[i][j] * harga[j];
            }
            System.out.println("Pendapatan pada cabang " + cabang[i] + " sebanyak " + pendapatan);
        }
        System.out.println("====================");
    }

    static void jumlahStok(String[] cabang, String[] bunga, int[][] stok){
        System.out.println("========================");
        System.out.println("Menghitung Stok Cabang 4");
        System.out.println("========================");
        int[] pengurang = {1, 2, 0, 5};

        for(int i = 0; i<bunga.length; i++) {
            stok[3][i] -= pengurang[i];
        }

        for(int i = 0; i<bunga.length; i++) {
            System.out.println("Stok bunga " + bunga[i] + " " + cabang[i] + " berjumlah: " + stok[3][i]);
        }
    }

}
