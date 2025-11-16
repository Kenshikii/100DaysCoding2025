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
public class Day70 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int p = inp.nextInt();
        int l = inp.nextInt();
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= l; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
