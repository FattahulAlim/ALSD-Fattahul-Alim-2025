package Pertemuan14.SourceCode;

public class BinaryTreeArray16 {
    Mahasiswa16[] dataMahasiswa;
    int idxLast;
    int size = 0;

    public BinaryTreeArray16(){
        this.dataMahasiswa = new Mahasiswa16[10];
    }

    void populateData(Mahasiswa16 dataMHS[], int idxLast) {
        this.dataMahasiswa = dataMHS;
        this.idxLast = idxLast;
    }

    void transverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                transverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                transverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Mahasiswa16 data) {
        if (size >= dataMahasiswa.length) {
            System.out.println("Tree sudah penuh");
            return;
        }

        dataMahasiswa[size] = data;
        size++;
        idxLast = size - 1;
    }

    public void traversePreOrder(int index) {
        if (index >= size ) {
            return;
        }

        dataMahasiswa[index].tampilInformasi();
        traversePreOrder(2 * index + 1);
        traversePreOrder(2 * index + 2);
    }
}