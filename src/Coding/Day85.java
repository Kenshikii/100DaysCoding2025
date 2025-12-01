/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coding;

/**
 *
 * @author Kenshikii
 */
public class Day85 {
    public static void main(String[] args) {
        int array[] = {50,40,89,90,76};
        int tinggi = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > tinggi){
                tinggi = array[i];
            }
        }
        System.out.println(tinggi);
    }
}
