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
public class Day49 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan angka:");
        int angka = inp.nextInt();
        
        String output = (angka == 1) ? angka+" adalah angka 1" : "Angka bukan angka 1";
        System.out.println(output);
        
    }
}
