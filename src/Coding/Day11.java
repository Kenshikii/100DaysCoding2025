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
public class Day11 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        String nama;
        int umur;
        
        System.out.print("Nama Kamu Siapa? : ");
        nama = inp.nextLine();
        
        System.out.print("Umur Kamu Berapa? : ");
        umur = inp.nextInt();
        
        System.out.println("Nama Kamu "+nama);
        System.out.println("Umur Kamu "+umur);
    }
    
}
