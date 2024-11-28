package ISC;

import java.util.*;

public class Day88 {

    public static void main(String[] args) {
        int[] n = {76, 69, 57, 47, 83, 39, 98, 76, 34, 60};
        double a = 0;
        int nilaiTertinggi = n[0], nilaiTerendah = n[0];
        for (int i : n) {
            a += i;
            if (i > nilaiTertinggi) {
                nilaiTertinggi = i;
            } else if (i < nilaiTerendah) {
                nilaiTerendah = i;
            }
        }
        double r = a / n.length;

        System.out.println("Nilai siswa: " + Arrays.toString(n));
        System.out.println("Rata-rata nilai: " + r);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        int jumlahDiAtasRataRata = 0;
        for (int i : n) {
            if (i > r) {
                jumlahDiAtasRataRata++;
            }
        }
        System.out.println("Jumlah siswa dengan nilai di atas rata-rata: " + jumlahDiAtasRataRata);
    }

}
