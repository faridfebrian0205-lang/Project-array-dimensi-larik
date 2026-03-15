import java.util.Scanner;

public class ArrayLarik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5];  // membuat array dengan 5 elemen

        // input data
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }

        System.out.println("\nData yang dimasukkan:");

        // menampilkan data
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + " = " + nilai[i]);
        }

        input.close();
    }
}