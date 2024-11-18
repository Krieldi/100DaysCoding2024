package ISC;

import java.util.Scanner;

public class Day78 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String n= "Krieldi";
        System.out.print("Guess My Name: ");
        String a= in.nextLine();
        if (a.equalsIgnoreCase(n)) {
            System.out.println("Very Good");
        }else{
            System.out.println("Very Bad");
        }
        in.close();
    }
}
