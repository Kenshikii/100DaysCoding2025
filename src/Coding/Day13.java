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
public class Day13 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Nama : ");
        String nama = inp.nextLine();
        System.out.print("NIM :");
        final String NIM = inp.nextLine();
        System.out.println("Umur :");
        int umur = inp.nextInt();
        System.out.println("Tinggi :");
        double tinggi = inp.nextDouble();
        inp.nextLine();
        System.out.println("Jenis Kelamin (L/P) : ");
        char jk = inp.next().charAt(0);
        
        
        System.out.println("BIODATA SESEORANG \n -------------------------");
        System.out.printf("Nama : %s %n",nama);
        System.out.printf("NIM : %s %n",NIM);
        System.out.printf("Umur : %d Tahun %n",umur);
        System.out.printf("Tinggi : %.2f cm %n",tinggi);
        System.out.printf("Jenis Kelamin : %c %n",jk);
        
    }
}
