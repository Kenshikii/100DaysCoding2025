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
public class Day97 {
    static int luas(int sisi){
        return sisi * sisi;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sisi = inp.nextInt();
        System.out.println(luas(sisi));
    }
}
