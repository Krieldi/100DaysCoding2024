package ISC;

import java.util.Scanner;

public class Soal2 {
    
    public static void main(String[] args) {
        //soal pengisian dan pembagian
        Scanner in=new Scanner (System.in);
        System.out.print("Masukkan jumlah stok beras(kg): ");
        int a= in.nextInt();
        System.out.print("Masukkan jumlah bagian yang dijual: ");
        int b= in.nextInt();
        a /= b;
        
        System.out.println("jadi, stok yang ada pada setiap bagian adalah "+a);
    }
}
