/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady180323;

/**
 *
 * @author User
 */

/*Latihan Modul 7.1.1 Java Array*/
/*Hari dalam Seminggu*/

public class Latihan7_1_1 {
    public static void main(String[] args) {
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // while-loop
        System.out.println("Menggunakan while-loop:");
        int i = 0;
        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }
    }
}
