package ISC;

import java.util.Scanner;

public class Soal1 {
    
    public static void main(String[] args) {
        //Soal perkalian
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan Jumlah kebun: ");
        int a= in.nextInt();
        int buah= 50;
        int b= a*buah;
        
        System.out.printf("Jadi, petani dapat menghasilkan %d kilogram buah jika dia memiliki %d kebun",b,a);
    }
}
