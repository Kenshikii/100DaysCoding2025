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
public class Day46 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("=== Menu Minuman Kafe ===");
        System.out.println("1. Kopi Hitam - Rp10.000");
        System.out.println("2. Cappucino - Rp15.000");
        System.out.println("3. Teh Tarik - Rp12.000");
        System.out.println("4. Jus Mangga - Rp13.000");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
        int opsi = inp.nextInt();
        
        
        int harga = 0;
        int total = 0;
        int jumlah;
        
        switch(opsi){
            case 1:
                System.out.print("Masukkan jumlah gelas: ");
                jumlah = inp.nextInt();
                harga = 10000;
                total = harga * jumlah;
                System.out.println("Anda memesan "+jumlah+" gelas Kopi Hitam");
                System.out.println("Total harga: Rp"+total);
                break;
            case 2:
                System.out.print("Masukkan jumlah gelas: ");
                jumlah = inp.nextInt();
                harga = 15000;
                total = harga * jumlah;
                System.out.println("Anda memesan "+jumlah+" gelas Cappucino");
                System.out.println("Total harga: Rp"+total);
                break;
            case 3:
                System.out.print("Masukkan jumlah gelas: ");
                jumlah = inp.nextInt();
                harga = 12000;
                total = harga * jumlah;
                System.out.println("Anda memesan "+jumlah+" gelas Teh Tarik");
                System.out.println("Total harga: Rp"+total);
                break;
            case 4:
                System.out.print("Masukkan jumlah gelas: ");
                jumlah = inp.nextInt();
                harga = 13000;
                total = harga * jumlah;
                System.out.println("Anda memesan "+jumlah+" gelas Jus Mangga");
                System.out.println("Total harga: Rp"+total);
                break;
            case 5:
                System.out.println("Terima kasih telah berkunjung!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
                
        }
    }
}
