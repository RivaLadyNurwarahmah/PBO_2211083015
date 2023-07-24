/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady250323;

/**
 *
 * @author User
 */
 /*Latihan Modul 8.2 Argumen dari Command-Line*/

public class Latihan8_2 {
    public static void main(String[] args){
        //deklarasi
        int sum;
        int diff;
        int product;
        int quotient; 
        int a = Integer.parseInt(args[0]);  //mengubah tipe data string ke integer lalu diisi ke a
        int b = Integer.parseInt(args[1]); //mengubah tipe data string ke integer lalu diisi ke b
        
        sum = a + b; //proses penjumlahan
        diff = a - b; // proses pengurangan
        product = a * b; //proses perkalian
        quotient = a / b; //proses pembagian
         
        //output
        System.out.println("sum = " + sum);
        System.out.println("difference = " + diff);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
    }
}    