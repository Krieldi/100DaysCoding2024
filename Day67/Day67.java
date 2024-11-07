package ISC;

import java.util.Scanner;

public class Day67 {

    public static void main(String[] args) {
        Day67 Kelazz = new Day67();
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();
        System.out.println("Masukkan operasi: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        String c = in.next();
        Kelazz.calculate(a, b, c);
    }

    public void calculate(int a, int n, String operator) {
        int result;

        switch (operator) {
            case "1":
            case "Penjumlahan":
                result = a + n;
                System.out.println("Hasil : " + result);
                break;
            case "2":
            case "Pengurangan":
                result = a - n;
                System.out.println("hasil : " + result);
                break;
            default:
                System.out.println("Operator tidak valid.");
                break;
        }
    }

}
