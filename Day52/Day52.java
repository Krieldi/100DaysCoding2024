package ISC;

import java.util.Scanner;

public class Days52 {
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan nomor bulan(1-12): ");
        int a= in.nextInt();
        String namaBulan = a == 1 ? "Januari" :
                           a == 2 ? "Februari" :
                           a == 3 ? "Maret" :
                           a == 4? "April" :
                           a == 5 ? "Mei" :
                           a == 6 ? "Juni" :
                           a == 7? "Juli" :
                           a == 8 ? "Agustus" :
                           a == 9 ? "September" :
                           a == 10? "Oktober" :
                           a == 11 ? "November" :
                           a == 12 ? "Desember" :
                           "Nomor bulan tidak valid";
        System.out.println(namaBulan);
    }
}
