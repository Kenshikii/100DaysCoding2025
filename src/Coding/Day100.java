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
public class Day100 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean I = false;
        boolean S = false;
        String kata = inp.nextLine();
        for (int i = 0; i < kata.length(); i++) {
            char ch = kata.charAt(i);
            if(!I){
                if(ch == 'I'){
                    I = true;
                }
            }else if(!S){
                if(ch == 'S'){
                    S = true;
                }
            }else{
                if(ch == 'C'){
                    System.out.println("Cantik");
                    return;
                }
            }
        }
        System.out.println("Tidak Cantik");
    }
}
