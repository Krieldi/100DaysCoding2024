package ISC;

import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka awal(<100): ");
        int a = in.nextInt();
        while (a < 100) {
            System.out.println("Angka ke-" + a);
            a++;
        }
        in.close();
    }
}
