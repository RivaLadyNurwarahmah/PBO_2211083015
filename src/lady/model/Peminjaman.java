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
    private String kodepeminjaman;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){
    }
    
    public Peminjaman(Anggota anggota, Buku buku, String kodepeminjaman, String tglpinjam, String tglkembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.kodepeminjaman = kodepeminjaman;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }

    public Anggota getKodeanggota() {
        return anggota;
    }

    public Buku getKodebuku() {
        return buku;
    }

    public String getKodepeminjaman() {
        return kodepeminjaman;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setKodeanggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public void setKodebuku(Buku buku) {
        this.buku = buku;
    }

    public void setKodepeminjaman(String kodepeminjaman) {
        this.kodepeminjaman = kodepeminjaman;
    }
    
    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }
}