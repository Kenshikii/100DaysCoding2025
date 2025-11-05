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
public class Day59 {
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
         int angka = inp.nextInt();
         for (int i = 1; i <= angka; i++) {
            if(i % 2 == 0){
                System.out.println(i+" Adalah angka genap");
            }
        }
        for (int i = 1; i <= angka; i++) {
            if(i % 2 != 0){
                System.out.println(i+" Adalah angka ganjil");
            }
        }
    }
   
}
