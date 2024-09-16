package ISC;

public class Day14 {
    
    public static void main(String[] args) {
        //64 bit
        long value = 9223372036854775807L;//harus diakhiri dengan Huruf 'l', jika tidak maka java menganggapnya sbgai int
        long Min_value = -9223372036854775808L;//Long mencakup 19 digit angka(9.2 Kuadriliun)64 bit
        
        System.out.print("Cakupan long: "+ Min_value);
        System.out.print(" sampai " + value);
    }
}
