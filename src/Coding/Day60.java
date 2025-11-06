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
public class Day60 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int n = inp.nextInt();
        System.out.println("");
        for (int i = n; i >=  1; i--) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("----------");
        for (int i = n; i >=  1; i--) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
