package ISC;

import java.util.Scanner;

public class Soal2 {
    
    public static void main(String[] args) {
        //Soal Pengisian nilai
        Scanner i= new Scanner (System.in);
        
        System.out.print("Jumlah pohon yang ada: ");
        int a= i.nextInt();
        System.out.print("Masukkan jumlah pohon perbulan: ");
        int b=i.nextInt();
        int jumlah= a+b;
        System.out.println("Jadi, setelah sebulan total pohon yang ada adalah "+jumlah);
    }
}
