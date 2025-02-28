package P3.SourceCode;

public class DataDosen16 {

    static void dataSemuaDosen(Dosen16[] arrayOfDosen) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            if (arrayOfDosen[i].jenisKelamin) {
                System.out.println("Kode            : " + arrayOfDosen[i].kode);
                System.out.println("Nama            : " + arrayOfDosen[i].nama);
                System.out.println("Jenis Kelamin   : Wanita");
                System.out.println("Usia            : " + arrayOfDosen[i].usia);
            } else {
                System.out.println("Kode            : " + arrayOfDosen[i].kode);
                System.out.println("Nama            : " + arrayOfDosen[i].nama);
                System.out.println("Jenis Kelamin   : Pria");
                System.out.println("Usia            : " + arrayOfDosen[i].usia);
            }
            System.out.println("--------------------------------------");
        }
    }

    static void jumlahDosenPerJenisKelamin(Dosen16[] arrayOfDosen) {
        int wanita = 0;
        int pria = 0;

        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                wanita++;
            } else {
                pria++;
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Jumlah dosen dengan jenis kelamin pria yaitu: " + pria);
        System.out.println("Jumlah dosen dengan jenis kelamin wanitu yaitu: " + wanita);
        System.out.println("--------------------------------------");
    }

    static void rerataUsiaDosenPerJenisKelamin(Dosen16[] arrayOfDosen) {
        int wanita = 0;
        int pria = 0;
        int usiaWan = 0;
        int usiaPri = 0;

        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                usiaWan = arrayOfDosen[i].usia;
                wanita++;
            } else {
                usiaPri = arrayOfDosen[i].usia;
                pria++;
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Rerata usia dosen pria: " + (usiaPri / pria));
        System.out.println("Rerata usia dosen wanita: " + (usiaWan / wanita));
        System.out.println("--------------------------------------");

    }

    static void infoDosenPalingTua(Dosen16[] arrayOfDosen) {
        int index = 0;
        int tertua = 0;

        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen[i].usia > tertua) {
                tertua = arrayOfDosen[i].usia;
                index = i;
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Berikut data dosen paling senior");
        System.out.println("Kode            : " + arrayOfDosen[index].kode);
        System.out.println("Nama            : " + arrayOfDosen[index].nama);
        if (arrayOfDosen[index].jenisKelamin) {
            System.out.println("Jenis Kelamin   : Wanita");
        } else {
            System.out.println("Jenis Kelamin   : Pria");
        }
        System.out.println("Usia            : " + arrayOfDosen[index].usia);
        System.out.println("--------------------------------------");
    }

    static void infoDosenPalingMuda(Dosen16[] arrayOfDosen){
        int index = 0;
        int termuda = 500;

        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen[i].usia < termuda) {
                termuda = arrayOfDosen[i].usia;
                index = i;
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Berikut data dosen paling muda");
        System.out.println("Kode            : " + arrayOfDosen[index].kode);
        System.out.println("Nama            : " + arrayOfDosen[index].nama);
        if (arrayOfDosen[index].jenisKelamin) {
            System.out.println("Jenis Kelamin   : Wanita");
        } else {
            System.out.println("Jenis Kelamin   : Pria");
        }
        System.out.println("Usia            : " + arrayOfDosen[index].usia);
        System.out.println("--------------------------------------");
    }
}
