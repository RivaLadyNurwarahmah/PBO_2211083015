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

/*Latihan Modul 6.1.1 Struktur Kontrol*/
/*Nilai*/

public class Latihan6_1_1{
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int nilai1;
        int nilai2;
        int nilai3;
        
        try {
            System.out.print("Entri nilai 1 : ");
            nilai1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri nilai 2 : ");
            nilai2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri nilai 3 : ");
            nilai3 = Integer.parseInt(dataIn.readLine());
        
            int rata2 = (nilai1 + nilai2 + nilai3) / 3;
            System.out.println("Rata-rata = " + rata2);
            
            if(rata2 >= 60)
                System.out.println(":D");
            else
                System.out.println(":-(");
            } catch (Exception ex) {
        }
    }
}
