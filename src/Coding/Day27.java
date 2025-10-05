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
public class Day27 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang Rumah :");
        int panjang = inp.nextInt();
        System.out.print("Masukkan Lebar : ");
        int lebar = inp.nextInt();
        
        int jumlah = panjang * lebar / (2*2);
        System.out.println("Keramik Yang dibutuhkan adalah : "+jumlah);
    }
}
