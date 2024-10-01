package ISC;

import java.math.BigDecimal;

public class Day30 {
    
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("3.14");
        BigDecimal b = new BigDecimal("4.4");
        
        System.out.println("Bilangan desimal pertama: "+a);
        System.out.println("Bilangan Desimal kedua: "+b);
        
        // Operasi Aritmatika
        System.out.println("\nHasil Aritmatika: ");
        BigDecimal tambah = a.add(b);  // Penjumlahan
        BigDecimal kurang = a.subtract(b);  // Pengurangan
        BigDecimal kali = a.multiply(b);  // Perkalian

        // hasilnya
        System.out.println("Penjumlahan: " + tambah);
        System.out.println("Pengurangan: " + kurang);
        System.out.println("Perkalian: " + kali);
    }
}
