package ISC;

import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka awal(>0): ");
        int i = in.nextInt();
        while (i > 0) {
            System.out.println("Angka ke-" + i);
            i -= 2;
        }
        in.close();
    }
}
