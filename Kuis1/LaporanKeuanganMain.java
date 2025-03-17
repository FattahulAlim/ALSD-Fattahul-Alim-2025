package Kuis1;

public class LaporanKeuanganMain {
    public static void main(String[] args) {
        double rataKeuntungan;
        LaporanKeuangan[] arrayOfPerusahaan = new LaporanKeuangan[5];
        double[] keuntunganMain = new double[5];
        int indexKeuntungan = 0;
        double keuntunganLebihSeratus = 0;
        double totalKeuntungan = 0;
        double persentase = 0;

        LaporanKeuangan pbrk1 = new LaporanKeuangan("Astra", 300000, 123000);
        LaporanKeuangan pbrk2 = new LaporanKeuangan("Honda", 89000, 45000);
        LaporanKeuangan pbrk3 = new LaporanKeuangan("Pertamina", 77000, 55000);
        LaporanKeuangan pbrk4 = new LaporanKeuangan("Toyota", 527000, 367000);
        LaporanKeuangan pbrk5 = new LaporanKeuangan("Yamaha", 167000, 100000);

        arrayOfPerusahaan[0] = pbrk1;
        arrayOfPerusahaan[1] = pbrk2;
        arrayOfPerusahaan[2] = pbrk3;
        arrayOfPerusahaan[3] = pbrk4;
        arrayOfPerusahaan[4] = pbrk5;   
        
        for(int i = 0; i < 5; i++){ 
            keuntunganMain[i] = arrayOfPerusahaan[i].hitungKeuntungan();
            totalKeuntungan += keuntunganMain[i];
            if (arrayOfPerusahaan[i].pendapatanBulanan > 100000) {
                indexKeuntungan++;
                keuntunganLebihSeratus += keuntunganMain[i];
            }
        }

        for(int i = 0; i < 5; i++){
            arrayOfPerusahaan[i].printData(keuntunganMain[i]);

        }
        persentase = (keuntunganLebihSeratus / totalKeuntungan);
        rataKeuntungan = (keuntunganLebihSeratus / indexKeuntungan);
        System.out.println("==================================");
        System.out.println("Rata rata keuntungan dari perusahaan dengan pendapatan bulanan > 100000 = " 
        + rataKeuntungan);
        System.out.println("Persentase Keuntungan= " + persentase + "%");


    }
}
