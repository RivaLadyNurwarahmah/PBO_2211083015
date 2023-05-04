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
    private Anggota anggota;
    private Buku buku;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){
    }
    
    public Peminjaman(Anggota anggota, Buku buku, String tglpinjam, String tglkembali){
        this.anggota = anggota;
        this.buku = buku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    
    public Anggota getAnggota(){
        return anggota;
    }
    public Buku getBuku(){
        return buku;
    }
    public String gettglPinjam(){
        return tglpinjam;
    }
 
    public String gettglKembali(){
        return tglkembali;
    }
    ////////////////////////////////////////
    
    public void setAnggota(Anggota anggota){
        this.anggota = anggota;
    }
    public void setBuku(Buku buku){
        this.buku = buku;
    }
    public void settglPinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
    public void settglKembali(String tglkembali){
        this.tglkembali = tglkembali;
    }   
}

