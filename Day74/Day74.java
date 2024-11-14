package ISC;

import java.util.Scanner;

public class Day74 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Input Words: ");
        String a= in.nextLine();
        int b= a.length();
        if (b>15) {
            String balik= new StringBuilder(a).reverse().toString();
            System.out.println("Kalimat terlalu panjang, jadi dibalikkan menjadi: "+balik);
        }else{
            System.out.println("Panjang kata: "+b);
        }
        in.close();
    }
}
