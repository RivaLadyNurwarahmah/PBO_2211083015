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
public abstract class Shape {
    private String name;
    public Shape(String nama) {
        name = nama; 
    }
    
    public String getName() {
        return name;
    }

    public abstract float getArea();
}
