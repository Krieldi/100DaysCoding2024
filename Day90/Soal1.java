package Day90;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a <= 5) {
            System.out.println("Balita");
        }
        if (a > 5 && a <= 12) {
            System.out.println("Anak-anak");
        }
        if (a > 12 && a <= 17) {
            System.out.println("Remaja");
        } else if (a > 17) {
            System.out.println("Dewasa");
        }
    }
}
