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
public class BukuAlamat {
   private String name;
   private String address;
   private String noTelp;
   private String email;
   
   private static int dataCount;
   
   //constructor
   public BukuAlamat(){
       //area inisialisasi kode;
       dataCount++;
   }
   
   public BukuAlamat(String temp){
       this.name = temp;
       dataCount++;
   }
   
   public BukuAlamat(String name, String address, String noTelp, String email){
       this.name = name;
       this.address = address;
       this.noTelp = noTelp;
       this.email = email;
       dataCount++;
   }
   
   //accessor dan mutator mehtod
   public String getName(){
       return name;
   }
   
   public void setName(String name){
       this.name = name;
   }
   /////////////////////////////////
   
   public String getAddress(){
       return address;
   }
   
   public void setAddress(String address){
       this.address = address;
   }
   //////////////////////////////////////
   
   public String getnoTelp(){
       return noTelp;
   }
   
   public void setnoTelp(String noTelp){
       this.noTelp = noTelp;
   }
   //////////////////////////////////////
   
   public String getEmail(){
       return email;
   }
   
   public void setEmail(String email){
       this.email = email;
   }
   /////////////////////////////////
   
   public static int getdataCount(){
       return dataCount;
   }
   /////////////////////////////////
   
   //method menambah data
   public void tambahData(String name, String address, String noTelp, String email){
       this.name = name;
       this.address = address;
       this.noTelp = noTelp;
       this.email = email;
   }        
}
