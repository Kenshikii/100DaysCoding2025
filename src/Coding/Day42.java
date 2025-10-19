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
public class Day42 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int gajipokok = 0;
        double tunjangan = 0;
        double pajak;
        double gajiakhir;
        
        System.out.print("Nama karyawan: ");
        String nama = inp.nextLine();
        System.out.print("Jabatan karyawan(Manajer/Supervisor/Staff): ");
        String jabatan = inp.nextLine();
        System.out.print("Status pernikahan(Menikah/belum menikah): ");
        String status = inp.nextLine();
        
        if(jabatan.equalsIgnoreCase("Manajer")){
            gajipokok = 10000000;
            
        }else if(jabatan.equalsIgnoreCase("Supervisor")){
            gajipokok = 7000000;
            
        }else if(jabatan.equalsIgnoreCase("Staff")){
            gajipokok = 5000000;
            
        }
        
        if(status.equalsIgnoreCase("menikah")){
            tunjangan = gajipokok * 0.1;
            double gajitunjangan = gajipokok + tunjangan;
            pajak = gajitunjangan * 0.05;
            gajiakhir = gajitunjangan - pajak;
            
            
        }else{
            pajak = gajipokok * 0.05;
            gajiakhir = gajipokok - pajak;
        }
        
        
        
        System.out.println("Nama karyawan : "+nama);
        System.out.println("Jabatan : "+jabatan);
        System.out.println("Gaji pokok : "+gajipokok);
        System.out.println("Tunjangan : "+tunjangan);
        System.out.println("Pajak : "+pajak);
        System.out.println("Gaji bersih : "+gajiakhir);
        
    }
}
