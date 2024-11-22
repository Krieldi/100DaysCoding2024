package ISC;

import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan angka desimal untuk dibulatkan: ");
        double a= in.nextDouble();
        System.out.println("Angka yang dibulatkan ke atas: "+ Math.ceil(a));
        System.out.println("Angka yang dibulatkan ke bawah: "+ Math.floor(a));
        System.out.println("Angka yang dibulatkan ke atas atau ke bawah: "+ Math.round(a));
        in.close();
    }
}
