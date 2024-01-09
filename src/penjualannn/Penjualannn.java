/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penjualannn;

/**
 *
 * @author Asus
 */
public class Penjualannn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koneksi.getKoneksi();
        new Login().setVisible(true);
    }
    
   public static void oke(){
    new Home().setVisible(true);
  
    }

}
