package ISC;

public class Day24 {
    
    public static void main(String[] args) {
        Float a= 4.4F;
        Float b= Float.valueOf("3.14F");//konfersi tipe data String ke Float
        Float c= a+b;
        Float d= a*b;
        
        System.out.printf("Hasil a+b= %f",c);
        System.out.printf("Hasil a*b= %f",d);
    }
}
