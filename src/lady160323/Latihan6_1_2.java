/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady160323;

import javax.swing.JOptionPane;

/**
 *
 * @author LABP1KOMP
 */

/*Latihan Modul 6.1.2 Struktur Kontrol*/
/*Nilai*/

public class Latihan6_1_2 {
    public static void main(String[] args){
        int nilai1;
        int nilai2;
        int nilai3;
        int rata2;
                
        nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Entri nilai 1 : "));
        nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Entri nilai 2 : "));
        nilai3 = Integer.parseInt(JOptionPane.showInputDialog("Entri nilai 3 : "));
        
        rata2 = (nilai1 + nilai2 + nilai3) / 3;
        JOptionPane.showMessageDialog(null, "Rata-rata = " + rata2); 
        
        if(rata2 >= 60)
            JOptionPane.showMessageDialog(null, ":D");
        else
            JOptionPane.showMessageDialog(null, ":-(");
    }
}
