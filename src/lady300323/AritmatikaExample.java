/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady300323;

/**
 *
 * @author User
 */
public class AritmatikaExample {
    public static void main(String[] args){
        Aritmatika1 art = new Aritmatika1();
        int c = art.tambah(5,6);
        System.out.println("Hasil : " + c);
        System.out.println("Ganjil?" + art.cekGanjil(c));
        art.BilanganGanjil(5);
        System.out.println("Prima?" + art.isPrima(c));
        art.BilanganPrima(5);
    }
}
