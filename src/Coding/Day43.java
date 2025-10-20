/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coding;

import java.util.Scanner;

/**
 *
 * @author Kenshikii
 */
public class Day43 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");
        int angka = inp.nextInt();
        
        if(angka % 3 == 0 && angka % 5 == 0){
            System.out.println("Angka "+angka+" adalah kelipatan 3 dan 5");
        }else if(angka % 3 == 0){
           System.out.println("Angka "+angka+" adalah kelipatan 3"); 
        }else if(angka % 5 == 0){
            System.out.println("Angka "+angka+" adalah kelipatan 5");
        }
    }
}
