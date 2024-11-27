package ISC;

public class Day87 {

    public static void main(String[] args) {
        // Mengubah Nilai Array satu dimensi pada index Tertentu
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array Asli : ");
        printArray(array);
        array[4] = 4;
        System.out.println("\nArray Setelah Diubah : ");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
