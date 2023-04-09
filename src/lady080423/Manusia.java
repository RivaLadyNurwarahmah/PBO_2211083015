/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady080423;

/**
 *
 * @author User
 */
public class Manusia extends LivingThing {

    @Override
    public void berjalan() {
        System.out.println("Berjalan manusia");
    }
    
    public static void main(String[] args){
        Manusia m = new Manusia();
        m.bernafas();
        m.makan();
        m.berjalan();
    }
}
