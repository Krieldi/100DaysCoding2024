package ISC;

public class Day31 {
    
    public static void main(String[] args) {
        //Konversi String ke primitif menggunakan metode parsing
        
        //ke int
        String a= "123";
        int intA = Integer.parseInt(a);
        System.out.println("Konversi String ke Int: "+intA);
        
        //ke boolean 
        String b="true";
        boolean boolB= Boolean.parseBoolean(b);
        System.out.println(boolB);
        
        //ke char(Tidak bisa menggunakan parsing namun bisa langsung menggunakan charAt)
        String c="Anjay";
        char charC= c.charAt(4);//4(y)karena urutan dari 0
        System.out.println(charC);
    }
}
