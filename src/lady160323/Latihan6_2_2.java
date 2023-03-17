/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady160323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author LABP1KOMP
 */
public class Latihan6_2_2 {
    public static void main(String[] args){ 
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int angka = 0;
            
        String hasil = "";
        try {
            System.out.print("Masukkan angka = ");
            angka = Integer.parseInt(dataIn.readLine());
            
            switch(angka){
            case 1: 
                System.out.println("Valid Number");
                break;
            case 2: 
                System.out.println("Valid Number");
                break;
            case 3:
                System.out.println("Valid Number");
                break;
            case 4:
                System.out.println("Valid Number");
                break;
            case 5:
                System.out.println("Valid Number");
                break;
            case 6:
                System.out.println("Valid Number");
                break;
            case 7:
                System.out.println("Valid Number");
                break;
            case 8:
                System.out.println("Valid Number");
                break;
            case 9:
                System.out.println("Valid Number");
                break;
            case 10:
                System.out.println("Valid Number");
                break;
            default: 
                System.out.println("Invalid Number");
                break;
            } 
            } catch (Exception ex) {
        }
    }
}
    

