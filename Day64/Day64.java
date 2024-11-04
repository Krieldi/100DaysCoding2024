package ISC;

public class Day64 {

    public static void main(String[] args) {
        // DAY64 Label(break)
        loopAwal:
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                if (i == 4 & a == 4) {
                    System.out.println("Nilai i dan a sama-sama memiliki nilai 4");
                    break loopAwal; // menghentikan loop dalam label loopAwal
                }
                System.out.println("i: " + i + ", a: " + a);
            }
        }
    }
}
