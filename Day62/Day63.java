package ISC;

public class Day63 {

    public static void main(String[] args) {
        // DAY63 keyword: continue
        for (int x = 1; x <= 10; x++) {
            if (x == 5) {
                System.out.println("jika x = 5, Skip!!");
                continue; // melewati loop saat x = 5
            }
            System.out.println("Nilai x: " + x);
        }
    }
}
