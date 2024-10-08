package ISC;

import java.util.Scanner;

public class soal1 {
    
    public static void main(String[] args) {
        //Soal Pengisian nilai
        Scanner i= new Scanner (System.in);
        
        System.out.print("Berapa pensil yang akan d beli: ");
        int a= i.nextInt();
        
        System.out.printf("Jadi, jumlah pensil awalnya 0, setelah siswa beli %d pensil maka siswa punya %d pensil",a,a);
    }
}
