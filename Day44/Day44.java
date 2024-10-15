package ISC;
import java.util.*;
public class Day44 {
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan Umur Anda: ");
        int a= in.nextInt();
        
        if (a>= 17){
            System.out.println("Anda sudah punya KTP");
        }else{
            System.out.println("Anda belum cukup umur cil!! ");
        }
    }
}
