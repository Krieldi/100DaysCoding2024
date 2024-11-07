package ISC;

import java.util.Scanner;

public class Day67 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();
        System.out.println("Masukkan operasi: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        String c = in.next();

        if (c.equals("1") || c.equalsIgnoreCase("penjumlahan")) {
            tambah(a, b);
        } else if (c.equals("2") || c.equalsIgnoreCase("pengurangan")) {
            kurang(a, b);
        }
    }

    public static void tambah(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasilnya adalah: " + hasil);
    }

    public static void kurang(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasilnya adalah: " + hasil);
    }
}
