package ISC;

public class Day25 {
    public static void main(String[] args) {
        
        Double a= 4.4;//Auto-boxing (otomatis mengubah tipe data double menjadi Double)
        Double b=Double.valueOf(3.14);// metode statis untuk mengubah tipe data double menjadi Double
        
        System.out.printf("Jadi, java mendukung auto-boxing yang otomatis mengubah tipe data primitif ke Reference(%f), dan metode static/manual (%f)\n", a,b);
        System.out.println("Contoh penggunaan atitmatika: "+(a-b));
    }
}
