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
public class Employee extends Person {
    
    @Override
    public String getName(){
        System.out.println("Employee : getName");
        return name;
    }
}
