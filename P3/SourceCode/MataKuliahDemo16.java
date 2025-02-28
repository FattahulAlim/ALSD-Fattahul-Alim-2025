package P3.SourceCode;

import java.util.Scanner;

public class MataKuliahDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int index;

        System.out.print("Jumlah Mata Kuliah yang ingin di input: ");
        index = sc.nextInt();
        MataKuliah16[] arrayOfMataKuliah = new MataKuliah16[index];

        for(int i=0; i < index; i++) {
            arrayOfMataKuliah[i] = new MataKuliah16();
            arrayOfMataKuliah[i].tambahData(i);
        }

        for(int i=0; i < index; i++){
            arrayOfMataKuliah[i].cetakInfo(i);
        }
    }
}
