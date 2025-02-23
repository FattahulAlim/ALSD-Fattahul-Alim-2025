package P2.SourceCode;

public class Dosen16 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("ID dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        if (statusAktif == true) {
            System.out.println("Status Aktif: Aktif");
        } else {
            System.out.println("Status Aktif: Tidak Aktif");
        }
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    boolean setStatusAktif(boolean statUpdate) {
        statusAktif = statUpdate;
        return statusAktif;
    }

    int hitungMasaKerja() {
        int masaKerja;
        masaKerja = 2025 - tahunBergabung;
        System.out.println("Dosen " + nama + " telah bergabung selama: " + masaKerja + " thn");
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen16() {

    }

    public Dosen16(String id, String nm, boolean statusAktif, int thn, String bidang) {
        idDosen = id;
        nama = nm;
        this.statusAktif = statusAktif;
        tahunBergabung = thn;
        bidangKeahlian = bidang;
    }
}
