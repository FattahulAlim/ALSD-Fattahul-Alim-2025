public class Dosen16 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen16(String kd, String nm, Boolean jk, int age){
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("----------------");
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin: " + (jenisKelamin ? "Wanita" : "Pria"));
        System.out.println("Usia: " + usia);
    }
}
