package ISC;

import java.util.Scanner;

public class Soal3 {
    
    public static void main(String[] args) {
        //Soal Modulo
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan Jumlah Apel: ");
        int a= in.nextInt();
        System.out.print("Masukkan jumlah teman ali: ");
        int b= in.nextInt();
        int c= a%b;
        
        System.out.printf("Jadi, Apel yang akan tersisa untuk Ali adalah %d",c);
    }
}
