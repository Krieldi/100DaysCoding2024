package ISC;

public class Day81 {
    public static void main(String[] args) {
        //Tipe data primitif
        int a = 123;
        double b = 44.44;
        boolean c = true;

        //array
        char[] d = { 'H', 'e', 'l', 'l', 'o' };

        // Mengonversi ke String
        String q = String.valueOf(a);
        String w = String.valueOf(b);
        String e = String.valueOf(c);

        System.out.println("String dari int: " + q);
        System.out.println("String dari double: " + w);
        System.out.println("String dari boolean: " + e);
        System.out.println("String dari array: " + String.valueOf(d));
    }
}
