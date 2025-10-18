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
public class Day41 {
     public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = inp.nextLine();
        System.out.print("Masukkan nilai UAS: ");
        int nilai = inp.nextInt();
        System.out.print("Apakah aktif di Study Club? ");
        boolean status = inp.nextBoolean();
        
        System.out.println("Nama: "+nama);
        if(status == true){
            nilai += 5;
        }
        System.out.println("Nilai akhir: "+nilai);
        if(nilai >= 85){
            System.out.println("Status: Lulus dengan Pujian");
        }else if(nilai >= 70 && nilai <= 84){
            System.out.println("Status: Lulus");
        }else if(nilai >= 50 && nilai <= 69){
            System.out.println("Status: Remedial");
        }else if(nilai < 50){
            System.out.println("Status: Tidak Lulus");
        }
        
    }
}
