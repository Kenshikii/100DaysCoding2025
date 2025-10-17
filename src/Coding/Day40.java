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
public class Day40 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int angka1, angka2, hasil;
        char menu ;
        System.out.print("Masukkan Angka Pertama: ");
        angka1 = inp.nextInt();
        System.out.print("Masukkan Operator: ");
        menu = inp.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        angka2 = inp.nextInt();
        
        if(menu == '+'){
            hasil = angka1 + angka2;
            System.out.println("Hasil dari "+angka1+" "+menu+" "+angka2+" = "+hasil);
        }else if(menu == '-'){
            hasil = angka1 - angka2;
            System.out.println("Hasil dari "+angka1+" "+menu+" "+angka2+" = "+hasil);
        }else if(menu == '*'){
            hasil = angka1 * angka2;
            System.out.println("Hasil dari "+angka1+" "+menu+" "+angka2+" = "+hasil);
        }else if(menu == '/'){
            if(angka2 != 0){
                hasil = angka1 / angka2;
                System.out.println("Hasil dari "+angka1+" "+menu+" "+angka2+" = "+hasil);
            }else{
                System.out.println("Angka Tidak bisa dibagikan dengan nol");
            }
            
        }else if(menu == '%'){
            hasil = angka1 % angka2;
            System.out.println("Hasil dari "+angka1+" "+menu+" "+angka2+" = "+hasil);
        }else {
            System.out.println("Operator tidak ada");
        }
        
    }
}
