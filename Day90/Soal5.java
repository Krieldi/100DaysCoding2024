package Day90;

import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a > 0) {
            System.out.println("Positif");
        } else if (a < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Nol");
        }
    }
}

