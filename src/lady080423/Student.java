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
public class Student extends Person {
     
    public Student(){
        super ("Ali", "Padang");
        System.out.println("Inside Student : Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student : getName");
        return name;
    }

    public static void main(String[] args){
        Student student = new Student();
        System.out.println("Nama        : "+student.name);
        System.out.println("Alamat      : "+student.address);
    }
}