package Day90;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Kedua bilangan adalah genap");
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Kedua bilangan adalah ganjil");
        } else {
            System.out.println("Satu bilangan genap dan satu bilangan ganjil");
        }
    }
}
