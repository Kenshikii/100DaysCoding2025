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
public class Day90 {
    static int hitungKeliling(int sisi){
        return sisi * 4;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sisi = inp.nextInt();
        System.out.println(hitungKeliling(sisi));
    }
}
