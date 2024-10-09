package ISC;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan jumlah apel: ");
        int a= in.nextInt();
        System.out.print("Masukkan jumlah monyet: ");
        int b= in.nextInt();
        a %= b;
        
        System.out.printf("Jadi, apel yang tersisa setelah dibagikan kepada %d monyet adalah %d",b,a);
    }
}
