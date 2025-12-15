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
public class Day99 {
    static void prima(int n){
        boolean status = true;
        if(n != 1){
            for (int i = 2; i < n; i++) {
                if(n % i == 0){
                    status = false;
                    break;
                }
            }
        }
        if(status){
            System.out.println("Prima");
        }else{
            System.out.println("Bukan prima");
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = inp.nextInt();
        prima(n);
    }
}
