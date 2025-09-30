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
public class Day23 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Panjang : ");
        double panjang = inp.nextDouble();
        System.out.print("Masukkan Lebar : ");
        double lebar = inp.nextDouble();
        
        double luas = panjang * lebar;
        System.out.println("Jadi, Luas Persegi panjang Tersebut Adalah : "+luas);
    }
}
