package ISC;
import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan nilai ujian pertama: ");
        int a= in.nextInt();
        System.out.print("Masukkan nilai ujian kedua: ");
        int b= in.nextInt();
        a -= b;
        
        System.out.println("Jadi selisi antara nilai ujian pertama dan nilai ujian kedua adalah "+a);
    }
}
