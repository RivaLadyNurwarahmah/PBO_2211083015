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

/*Latihan Modul 6.4.3 Struktur Kontrol*/
/*Perpangkatan*/

public class Latihan6_4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = input.nextInt();
        int hasil = 1;
        for (int counter = 1; counter <= pangkat; counter++) {
            hasil *= angka;
        }
        System.out.println(angka + " pangkat " + pangkat + " adalah " + hasil);
    }
}
