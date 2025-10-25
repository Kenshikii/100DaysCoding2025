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
public class Day48 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int angka1 = inp.nextInt();
        char operator = inp.next().charAt(0);
        int angka2 = inp.nextInt();
        
        int hasil = 0;
        switch(operator){
            case '+':
                hasil = angka1 + angka2;
                System.out.println("= "+hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("= "+hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("= "+hasil);
                break;
            case '/':
                if(angka2 != 0){
                    hasil = angka1 / angka2;
                    System.out.println("= "+hasil);
                }else{
                    System.out.println("Tidak bisa dibagi dengan nol");
                }
                
                break;
            case '&':
                hasil = angka1 % angka2;
                System.out.println("= "+hasil);
                break;    
        }
        
    }
}
