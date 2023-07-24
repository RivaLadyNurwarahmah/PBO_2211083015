/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady060523.model;

/**
 *
 * @author User
 */
public class Karyawan extends People {
    private String nip;
    private String golongan;
    private String jabatan;
    private int jmlAnak;
    
    public Karyawan(){
    }
    
    public Karyawan(String nama, String alamat, String statusNikah, String nip, String golongan, String jabatan, int jmlAnak){
        super(nama, alamat, statusNikah);
        this.nip = nip;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.jmlAnak = jmlAnak;
    }
    
    public String getNip(){
        return nip;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    ////////////////////////////////////
    
    public String getGolongan(){
        return golongan;
    }
    public void setGolongan(String golongan){
        this.golongan = golongan;
    }
    ////////////////////////////////////
    
    public String getJabatan(){
        return jabatan;
    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    ////////////////////////////////////

    public int getjmlAnak() {
        return jmlAnak;
    }

    public void setjmlAnak(int jmlAnak) {
        this.jmlAnak = jmlAnak;
    }
}
