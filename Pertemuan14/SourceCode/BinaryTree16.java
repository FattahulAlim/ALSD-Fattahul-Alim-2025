package Pertemuan14.SourceCode;


public class BinaryTree16 {
    Node16 root;

    public BinaryTree16(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(Mahasiswa16 mahasiswa){
        Node16 newNode = new Node16(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node16 current = root;
            Node16 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(double ipk){
        boolean result = false;
        Node16 current = root;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else  {
                current = current.left;
            }
        } return result;
    }

    void transversePreOrder(Node16 node){
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            transversePreOrder(node.left);
            transversePreOrder(node.right);
        }
    }

    void transverseInOrder(Node16 node){
        if (node != null) {
            transverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            transverseInOrder(node.right);
        }
    }

    void transversePostOrder(Node16 node){
        if (node != null) {
            transversePostOrder(node.left);
            transversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node16 getSuccessor(Node16 del){
        Node16 successor = del.right;
        Node16 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete (double ipk){
        if (isEmpty()) {
            System.out.println("Binary Tree Kosong");
            return;
        }
        //cari node current yang akan dihapus
        Node16 parent = root;
        Node16 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;                
            }
        }
        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.left == null) {
                if (current == root) { //jika hanya punya satu anak (kanan)
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {//jiks hsnys punya 1 anak kiri
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //Jika punya 2 anak
                Node16 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    void insert(Mahasiswa16 mahasiswa ) {
        root = addRekursif(root, mahasiswa);
    }

    public Node16 addRekursif(Node16 current, Mahasiswa16 data) {
        if (current == null) {
            return new Node16(data);
        } else if (data.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, data);
        } else if(data.ipk > current.mahasiswa.ipk){
            current.right = addRekursif(current.right, data);
        } else {
            System.out.println("Data sudah ada");
        }

        return current;
    }

    public Mahasiswa16 cariMinIPK(){
        if (root == null) {
            System.out.println("Data Masih kosong");
            return null;
        }

        Node16 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa;
    }

    public Mahasiswa16 cariMaxIPK(){
        if (root == null) {
            System.out.println("Data Masih kosong");
            return null;
        }

        Node16 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa;      
    }


    public void tampilkanInfo(double ipkBatas){
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }
    public void tampilMahasiswaIPKdiAtas(Node16 current, double ipkBatas) {
        if (current == null) {
            return;
        }

        if (current.mahasiswa.ipk > ipkBatas) {
            tampilMahasiswaIPKdiAtas(current.left, ipkBatas);
            current.mahasiswa.tampilInformasi();
            tampilMahasiswaIPKdiAtas(current.right, ipkBatas);
        }
    }
}
