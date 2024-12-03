package ISC;

import java.util.Scanner;

public class Day93 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 2 * a - 1; j++) {
                if (j == (a - 1 - i) || j == (a - 1 + i)) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }

        in.close();
    }
}
