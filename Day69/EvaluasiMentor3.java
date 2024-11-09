package ISC;

import java.util.Scanner;

public class EvaluasiMentor3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan ukuran persegi: ");
        int a = in.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j == i) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
