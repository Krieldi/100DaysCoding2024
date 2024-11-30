package ISC;

import java.util.Scanner;

public class Day91 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (;;) {
            int a = in.nextInt();
            if (a % 2 == 0) {
                System.out.println("Genap");
            }else{
                System.out.println("You and I, end");
                break;
            }
        }
        in.close();
    }
}
