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
public class Day84 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int n = inp.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                total += i;
            }
        }
        System.out.println(total);
    }
}
