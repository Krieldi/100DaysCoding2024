package ISC;

import java.util.Arrays;
import java.util.Scanner;

public class Day79 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Nama: ");
        int n = in.nextInt();
        System.out.print("Masukkan Nama: ");
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.next();
        }
        System.out.print("Nama-nama yang di input: ");
        System.out.println(Arrays.toString(a));

    }
}
