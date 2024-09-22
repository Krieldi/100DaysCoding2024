package ISC;

public class Day21 {
    public static void main(String[] args) {
        //inisialisasi Short  
        Short number= 32767;
        System.out.println("Contoh penggunaan Byte: "+number);
        //constanta untuk mengetahui nilai minimum dan maksimum dari Short
        short max = Short.MAX_VALUE;  // Nilai maksimum (32767)
        short min = Short.MIN_VALUE;  // Nilai minimum (-32768)
        System.out.println("Hasil maksimal "+max);
        System.out.println("Hasil minimum: "+min);
    }
}
