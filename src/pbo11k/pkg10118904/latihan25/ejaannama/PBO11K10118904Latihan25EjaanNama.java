/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan25.ejaannama;
import java.util.*;
/**
 *
 * @author ACER
 */
public class PBO11K10118904Latihan25EjaanNama {
    public static Scanner input = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        System.out.print("Masukan nama depan anda untuk di eja : ");
        nama = input.next();
        System.out.println("");
        System.out.println("Ejaan untuk " + nama + "adalah : ");
        char[] srtArr = nama.toCharArray();
        for (int i=0 ; i<nama.length() ; i++){
            int j = i+1;
            System.out.println("huruf ke-"+ j +" : "+srtArr[i]);
        }
    }
    
}
