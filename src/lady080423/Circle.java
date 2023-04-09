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
public class Circle extends Shape {
    private int jari2;
    
    public Circle(String nama) {
        super(nama);
        jari2= 3;
    }
        
    @Override
    public float getArea() {
        float luas;
        luas = (float) (3.14 * jari2 * jari2);
        return luas;
    }
}
