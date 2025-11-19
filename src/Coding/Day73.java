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
public class Day73 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        while(true){
            System.out.print("Angka 1 : ");
            int angka1 = inp.nextInt();
            if(angka1 < 0){
                break;
            }else{
                System.out.print("Angka 2 :");
                int angka2 = inp.nextInt();
                int hasil = angka1 + angka2;
                System.out.println("Hasil : "+hasil);
            }
        }
    }
}
