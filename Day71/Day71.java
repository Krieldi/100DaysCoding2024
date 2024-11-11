package ISC;
import java.util.Scanner;

public class Day71 {

  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("HEllO WORLD!!");
        System.out.print("Masukkan 2 angka: ");
        System.out.print("Hasil perkalian: " + nonMain(in.nextInt(), in.nextInt()) + "\n");
        N(args);
        in.close();
    }

    public static void N(String[] args) { //Method static void
        System.out.println("GGWP");
    }

    public static int nonMain(int a, int b) { //method static non-void
        return a * b;
    }
}
