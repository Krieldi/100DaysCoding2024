package ISC;

import java.util.Scanner;

public class Day38 {
    
    public static void main(String[] args) {
        //soal pengisian dan perkalian
        Scanner in=new Scanner (System.in);
        System.out.print("Masukkan Luas lahan(ha): ");
        int a= in.nextInt();
        a *= 2;
        
        System.out.println("Setelah setahun luas lahan yang di punya setelah digandakan adalah "+a+" Hektare(ha)");
    }
}
