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
public class Day34 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai teori: ");
        int nilai1 = inp.nextInt();
        System.out.print("Masukkan Nilai praktik: ");
        int nilai2 = inp.nextInt();
        
        int rata2 = (nilai1 + nilai2) / 2;
        System.out.println("Nilai Teori: "+nilai1);
        System.out.println("Nilai Praktik: "+nilai2);
        System.out.println("Nilai Rata - rata: "+rata2);
        System.out.println("Status Lulus: "+(nilai1 >= 70 && nilai2 >= 75));
        
    }
}
