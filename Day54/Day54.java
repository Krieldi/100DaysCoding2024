package ISC;
import java.util.Scanner;
public class Day54 {
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan angka awal( < 20): "); 
        for(int i= in.nextInt(); i<= 20; i++){
            System.out.println("Perulangan ke-"+i);
        }
    }
}
