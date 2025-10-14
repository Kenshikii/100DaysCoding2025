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
public class Day37 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Masukkan angka");
        int angka = inp.nextInt();
        
        if(angka % 2 == 0){
            System.out.println(angka+" Adalah bilangan genap");
        }else{
            System.out.println(angka+" Adalah bilangan ganjil");

        }
    }
}
