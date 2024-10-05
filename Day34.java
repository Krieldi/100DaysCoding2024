package ISC;

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Masukkan Berapa Gaji Pokok: ");
        int a= in.nextInt();
        System.out.print("Masukkan Jam Lembur: ");
        int perJam= 10000;
        int b= in.nextInt();
        int bonus= b*perJam;
        
        System.out.println("Gaji Bersih= "+(a+bonus));
    }
}
