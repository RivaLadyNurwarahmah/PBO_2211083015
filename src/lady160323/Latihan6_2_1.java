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
public class Latihan6_2_1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int angka;
        
        try {
            System.out.print("Masukkan angka = ");
            angka = Integer.parseInt(dataIn.readLine());
            
            if(angka>=0 && angka<=10)
                System.out.println("Valid Number");
            else
                System.out.println("Invalid Number");
            } catch (Exception ex) {
        }
    }
}
