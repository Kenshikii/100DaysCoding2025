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
public class Day50 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int angka = inp.nextInt();
        
        String output = (angka % 2 == 0) ? angka+" adalah angka genap" : angka+" adalah angka ganjil" ; 
        System.out.println(output);
    }
}
