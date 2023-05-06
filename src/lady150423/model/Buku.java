/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady150423.model;

/**
 *
 * @author User
 */
public class Buku {
    private String kodebuku;
    private String judulbuku;
    private String pengarang;
    private String penerbit;
    private String tahunterbit;
    
    public Buku(){
    }
    
    public Buku(String kodebuku, String judulbuku, String pengarang, String penerbit, String tahunterbit){
        this.kodebuku = kodebuku;
        this.judulbuku = judulbuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunterbit = tahunterbit;
    }
    
    public String getkodeBuku(){
        return kodebuku;
    }
    public void setkodeBuku(String kodebuku){
        this.kodebuku = kodebuku;
    }
    ////////////////////////////////////
    
    public String getjudulBuku(){
        return judulbuku;
    }
    public void setjudulBuku(String judulbuku){
        this.judulbuku = judulbuku;
    }
    ////////////////////////////////////
    
    public String getPengarang(){
        return pengarang;
    }
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    ////////////////////////////////////
    
    public String getPenerbit(){
        return penerbit;
    }
    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    ////////////////////////////////////
    
    public String gettahunTerbit(){
        return tahunterbit;
    }
    public void settahunTerbit(String tahunterbit){
        this.tahunterbit = tahunterbit;
    }
    ////////////////////////////////////
}
