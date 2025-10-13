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
public class Day36 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan Kehadiran: ");
        int kehadiran = inp.nextInt();
        
        if(kehadiran <= 3){
           System.out.println("Kamu mengulang dalam matkul ini");
        }else{
           
            System.out.print("Masukkan Nilai Ujian: ");
           int ujian = inp.nextInt();
           if(ujian >= 70){
               System.out.println("Kamu Lulus");
           }else{
               System.out.println("Kamu Remedial");
           }
        }
    }
}
