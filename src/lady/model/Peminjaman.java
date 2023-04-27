/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady.model;

/**
 *
 * @author User
 */
public class Peminjaman {
    private String nobp;
    private String kodebuku;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){
    }
    
    public Peminjaman(String nobp, String kodebuku, String tglpinjam, String tglkembali){
        this.nobp = nobp;
        this.kodebuku = kodebuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    
    public String getNobp(){
        return nobp;
    }
    public void setNobp(String nobp){
        this.nobp = nobp;
    }
    //////////////////////////////////////
    
    public String getkodeBuku(){
        return kodebuku;
    }
    public void setkodeBuku(String kodebuku){
        this.kodebuku = kodebuku;
    }
    //////////////////////////////////////
    
    public String gettglPinjam(){
        return tglpinjam;
    }
    public void settglPinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
    ///////////////////////////////////////
    
    public String gettglKembali(){
        return tglkembali;
    }
    public void settglKembali(String tglkembali){
        this.tglkembali = tglkembali;
    }
    ////////////////////////////////////////
}
