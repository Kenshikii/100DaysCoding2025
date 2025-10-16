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
public class Day39 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama: ");
        int angka1 = inp.nextInt();
        System.out.print("Masukkan Angka Kedua: ");
        int angka2 = inp.nextInt();
        System.out.println("");
        System.out.println("======= Pilih Menu Aritmatika =======");
        System.out.println("1. Penjumlahan \n2. Perkalian \n3. Pengurangan \n4. Pembagian \n5. Modulus");
        System.out.print(": ");
        int menu = inp.nextInt();
        
        if(menu == 1){
            System.out.println(angka1+" + "+angka2+" = "+(angka1+angka2));
        }else if(menu == 2){
            System.out.println(angka1+" * "+angka2+" = "+(angka1*angka2));
        }else if(menu == 3){
            System.out.println(angka1+" - "+angka2+" = "+(angka1-angka2));
        }else if(menu == 4){
            System.out.println(angka1+" / "+angka2+" = "+(angka1/angka2));
        }else if(menu == 5){
            System.out.println(angka1+" % "+angka2+" = "+(angka1%angka2));
        }else{
            System.out.println("Menu "+menu+" tidak ada");
        }
        
    }
}
