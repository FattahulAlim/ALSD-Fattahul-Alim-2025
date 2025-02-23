package P2.SourceCode;

public class MataKuliah16 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.printf("%-20s%-40s%-13s%-20s\n", "Kode MK", "MK", "SKS", "Jumlah Jam");
        System.out.printf("%-20s%-40s%-13d%-20d\n", kodeMK, nama, sks, jumlahJam);
    }

    void ubahSKS(int updateSKS) {
        sks = updateSKS;
    }

    int tambahJam(int tambahanJam) {
        jumlahJam += tambahanJam;
        return jumlahJam;
    }

    int kurangiJam(int jamMinus) {
        jumlahJam -= jamMinus;
        return jumlahJam;
    }

    public MataKuliah16() {

    }

    public MataKuliah16(String MK, String nm, int sks, int jm) {
        kodeMK = MK;
        nama = nm;
        this.sks = sks;
        jumlahJam = jm;
    }
}
