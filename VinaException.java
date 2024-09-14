/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author HP
 */
public class VinaException extends Exception{
    public VinaException(String s){
        super(s);
    }
    
     public static void main(String[] args) {
        try{
          throw new VinaException("Terjadi kesalahan! Silakan periksa kembali");
          
      }  catch (VinaException ex){
          System.out.println("Aduh! Ada yang salah di sini:" + String.valueOf(ex));
      }
    }  
}
