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
public class Day96 {
    static int penjumlahan(int angka1,int angka2){
        return angka1 + angka2;
    }
    static int pengurangan(int angka1,int angka2){
        return angka1 - angka2;
    }
    static int perkalian(int angka1,int angka2){
        return angka1 * angka2;
    }
    static int pembagian(int angka1,int angka2){
        return angka1 / angka2;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int angka1 = inp.nextInt();
        char operator = inp.next().charAt(0);
        int angka2 = inp.nextInt();
        
        if(operator == '+'){
            System.out.println("= "+penjumlahan(angka1, angka2));
        }else if(operator == '-'){
            System.out.println("= "+pengurangan(angka1, angka2));
        }else if(operator == '*'){
            System.out.println("= "+perkalian(angka1, angka2));
        }else if(operator == '/'){
            System.out.println("= "+pembagian(angka1, angka2));
        }
    }
}
