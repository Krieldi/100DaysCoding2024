package ISC;

public class Day72 {

    public static void main(String[] args) {
        nonVoid(4);
    }

    public static int nonVoid(int a) {
        if (a == 0) {
            return a;
        } else {
            nonVoid(a-1);
            System.out.println(a+" ");
            return a;
    }
}
