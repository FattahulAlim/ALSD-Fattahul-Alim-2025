package Pertemuan13.SourceCode;

public class DoubleLinkedList01 {
    Node01 head;
    Node01 tail;
    int size = 0;

    public DoubleLinkedList01() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
            
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            
        }

        size++;
    }

    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
        
    }

    public void deleteFirst() {
        Node01 temp = head;
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (head.next == null) {
            // jika node yang telah diisi hanya satu
            head = null;
            tail = null;
            System.out.println("Data Sudah berhasil dihapus, Data yang terhapus: ");
            temp.data.tampil();
            size--;

        } else {
            head = head.next;
            head.prev = null;
            System.out.println("Data Sudah berhasil dihapus, Data yang terhapus: ");
            temp.data.tampil();
            size--;

        }
    }

    public void deleteLast() {
        Node01 temp = tail;
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (tail.prev == null) {
            head = null;
            tail = null;
            System.out.println("Data Sudah berhasil dihapus, Data yang terhapus: ");
            temp.data.tampil();
            size--;

        } else {
            tail = tail.prev;
            tail.next = null;
            System.out.println("Data Sudah berhasil dihapus, Data yang terhapus: ");
            temp.data.tampil();
            size--;

        }
    }

    public void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;

        // cari node dengan nim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM: " + keyNim + " Tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(data);

        // jika current sama dengan tail
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
            size++;
        } else {
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }

        System.out.println("Node berhasil disisipkan setelah NIM: " + keyNim);
    }

    public void print() {
        Node01 current = head;
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
        } else {
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }

    }

    public Mahasiswa01 search(String keyNim) {
        Node01 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            return null;
        } else {
            return current.data;
        }
    }

    public void add(int keyIdx, Mahasiswa01 data) {
        Node01 current = head;


        if (isEmpty()) {
            System.out.println("Linked List kosong data telah ditambahkan di index ke - 0");
            addFirst(data);
            return;
        } 

        if (keyIdx == 0) {
            addFirst(data);
            return;
        }

        if (keyIdx < 0 || keyIdx > size) {
            System.out.println("Index diluar jangkauan");
            return;
        }

        if (keyIdx == size) {
            addLast(data);
            return;
        }

        Node01 newNode = new Node01(data);
        int idx = 0;

        while (idx < keyIdx && current != null) {
            current = current.next;
            idx++;
        }


        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;


        size++;
        System.out.println("Data Berhasil Ditambahkan");
            
        }

        public void removeAfter(String key) {
            Node01 current = head;
            if (isEmpty()) {
                return;
            }

            while (current != null && !current.data.nim.equals(key)) {
                current = current.next;
            }
            // jika data tidak ditemukan
            if (current == null) {
                System.out.println("Tidak ada data sesuai yang dapat dihapus");
                return;
            } 
            //jika current == tail
            if (current == tail) {
                System.out.println("Tidak ada data setelah tail");
                return;
            }

            Node01 toDelete = current.next;

            if (toDelete == tail) {
                tail = toDelete.prev;
                tail.next = null;
            } else {
                current.next = toDelete.next;
                toDelete.next.prev = current;
            }

            size--;
            System.out.println("Data berhasil dihapus, data yang dihapus: ");
            toDelete.data.tampil();
        }

        public void removeAt(int keyIdx) {
            Node01 current = head;
            int idx = 0;

            if (isEmpty()) {
                System.out.println("Linked list kosong tidak ada data yang dapat dihapus");
            }

            while (current != null && idx < keyIdx) {
                current = current.next;
                idx++;
            } 

            if (current == null) {
                System.out.println("Tidak ada data yang dapat dihapus di index ke-" + keyIdx);
                return;
            }

            if (current == head && current == tail) {
                head = tail = null;
            } else if (current == head) {
                head = current.next;
                head.prev = null;
            } else if (current == tail) {
                tail = current.prev;
                tail.next = null;
            } else {
                current.next.prev = current.prev;
                current.prev.next = current.next;
            }

            size--;
            System.out.println("Data berhasil dihapus, data yang dihapus: ");
            current.data.tampil();
        }

        public Mahasiswa01 getFirst() {
            if (isEmpty()) {
                return null;
            }else {
                return head.data;
            }
            
        }

        public Mahasiswa01 getLast() {
            if (isEmpty()) {
                return null;
            } else {
                return tail.data;
            }
        }

        public Mahasiswa01 getIndex(int keyIdx) {
            Node01 current = head;
            int idx = 0;
            
            if (isEmpty()) {
                return null;
            }

            while (current != null && idx < keyIdx) {
                current = current.next;
                idx++;
            }

            if (current == null) {
                System.out.println("Tidak ada data di index " + keyIdx);
                return null;
            } else {
                return current.data;
            }
        }

        public int getSize(){
            return size;
        }
    }

