/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady160323;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan6_4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = input.nextInt();
        int hasil = 1;
        int counter = 1;
        do {
            hasil *= angka;
            counter++;
        } while (counter <= pangkat);
        System.out.println(angka + " pangkat " + pangkat + " adalah " + hasil);
    }
}
