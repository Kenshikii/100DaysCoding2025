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
public class Day98 {
    static void fibonacci(int n){
       int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        } 
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        fibonacci(n);
    }
}
