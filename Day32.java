package ISC;

public class Day32 {
    
    public static void main(String[] args) {
        System.out.println("Konversi tipe data primitif ke String!");
        // Metode valueOf()
        int q=123;
        String a= String.valueOf(q);
        System.out.println("Hasil konversi dari int: "+a);
        
        // Metode toString()
        boolean w= false;
        String b= Boolean.toString(w);
        System.out.println("Hasil konversi dari boolean: "+b);
        
        // operator +
        float e= 3.14f;
        String c= e+"";
        System.out.println("Hasil konversi dari float: "+c);
        
        // Metode String.format()
        char r= 'A';
        String d= String.format("Hasil konversi dari char: %s",r);
        System.out.println(d);
    }
}
