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
public class Day74 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int makanan = 0;
        int porsi = 0;
        do{
            System.out.println(" === Menu Pilihan === ");
            System.out.println("1. Makanan \n2. Minuman\n3. Keluar ");
            int menu = inp.nextInt();
            if(menu == 1){
                System.out.println("=== Menu Makanan ===");
                System.out.print("1. Nasi Goreng\n2. Ayam Bakar\n3. Mie Goreng\n");
                makanan = inp.nextInt();
                System.out.print("Berapa Porsi : ");
                porsi = inp.nextInt();
                System.out.println("Terima Kasih Telah memesan !!!");
            }else if(menu == 2){
                System.out.println("=== Menu Makanan ===");
                System.out.println("1. Es Teh\n2. Coklat Panas\n3. Es Jeruk");
                makanan = inp.nextInt();
                System.out.print("Berapa Porsi : ");
                porsi = inp.nextInt();
                System.out.println("Terima Kasih Telah memesan !!!");
            }else if(menu == 3){
                break;
            }else{
                System.out.println("Menu tidak ada");
            }
        }while(true);
    }
}
