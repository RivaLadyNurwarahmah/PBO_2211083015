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
public class BukuAlamatData {
    public static void main(String[] args){  
        BukuAlamat dataAlamat[] = new BukuAlamat[100];
        BukuAlamat d1 = new BukuAlamat();
        
        //isi data
        d1.setName("Afifah");
        d1.setAddress("Sungayang");
        d1.setnoTelp("082343234323");
        d1.setEmail("afifahsabila01@gmail.com");
        dataAlamat[0] = d1;
        
        //memasukkan data
        dataAlamat[1] = new BukuAlamat("Arsiva" , "Balimbing", "081223344556", "arcipa@gmail.com");
        
        //menghapus data
        //dataAlamat[1] = null;
        
        //menampilkan
        for(BukuAlamat alamat : dataAlamat){
            if(alamat != null){
                System.out.println("Nama        : " +alamat.getName());
                System.out.println("Alamat      : " +alamat.getAddress());
                System.out.println("NoTelp      : " +alamat.getnoTelp());
                System.out.println("Email       : " +alamat.getEmail());
                System.out.println();
            }
        }
        
        //update data
        dataAlamat[0].setnoTelp("081234567891");
        System.out.println("Nomor Telepon " + dataAlamat[0].getName() + " telah diupdate");
        System.out.println("Nomor Telepon terbaru: " + dataAlamat[0].getnoTelp());
                
        //menampilkan jumlah siswa
        System.out.println("Count = " + BukuAlamat.getdataCount());
    }
}
