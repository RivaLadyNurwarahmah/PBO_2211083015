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
public class People {
    protected String nama;
    protected String alamat;
    protected String statusNikah;
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getstatusNikah(){
        return statusNikah;
    }
    
    ////////////////////////////////////
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void setstatusNikah(String statusNikah){
        this.statusNikah = statusNikah;
    }
}
