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
public class CatatanSiswa extends StudentRecord {
    //latihan modul 11.6.1 OOP 1
    
    private double compGrade;
    
    public CatatanSiswa(){
        super ("Anna", "Padang");
        System.out.println("Inside CatatanSiswa : Constructor");
    }
    
    public double getcompGrade(){
        return compGrade;
    }
    
    public void setcompGrade(double compGrade){
        this.compGrade = compGrade;
    }
    
    @Override
    public double getAverage(){
        return (getmathGrade() + getenglishGrade() + getscienceGrade()+ getcompGrade()) / 4;
    }
    
    public void Average(){
        System.out.println("Rata-rata        :"+ getAverage());
    }
  
    public static void main(String[] args){
        CatatanSiswa cs = new CatatanSiswa();
        cs.Average();
    }
}
