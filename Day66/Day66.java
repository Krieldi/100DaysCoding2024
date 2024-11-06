package ISC;

public class Day66 {

    public static void main(String[] args) {
        // Pola Persegi
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        // Pola Persegi Panjang
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
