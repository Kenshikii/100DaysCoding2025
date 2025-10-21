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
public class Day44 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan nama Mahasiswa: ");
        String nama = inp.nextLine();
        System.out.print("Masukkan NIM : ");
        final String NIM = inp.nextLine();
        System.out.print("Masukkan nilai Siswa(1-100): ");
        int nilai = inp.nextInt();
        
        String predikat = "";
        String status = "";
        
        
        
        if(nilai > 90 && nilai <= 100 ){
           predikat = "A+";
           status = "Lulus dengan Pujian";
        }else if(nilai >= 80 && nilai <= 89 ){
           predikat = "A";
           status = "Lulus";
        }else if(nilai >= 60 && nilai <= 79 ){
           predikat = "B";
           status = "Lulus";
        }else if(nilai >= 40 && nilai <= 59 ){
           predikat = "C";
           status = "Remedial";
        }else if(nilai >= 1 && nilai <= 39 ){
           predikat = "D";
           status = "Remedial/Terancam tidak lulus";
        }else{
            predikat = "Tidak ada";
            status = "Nilai tidak valid";
        }
        
        System.out.println("=== Data mahasiswa ===");
        System.out.println("Nama \t: "+nama);
        System.out.println("NIM \t: "+NIM);
        System.out.println("Nilai \t: "+nilai);
        System.out.println("Predikat: "+predikat);
        System.out.println("Status \t: "+status);
    }
}
