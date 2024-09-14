package ISC;

public class evaluasiDay13 {
    
    public static void main(String[] args) {
        //soal 1
        String name= "Krieldi";
        String add="Mamasa";
        int age=16;
        
        System.out.println("Nama: "+name);
        System.out.print("Alamat: "+add);
        System.out.printf("\nUmur: %d tahun\n",age);
        
        //soal 2
        final char inisial ='k';//final tidak bisa di update
        
        int bulan_lahir= 9;
        bulan_lahir = 10;
                
        System.out.println("Inisial: "+inisial);
        System.out.println("BUlan Lahir: "+bulan_lahir);
    }
}
