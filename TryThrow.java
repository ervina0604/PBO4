/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author HP
 */
public class TryThrow {

    // Metode dengan try-catch
    public void bagiTryCatch(int a, int b) {
        try {
            int hasil = a / b;
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException ex) {
            System.out.println("Kesalahan: Pembagian dengan nol tidak boleh!.");
        }
    }

    // Metode dengan throws
    public void bagiThrows(int a, int b) throws ArithmeticException {
        int hasil = a / b;
        System.out.println("Hasil: " + hasil);
    }

    public static void main(String[] args) {
        TryThrow pembagian = new TryThrow();

        // try-catch
        pembagian.bagiTryCatch(10, 0); 
        System.out.println(" ");
        //throws
        try {
            pembagian.bagiThrows(10, 0); // Ini akan melempar kesalahan ke pemanggil
        } catch (ArithmeticException ex) {
            System.out.println("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
        }
    }
}
