package Pertemuan12.SourceCode;

public class LinkedListQueue16 {
    NodeMahasiswaQueue16 head;
    NodeMahasiswaQueue16 tail;
    int max = 3;
    int size = 0;

    public boolean isEmpty(){
        return (size == 0);
    }

    public boolean isFull() {
        return (size == max);
    }

    public void tambahLast(Mahasiswa16 input) {
        NodeMahasiswaQueue16 ndInput = new NodeMahasiswaQueue16(input, null);
        if (isFull()) {
            System.out.println("Linked List Penuh! Tidak dapat menambahkan data");
        } else if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            size++;
        } else {
           tail.next = ndInput;
           tail = ndInput;
           size++;
        }
    }

    public Mahasiswa16 removeFirst(){
        Mahasiswa16 tmp = new Mahasiswa16();
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
            return null;
        } else if (head == tail) {
            tmp = head.data;
            head = tail = null;
            size--;
            return tmp;
        } else {
            tmp = head.data;
            head = head.next;
            size--;
            return tmp;
        }
    }

    public void antrianDepan(){
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
        } else {
            head.data.tampilInformasi();
        }
    }

    public void antrianTerakhir() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
        } else {
            tail.data.tampilInformasi();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public void mengosongkanAntrian(){
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
        } else {
            head.next = null;
            head = null;
            tail = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        }
    }

}
