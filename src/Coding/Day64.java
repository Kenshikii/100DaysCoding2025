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
public class Day64 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        
        int n = inp.nextInt();
        int m = inp.nextInt();
        
        int hasil = 1;
        
        for (int i = 1; i <= n; i++) {
            hasil *= m;
        }
        System.out.println(hasil);
    }
}
