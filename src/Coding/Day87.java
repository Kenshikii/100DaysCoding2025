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
public class Day87 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int array[] = {50,60,39,20,34};
        System.out.print("Cari : ");
        int n = inp.nextInt();
        boolean hasil = true;
        for (int i = 0; i < array.length; i++) {
            if(n == array[i]){
                hasil = true;
                break;
            }else{
                hasil = false;
            }
        }
        System.out.println(hasil);
    }
}
