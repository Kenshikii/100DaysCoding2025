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
public class Day86 {
    public static void main(String[] args) {
        int array[] = {50,40,89,90,76};
        int rendah = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < rendah){
                rendah = array[i];
            }
        }
        System.out.println(rendah);
    
    }
}
