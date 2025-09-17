/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coding;

/**
 *
 * @author Kenshikii
 */
public class PemanggilanFinalVariabel {
    public static void main(String[]args){
        //Disini kita memanggil public static Final Variabel dari kelas Day10.java
        System.out.println(Day10.USER_NAME);
        //jika ingin memanggil final variabel di kelas Day10.java
        //kita harus membuat sebuah objek dari kelas tersebut
        Day10 obj =  new Day10();
        System.out.println(obj.GRADE);
    }
}
