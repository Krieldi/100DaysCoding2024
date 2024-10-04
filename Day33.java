package ISC;

public class Day33 {
    public static void main(String[] args) {
        System.out.println("Type Casting:");
        // Metode Implicit casting/otomatis
        byte q= 100;
        double a= q;
        System.out.println("Hasil konversi dari byte ke double: 100 to "+a);
        
        // Metode explicit casting/manual
        float w= 3.14f;
        int b=(int) w;
        System.out.println("Hasil konversi dari float: 3.14 to "+b);
        
        // Metode auto-boxing
        int e= 123;
        Integer c= e;
        System.out.println("Hasil konversi dari int ke Integer: "+c);     
        
        // Metode unboxing
        Byte r=12;
        int d= r;
        System.out.println("Hasil konversi dari Byte ke int: "+d);
    }
}
