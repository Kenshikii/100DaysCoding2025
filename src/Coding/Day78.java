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
public class Day78 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Nama kamu : ");
        String nama = inp.nextLine();
        System.out.print("Apakah kamu kuliah(ya/tidak) : ");
        String status = inp.nextLine();
        
        System.out.print("Masukkan angka indeks : ");
        int indek1 = inp.nextInt();
        System.out.print("Masukkan angka indeks : ");
        int indek2 = inp.nextInt();
        switch(status.toLowerCase()){
            case "ya":
                System.out.println("Semangat Kuliah");
                break;
            case "tidak":
                System.out.println("Oke");
        }
        if(nama.contains("Rifky")){
            System.out.println("Nama Kamu Diganti menjadi "+nama.replace("Rifky", "Fiki"));
        }else{
            System.out.println("Nama mu "+nama);
        }
        System.out.println("Nama kamu dari indeks "+indek1+" ke indeks "+indek2+" adalah : "+nama.substring(indek1, indek2));
        System.out.println("Nama kamu mempunyai : "+nama.length()+" karakter");
    }
}
