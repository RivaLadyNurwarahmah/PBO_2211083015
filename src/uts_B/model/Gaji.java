/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_B.model;

/**
 *
 * @author User
 */
public class Gaji {
    private Pegawai pegawai;
    private String golongan;
    private String tanggal;
    private String gapok;
    private String tunj_anak;
    private String tunj_istri;
    
    public Gaji(){
    }
    
    public Gaji(Pegawai pegawai, String golongan, String tanggal, String gapok, String tunj_anak, String tunj_istri){
        this.pegawai = pegawai;
        this.golongan = golongan;
        this.tanggal = tanggal;
        this.gapok = gapok;
        this.tunj_anak = tunj_anak;
        this.tunj_istri = tunj_istri;
    }
    
    public Pegawai getPegawai(){
        return pegawai;
    }
    public String getGolongan(){
        return golongan;
    }
    public String getTanggal(){
        return tanggal;
    }
    public String getGapok(){
        if(golongan == "IIIA")
            System.out.println("1000000");
        else if(golongan == "IIIB" )
            System.out.println("2000000");
        else
            System.out.println("3000000");
        return gapok;
    }
    public String gettunj_Anak(){
        return tunj_anak;
    }
    public String gettunj_Istri(){
        return tunj_istri;
    }
    ////////////////////////////////////////
    
    public void setPegawai(Pegawai pegawai){
        this.pegawai = pegawai;
    }
    public void setGolongan(String golongan){
        this.golongan = golongan;
    }
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    public void setGapok(String gapok){
        this.gapok = gapok;
    }   
    public void settunj_Anak(String tunj_anak){
        this.tunj_anak = tunj_anak;
    }   
    public void settunj_Istri(String tunj_istri){
        this.tunj_istri = tunj_istri;
    }
}
