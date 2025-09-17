/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coding;

/**
 *
 * @author Kenshikii
 */
public class Day10 {
    public static final String USER_NAME = "Fiki";//deklarasi public static final variabel, nilainya juga tidak bisa diubah, bedanya variabel ini
                                                  // bisa dipanggil di kelas lain selama dia dalam satu project
    final char GRADE = 'A';// deklarasi variabel final, dalam variabel tersebut, nilai nya tidak bisa diubah dan jika diubah akan error
    //kenapa deklarasi tersebut diatas public static void, karna agar variabelnya bisa di gunakan di kelas lain
    //Jika variabel tersebut didalam, dia tidak bisa dipanggil di kelas lain
    public static void main(String[]args){
       final String KELAS = "Kelas C";
        System.out.println(KELAS);
    }
    
}
