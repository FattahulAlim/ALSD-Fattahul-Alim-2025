package Pertemuan14.SourceCode;

public class BinaryTreeArrayMain16 {
    public static void main(String[] args) {
        BinaryTreeArray16 bta = new BinaryTreeArray16();
         
        Mahasiswa16 mhs1 = new Mahasiswa16("244160121", "Ali", "A", 3.57);
        Mahasiswa16 mhs2 = new Mahasiswa16("244160221", "Badar", "B", 3.85);
        Mahasiswa16 mhs3 = new Mahasiswa16("244160185", "Candra", "C", 3.21);
        Mahasiswa16 mhs4 = new Mahasiswa16("244160220", "Dewi", "B", 3.54);

        Mahasiswa16 mhs5 = new Mahasiswa16("244160131", "Devi", "A", 3.72);
        Mahasiswa16 mhs6 = new Mahasiswa16("244160205", "Ehsan", "D", 3.37);
        Mahasiswa16 mhs7 = new Mahasiswa16("244160170", "Fizi", "B", 3.46);

        Mahasiswa16[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.transverseInOrder(0);
    }
}
