package ISC;
import java.util.Scanner;
public class Day50 {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        System.out.print("Masukkan angka ganjil/genap: ");
        int a= in.nextInt();
        
        if (a %2 ==0){ 
            System.out.println("Bilangan Genap");
        }
        else if(a == 0) {
            System.out.println("Bilangan netral(Nol)");
        }else {
            System.out.println("Bilangan ganjil")
        }
    }
}
