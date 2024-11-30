package ISC;

import java.util.Scanner;

public class Day89 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String[] b = a.split(" ");
        for (int i = 0; i < b.length; i++) {
            if (b[i].length() > 0) {
                b[i] = b[i].substring(0, 1).toUpperCase() + b[i].substring(1).toLowerCase();
            }
        }
        String hasil = String.join(" ", b);
        System.out.println(hasil);
        in.close();
    }
}
