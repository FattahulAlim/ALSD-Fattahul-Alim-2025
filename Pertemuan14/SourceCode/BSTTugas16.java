package Pertemuan14.SourceCode;

public class BSTTugas16 {
    public static void main(String[] args) {
        BinaryTree16 bst = new BinaryTree16();

        bst.insert(new Mahasiswa16("244160121", "Ali", "A", 3.57));
        bst.insert(new Mahasiswa16("244160221", "Badar", "B", 3.85));
        bst.insert(new Mahasiswa16("244160185", "Candra", "C", 3.21));
        bst.insert(new Mahasiswa16("244160220", "Dewi", "B", 3.54));
        bst.insert(new Mahasiswa16("244160131", "Dewi", "A", 3.72));
        bst.insert(new Mahasiswa16("244160205", "Ehsan", "D", 3.37));
        bst.insert(new Mahasiswa16("244160170", "Fizi", "B", 3.46));

        Mahasiswa16 minIPK = bst.cariMinIPK();
        Mahasiswa16 maxIPK = bst.cariMaxIPK();

        System.out.println("-----------------------------");
        System.out.println("Nilai IPK Terkecil : " + minIPK.ipk);
        System.out.println("-----------------------------");
        
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Nilai IPK Tertinggi : " + maxIPK.ipk);
        System.out.println("-----------------------------");

        System.out.println();
        System.out.println("--- Daftar Mahasiswa yang Memiliki IPK diatas 3.54 ---");
        bst.tampilkanInfo(3.54);
    }
}
