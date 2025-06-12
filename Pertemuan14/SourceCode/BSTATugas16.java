package Pertemuan14.SourceCode;

public class BSTATugas16 {
    public static void main(String[] args) {
        BinaryTreeArray16 bta = new BinaryTreeArray16();
         
        bta.add(new Mahasiswa16("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa16("244160221", "Badar", "B", 3.85));
        bta.add(new Mahasiswa16("244160185", "Candra", "C", 3.21));
        bta.add(new Mahasiswa16("244160220", "Dewi", "B", 3.54));

        bta.add(new Mahasiswa16("244160131", "Devi", "A", 3.72));
        bta.add(new Mahasiswa16("244160205", "Ehsan", "D", 3.37));
        bta.add(new Mahasiswa16("244160170", "Fizi", "B", 3.46));

        System.out.println("--- Traverse PreOrder Mahasiswa ---");
        bta.traversePreOrder(0);
    }
}
