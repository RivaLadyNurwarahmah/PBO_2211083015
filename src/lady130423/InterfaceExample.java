/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady130423;

/**
 *
 * @author User
 */
public class InterfaceExample {
    public static void main(String[] args){
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        
        System.out.println(" 10 and 11 " + myInteger.isEqual(10,11));
        System.out.println(" 10 and 11 " + myDouble.isEqual(10.4,11.6));        
    }
}
