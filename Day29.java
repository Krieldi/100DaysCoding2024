package ISC;

import java.math.BigInteger;

public class Day29 {
    public static void main(String[] args) {
        //Big Integer
        BigInteger a= new BigInteger("12345678901234567890");
        BigInteger b= new BigInteger("123456789");
        BigInteger tambah = a.add(b);  // Penjumlahan
        BigInteger kurang = a.subtract(b);  // Pengurangan
        BigInteger kali = a.multiply(b);  // Perkalian
        BigInteger bagi = a.divide(b);  // Pembagian

        System.out.println("Penjumlahan: " + tambah);
        System.out.println("Pengurangan: " + kurang);
        System.out.println("Perkalian: " + kali);
        System.out.println("Pembagian: " + bagi);
    }
}
