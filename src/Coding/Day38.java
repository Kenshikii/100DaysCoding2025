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
public class Day38 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int angka = inp.nextInt();
        
        if(angka > 0){
            System.out.println(angka+" adalah angka positif");
        }else if(angka < 0){
            System.out.println(angka+" adalah angka negatif");
        }else{
            System.out.println("angka nol");
        }
    }
}
