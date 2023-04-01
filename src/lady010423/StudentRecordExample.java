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
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord anna = new StudentRecord();
        StudentRecord cris = new StudentRecord();
        StudentRecord ali = new StudentRecord("ali");
        
        //isi data
        anna.setName("Anna");
        anna.setAddress("Padang");
        anna.setAge(18);
        
        cris.setName("Kris");
        cris.setAddress("Bukittinggi");
        cris.setAge(20);
        
        //menampilkan
        System.out.println("Data Objek Anna");
        System.out.println("Nama        :" + anna.getName());
        System.out.println("Alamat      :" + anna.getAddress());
        System.out.println("Umur        :" + anna.getAge());
        
        //memanggil method print
        System.out.println("Data Objek Kris");
        cris.print("");
        cris.print(70, 80, 90);
        
        System.out.println("Data Objek Kris");
        ali.print("");
        
        //menampilkan jumlah siswa
        System.out.println("Count = " +StudentRecord.getstudentCount());
    }
}
