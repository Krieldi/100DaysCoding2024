package ISC;

public class Day68 {

    public static void main(String[] args) {
        // Membuat objek dari kelas Day68
        Day68 day68 = new Day68();

        // Memanggil metode penjumlahan dan menampilkan hasilnya
        int hasil = day68.penjumlahan(1, 9);
                    // di panggil nama classnya setelah itu nama methodnya
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    public int penjumlahan(int a, int b) {
        return a + b;
    }
}
