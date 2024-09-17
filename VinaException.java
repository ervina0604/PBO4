/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author HP
 */
public class VinaException extends ArithmeticException{
    public VinaException(String s){
        super(s);
    }
   
     public static void bagiTryCatch(int a, int b) {
        try {
            if (b == 0) {
                throw new VinaException("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
            }
            int hasil = a / b;
            System.out.println("Hasil: " + hasil);
        } catch (VinaException ex) {
            System.out.println(ex.getMessage());
        }
    }   

     public static void main(String[] args) {
      VinaException.bagiTryCatch(10, 0);
    }  
}

