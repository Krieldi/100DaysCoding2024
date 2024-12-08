package ISC;

import java.util.Scanner;

public class Day98 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai x: ");
        int a = in.nextInt();
        System.out.print("Masukkan Nilai Y: ");
        int b = in.nextInt();
        int hasil = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                hasil += i;
                System.out.print(i);
                if (i < b - 1 || (i + 2 <= b)) {
                    System.out.print(" + ");
                }
            }
        }
        System.out.print(" = " + hasil);
        in.close();
    }
}
