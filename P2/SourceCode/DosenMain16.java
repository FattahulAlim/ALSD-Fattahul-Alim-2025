package P2.SourceCode;

public class DosenMain16 {
    public static void main(String[] args) {
        
        Dosen16 dsn1 = new Dosen16();
        dsn1.idDosen = "TI_091";
        dsn1.nama = "Fattahul Alim";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2020;
        dsn1.bidangKeahlian = "Cyber security";

        System.out.println("=====================");
        dsn1.tampilInformasi();
        dsn1.hitungMasaKerja();
        dsn1.ubahKeahlian("Game development");
        System.out.println("---------------------");
        System.out.println("Setelah Update Bidang");
        System.out.println("---------------------");
        dsn1.tampilInformasi();
        System.out.println("=====================");

        Dosen16 dsn2 = new Dosen16("TI_024", "Naufal Abidau", true, 2003, "UI/UX" );
        System.out.println("=====================");
        dsn2.tampilInformasi();
        dsn2.hitungMasaKerja();
        dsn2.setStatusAktif(false);
        System.out.println("---------------------");
        System.out.println("Setelah Update Status");
        System.out.println("---------------------");
        dsn2.tampilInformasi();
        System.out.println("=====================");
    }
}
