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
public class Day12 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        
        System.out.print("========== Masukkan BIODATA ANDA ========== \n");
        System.out.print("Masukkan Nama Anda : ");
        String nama = inp.nextLine();
        System.out.print("Tempat, Tanggal Lahir : ");
        String ttl = inp.nextLine();
        System.out.print("Jenis Kelamin Anda(L/P) : ");
        char jk = inp.next().charAt(0);
        inp.nextLine();
        System.out.print("Masukkan Alamat Anda : ");
        String alamat = inp.nextLine();
        System.out.print("Masukkan Agama Anda : ");
        String agama = inp.nextLine();
        System.out.print("Nomor Hp Anda : ");
        String nomor = inp.nextLine();
        System.out.print("Alamat Email Anda :");
        String email = inp.nextLine();
        System.out.print("Hobi Anda : ");
        String hobi = inp.nextLine();
        
        System.out.println("");
        
        
        System.out.println("========== Biodata Mahasiswa ========== \n");
        System.out.println("Nama : "+nama);
        System.out.println("Tempat, Tanggal Lahir :"+ttl);
        System.out.println("Jenis Kelamin : "+jk);
        System.out.println("Alamat : "+alamat);
        System.out.println("Agama : "+agama);
        System.out.println("Nomor Hp : "+nomor);
        System.out.println("Email : "+email);
        System.out.println("Hobi : "+hobi);
        
    }
}
