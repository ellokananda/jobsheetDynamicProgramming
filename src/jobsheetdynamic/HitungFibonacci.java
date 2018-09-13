/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetdynamic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class HitungFibonacci {
    private static void tampilJudul(String identitas) {
       System.out.println("\n Hitung Fibonacci");
       System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
       
    }
    public static void main (String [] args){
        String identitas = "Ellok Ananda Madya Pratiwi / X RPL 5 / 13";
       tampilJudul(identitas);
        System.out.println("Identitas : " + identitas);
    }
    private static int tampilInput() {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Bilangan ke-: ");
        int n = scanner.nextInt();
        return n;
        
    }
    int n = tampilInput();
    private static  BigInteger fibo(int n){
        BigInteger[] hasil = new BigInteger[n];
        hasil[0] = BigInteger.ONE;
        hasil[1] = BigInteger.ONE;
        
        for (int i = 2; i < n; i++){
            hasil[i] = hasil[i-1].add(hasil[-2]);
           }
        return hasil [n-1];
    }
    
BigInteger hasil = fibo(n);
private static void tampilHasil(int n,BigInteger hasil) {
    System.out.println("Bilangan Fibonacci ke-"+n+":"+hasil);
    tampilHasil (n, hasil);
}
}
    


    
        
    



    

