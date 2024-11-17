package ISC;

import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan Password PDN: ");
        String a= in.nextLine();

        if (a.equals("Admin#1234")) {
            System.out.println("        Access Granted");
            System.out.println("Congratulation!! YOU CAN ACCESS KONOHA's NATIONAL DATA CENTER");
        }else {
            System.out.println("Access Denied");
        }
        in.close();
    }
}
