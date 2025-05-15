package Minggu10.SourceCode;

public class TugasAntrianLayanan {
    Mahasiswa[] data;
    int front, rear, size, max, memprosesKrs, maxDitanganiDPA;

    public TugasAntrianLayanan() {
        this.max = 10;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.memprosesKrs = 0;
        this.maxDitanganiDPA = 0;
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        } else if (maxDitanganiDPA == 30) {
            System.out.println("Kuota maksimal telah dicapai, tidak dapat menambah mahasiswa");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        memprosesKrs++;
        maxDitanganiDPA++;
        System.out.println("Berhasil masuk ke antrian.");
    }

    public void mengosongkanAntrian(){
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public Mahasiswa layaniMahasiswa(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } 
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    
    public void DuaAntrianTerdepan(){
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else if (size < 2){
            System.out.println("Hanya ada satu antrian");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        } else {
            System.out.println("2 Antrian terdepan");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            data[front + 1].tampilkanData();
        }
    }

    public void lihatTerakhir(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa antri terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return;
        } 

        System.out.println("Daftar Mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++){
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public int getJumlahSudahKRS(){
        return memprosesKrs;
    }

    public int getJumlahBelumKRS(){
        return 30 - memprosesKrs;
    }

}
