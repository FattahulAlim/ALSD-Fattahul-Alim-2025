package P2.SourceCode;

public class MataKuliahMain16 {
    public static void main(String[] args) {

        MataKuliah16 mk1 = new MataKuliah16();
        mk1.kodeMK = "ALSD_TI";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 5;
        mk1.jumlahJam = 8;

        MataKuliah16 mk2 = new MataKuliah16("AG_TI", "Agama", 2, 2);

        mk1.tampilInformasi();
        mk1.kurangiJam(2);
        mk1.ubahSKS(3);
        System.out.println("--------------");
        System.out.println("Setelah Update");
        System.out.println("--------------");
        mk1.tampilInformasi();

        System.out.println("===============================================================================");
        mk2.tampilInformasi();
        mk2.tambahJam(2);
        System.out.println("--------------");
        System.out.println("Setelah update");
        System.out.println("--------------");
        mk2.ubahSKS(4);
        mk2.tampilInformasi();
    }
}
