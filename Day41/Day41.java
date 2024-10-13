package ISC;
import java.util.Scanner;
import java.math.BigInteger;
public class Day41 {
    public static void main(String[] args) {
        Scanner i= new Scanner(System.in);
        System.out.println("PENJUMLAHAN");
        System.out.print("Masukkan angka: ");
        BigInteger a= i.nextBigInteger();
        System.out.print("Masukan angka: ");
        BigInteger b= i.nextBigInteger();
        BigInteger Hasil= a.add(b);
        System.out.println("Hasil: "+Hasil);
    }
}
