package ISC;

public class Day62 {

    public static void main(String[] args) {
        // Contoh break dalam looping
        for (int x = 1; x <= 10; x++) {
            if (x == 5) {
                System.out.println("Angka 5, BREAK!!");
                break; // Keluar(break) dari loop saat x = 5
            }
            System.out.println("Nilai x: " + x);
        }
    }
}
