package ISC;

import java.util.Scanner;

public class Day75 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (;;) {
            System.out.print("Apakah anda ingin melanjutkan permainan(Y/N)?");
            String a = in.nextLine().toLowerCase();
            if (a.equals("y")) {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Melanjutkan...");
                }
            } else if (a.equals("n")) {
                System.out.println("BERHENTI!!");
                break;
            }
        }
        in.close();
    }
}
