package ISC;
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan jumlah stok pertama: ");
        int a= in.nextInt();
        System.out.print("Masukkan jumlah stok kedua: ");
        int b= in.nextInt();
        a -= b;
        
        System.out.println("Jadi selisi kedua stok barang tersebut adalah "+a);
    }
}
