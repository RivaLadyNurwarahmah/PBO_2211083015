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
public class Pengembalian {
    private Peminjaman peminjaman;
    private String tgldikembalikan;
    private int terlambat;
    private double denda;
    
    public Pengembalian(){
    }
    
    public Pengembalian(Pengembalian pengembalian, Peminjaman peminjaman, int terlambat, double denda){
        this.peminjaman = peminjaman;
        this.tgldikembalikan = tgldikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
    }
    
    public Peminjaman getPeminjaman(){
        return peminjaman;
    }
 
    public String gettglDikembalikan(){
        return tgldikembalikan;
    }
 
    public int getTerlambat(){
        return terlambat;
    }
    
    public double getDenda(){
        return denda;
    }
    ////////////////////////////////////////
    
    public void setPeminjaman(Peminjaman peminjaman){
        this.peminjaman = peminjaman;
    }
    public void settglDikembalikan(String tgldikembalikan){
        this.tgldikembalikan = tgldikembalikan;
    }
    public void setTerlambat(int terlambat){
        this.terlambat = terlambat;
    }
    public void setDenda(double denda){
        this.denda = denda;
    }   
}
