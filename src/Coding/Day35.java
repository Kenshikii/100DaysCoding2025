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
public class Day35 {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      int a = inp.nextInt();
      
      if(a >= 70){
          System.out.println("Nilai kamu diatas 70");
      }else{
          System.out.println("Nilai kamu dibawah ");
      }
    }
}
