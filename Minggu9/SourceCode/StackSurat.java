public class StackSurat {
    Surat16[] list;
    int top;

    public StackSurat(int size) {
        this.list = new Surat16[size];
        top = -1;
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    } 

    public boolean isFull(){
        if (top == list.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahSurat(Surat16 s){
        if (!isFull()) {
            top++;
            list[top] = s;
        } else {
            System.out.println("Data telah penuh");
        }
    }

    public Surat16 lihatSuratTeratas(){
        if (!isEmpty()) {
            return list[top];
        } else {
            System.out.println("Tidak ada surat yang dapat ditampilkan");
            return null;
        }
    }

    public Surat16 prosesSurat(){
        if (!isEmpty()) {
            Surat16 s = list[top];
            top--;
            return s;
        } else {
            System.out.println("Semua surat telah diverifikasi");
            return null;
        }
    }

    public int cariSurat(String cari){
        int counter = 0;
        for(int i = 0; i <= top; i++){
            if (list[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                counter++;
            }
        }
        return counter;
    }
}
