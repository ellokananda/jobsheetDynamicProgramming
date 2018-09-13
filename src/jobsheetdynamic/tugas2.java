/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetdynamic;

/**
 *
 * @author User
 */
public class tugas2 {
    public static void main (String [] args){
        int n = 431;
        int berat [] = new int [] {4,5,2,3,7};
        int jumlah;
        
        for (int i = 0; i < berat.length; i++){
        if (n >= berat [i]){
        jumlah = n / berat [i];
        n = n%berat [i];
        System.out.println("Berat " + berat[i] + "kg" + " sebanyak " + jumlah );
        int upah [] = new int [] {5000,7000,2000,3000,10000};
        System.out.println("upah " + upah [i]*jumlah);
      
        }
        }
    }
}
        
    
    
    

