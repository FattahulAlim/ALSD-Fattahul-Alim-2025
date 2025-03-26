package Minggu6.SourceCode;

public class SortingMain16 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting16 dataurut1 = new Sorting16(a, a.length);
        int b[] = {30, 20, 2, 8, 14};
        Sorting16 dataurut2 = new Sorting16(b, b.length);
        int c[] = {40, 20, 4, 9, 3};
        Sorting16 dataurut3 = new Sorting16(c, c.length);
        
        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan bubble sort (ASC)");
        dataurut1.tampil();

        System.out.println("Data Awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan selection sort (ASC)");
        dataurut2.tampil();

        System.out.println("Data Awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan insertion sort (ASC)");
        dataurut3.tampil();
    }
}
