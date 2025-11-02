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
public class Day55 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Batas Bawah : ");
        int bawah = inp.nextInt();
        System.out.print("Batas Atas : ");
        int atas = inp.nextInt();
        System.out.print("Angka : ");
        int angka = inp.nextInt();
        
        if(angka >= bawah && angka <= atas){
            System.out.println("YAYAYAYA");
        }else{
            System.out.println("NONONONO");
        }
    }
}
