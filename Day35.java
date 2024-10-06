package ISC;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        System.out.print("Masukkan angka pertama: ");
        int a= in.nextInt();
        System.out.print("Masukkan angka ke dua: ");
        int b= in.nextInt();
        
        System.out.println("Hasil penjumlahan: "+(a+b));
        System.out.println("Hasil pengurangan: "+(a-b));
    }
}
