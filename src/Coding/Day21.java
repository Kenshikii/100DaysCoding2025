/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coding;

/**
 *
 * @author Kenshikii
 */
public class Day21 {
    public static void main(String[] args) {
        
        // Menukar 2 nilai Variabel
        int a = 20;
        int b = 15;
        
        System.out.println("Nilai Awal A : "+a+"\nDan nilai awal B : "+b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Nilai A : "+a+"\nDan nilai B : "+b);
         
    }
}
