/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady010423;

/**
 *
 * @author User
 */
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    
    private static int studentCount; //class variabel
    
    public StudentRecord()
    {
        //area inisialisasi kode; 
        studentCount++;
    } 

    public StudentRecord(String temp)
    { 
        this.name = temp;
        studentCount++;
    } 

    public StudentRecord(String name, String address)
    { 
        this.name = name; 
        this.address = address; 
        studentCount++;
    } 

    public StudentRecord(double mGrade, double eGrade, double sGrade)
    { 
        mathGrade = mGrade; 
        englishGrade = eGrade; 
        scienceGrade = sGrade;
        studentCount++;
    }
    //*************************************************
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    /////////////////////////////////////////////
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    /////////////////////////////////////////////
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    ////////////////////////////////////////////
    public double getmathGrade(){
        return mathGrade;
    }
    
    public void setmathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    ////////////////////////////////////////////
    public double getenglishGrade(){
        return englishGrade;
    }
    
    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    ///////////////////////////////////////////
    public double getscienceGrade(){
        return scienceGrade;
    }
    
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    ////////////////////////////////////////////
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    ///////////////////////////////////////////
    public static int getstudentCount(){
        return studentCount;
    }
    //////////////////////////////////////////
    public void print( String temp )
    { 
        System.out.println("Name:" + name); 
        System.out.println("Address:" + address); 
        System.out.println("Age:" + age); 
    } 
    
    public void print(double eGrade, double mGrade, double sGrade)
    {
        System.out.println("Name            :" + name); 
        System.out.println("Math Grade      :" + mGrade); 
        System.out.println("English Grade   :" + eGrade); 
        System.out.println("Science Grade   :" + sGrade);
    }
}