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
public class Day79 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Apakah Sudah punya akun?(Y/N) ");
        String akun = inp.nextLine();
        
        if(akun.equalsIgnoreCase("N")){
            System.out.println("==== Registrasi Akun === ");
            System.out.print("Username : ");
            String user = inp.nextLine();
            System.out.print("Password : ");
            String password = inp.nextLine();
            while(true){
                System.out.println("=== Login Akun ===");
                System.out.print("Username : ");
                String user2 = inp.nextLine();
                System.out.print("Password : ");
                String password2 = inp.nextLine();
                
                if(user2.equals(user) && password2.equals(password)){
                    System.out.println("Selamat datang "+user2+" !!!");
                    break;
                }else{
                    System.out.println("Username/Password salah");
                }
            }
        }else if(akun.equalsIgnoreCase("Y")){
            String user = "Fiki";
            String password = "Kenshikii0209";
            while(true){
                System.out.println("=== Login Akun ===");
                System.out.print("Username : ");
                String user2 = inp.nextLine();
                System.out.print("Password : ");
                String password2 = inp.nextLine();
                
                if(user2.equals(user) && password2.equals(password)){
                    System.out.println("Selamat datang "+user2+" !!!");
                    break;
                }else{
                    System.out.println("Username/Password salah");
                }
            }
        }
    }
}
