package ISC;
import java.util.Scanner;
public class Day43_1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int q= in.nextInt();
        System.out.print("Masukkan nilai: ");
        int e= in.nextInt();
        
        boolean a= q>=e;
        System.out.printf("Jika nilai %d >= %d maka %b ",q,e,a);
    }
}
