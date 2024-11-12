package ISC;

import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String a= in.nextLine();
        for (int i = 0; i < a.length(); i++) {
            System.out.println("index "+i+" adalah "+a.charAt(i));
        }
        in.close();
    }
}
