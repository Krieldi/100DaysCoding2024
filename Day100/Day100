package ISC;

import java.time.LocalTime;
import java.util.Scanner;

public class Day100 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama anda: ");
        String a = in.nextLine();
        String b;
        LocalTime w = LocalTime.now();
        if (w.isBefore(LocalTime.NOON)) {
            b = "Selamat Pagi";
        } else if (w.isBefore(LocalTime.of(17, 0))) {
            b = "Selamat malam";
        } else {
            b = "Selamat Malam";
        }
        System.out.println("══════════════════════════════════════════");
        System.out.printf("      %s %s%n", b, a);
        System.out.println("    Program Anda Telah Selesai         ");
        System.out.println("══════════════════════════════════════════");
        in.close();
    }
}
