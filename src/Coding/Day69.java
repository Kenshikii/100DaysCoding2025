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
public class Day69 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int m = inp.nextInt();
        int l = inp.nextInt();
        int hasil = (m + l) % 24;
        System.out.println(hasil);
    }
}
