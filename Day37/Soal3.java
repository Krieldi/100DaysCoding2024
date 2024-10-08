package ISC;

import java.util.Scanner;

public class Soal3 {
    
    public static void main(String[] args) {
        //Soal Pengisian nilai
        Scanner i= new Scanner (System.in);
        
        System.out.print("Jumlah barang yang ada: ");
        int a= i.nextInt();
        System.out.print("Masukkan jumlah barang yang di jual perminggu: ");
        int b=i.nextInt();
        int sisa= a-b;
        System.out.println("Jadi, setelah seminggu sisa barang yang ada adalah "+sisa);
    }
}
