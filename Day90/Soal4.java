package Day90;

public class Soal4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1; i <= 30; i++) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
