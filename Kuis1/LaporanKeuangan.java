package Kuis1;

public class LaporanKeuangan {
    String namaPerusahaan;
    double pendapatanBulanan;
    double biayaOperasional;

    public LaporanKeuangan(String nm, double pndptn, double operasional){
        namaPerusahaan = nm;
        pendapatanBulanan = pndptn;
        biayaOperasional = operasional;
    }

    public double hitungKeuntungan() {
        double keuntungan;
        keuntungan = pendapatanBulanan - biayaOperasional;
        return keuntungan;
    }

    public void printData(double keuntungan) {
        System.out.println("Nama Perusahaan: " + namaPerusahaan);
        System.out.println("Pendapatan Bulanan: " + pendapatanBulanan);
        System.out.println("Biaya Operasional: " + biayaOperasional);
        System.out.println("Keuntungan: " + keuntungan);
        System.out.println("----------------------------------------");
    }
}
