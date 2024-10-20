package ISC;
import java.util.Scanner;
public class Day49 {
    
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int a= in.nextInt();
        
        if(a > 0){
            System.out.println("Bilangan positif");
        }else if(a < 0){
            System.out.println("Bilangan negatif");
        }else if(a == 0)System.out.println("Netral(nol)");
    }
}
