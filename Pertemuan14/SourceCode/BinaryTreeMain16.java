package Pertemuan14.SourceCode;

public class BinaryTreeMain16 {
    public static void main(String[] args) {
        BinaryTree16 bst = new BinaryTree16();

        bst.add(new Mahasiswa16("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa16("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa16("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa16("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal): ");
        bst.transverseInOrder(bst.root);

        System.out.println("Pencarian data mahasiswa: ");
        System.out.println("Cari mahasiswa dengan ipk 3.54 : ");
        String hasilCari = bst.find(3.54)?"Ditemukan":"Tidak Ditemukan";
        System.out.println(hasilCari);

        System.out.println("Cari mahasiswa dengan ipk 3.54 : ");
        hasilCari = bst.find(3.22)?"Ditemukan":"Tidak Ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa16("244160131", "Dewi", "A", 3.72));
        bst.add(new Mahasiswa16("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa16("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa: ");
        System.out.println("InOrder Traversal: ");
        bst.transverseInOrder(bst.root);
        System.out.println("PreOrder Traversal: ");
        bst.transversePreOrder(bst.root);
        System.out.println("PostOrder Traversal: ");
        bst.transversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (In Order Traversal): ");
        bst.transverseInOrder(bst.root);
        
    }
}
