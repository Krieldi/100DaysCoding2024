package ISC;

import java.util.Scanner;

public class Soal2 {
    
    public static void main(String[] args) {
        //Soal pembagian
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan Jumlah Permen: ");
        int a= in.nextInt();
        System.out.print("Masukkan jumlah murid: ");
        int b= in.nextInt();
        int c= a/b;
        
        System.out.printf("Jadi, permen yang akan di terima setiap murid adalah %d",c);
    }
}
