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

/*Latihan Modul 7.1.2 Java Array*/
/*Hari dalam Seminggu*/

public class Latihan7_1_2 {
    public static void main(String[] args) {
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    
        System.out.println("\nMenggunakan do-while-loop:");
        int j = 0;
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);
    }
}
