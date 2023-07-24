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
public class Gaji {
    private Karyawan karyawan;
    private int bulan;
    private int tahun;
    private double gajiPokok;
    private double tunjanganAnak;
    private double tunjanganIstri;
    private double totalGaji;
    
    public Gaji(){
    }
    
    public Gaji(Karyawan karyawan, int bulan, int tahun){
        this.karyawan = karyawan;
        this.bulan = bulan;
        this.tahun = tahun;
        
        setGajiPokok(karyawan);
        setTunjanganAnak(karyawan);
        setTunjanganIstri(karyawan);
        setTotalGaji();
    }
    
    public Karyawan getKaryawan(){
        return karyawan;
    }
    public int getBulan(){
        return bulan;
    }
    public int getTahun(){
        return tahun;
    }
    public double getGajiPokok(){
        return gajiPokok;
    }
    public double getTunjanganAnak(){
        return tunjanganAnak;
    }
    public double getTunjanganIstri(){
        return tunjanganIstri;
    }
    public double getTotalGaji(){
        return totalGaji;
    }
    //////////////////////////////////////////////
    
    public void setKaryawan(Karyawan karyawan){
        this.karyawan = karyawan;
    }
    
    public void setBulan(int bulan){
        this.bulan = bulan;
    }
    
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    
    public void setGajiPokok(Karyawan karyawan){
        switch(karyawan.getJabatan()){
            case "Manager":
                this.gajiPokok = 5000000;
                break;
            case "Karyawan":
                this.gajiPokok = 5000000;
                break;
            case "OB":
                this.gajiPokok = 5000000;
                break;
            default:
                this.gajiPokok = 0;
                break;
        }
    }
    public void setTunjanganIstri(Karyawan karyawan){
        if(gajiPokok != 0 && karyawan.getstatusNikah()=="Y"){
            this.tunjanganIstri = 1000000;
        }else{
            this.tunjanganIstri =0;
        }
    }
    public void setTunjanganAnak(Karyawan karyawan){
        if(gajiPokok != 0){
            this.tunjanganAnak = karyawan.getjmlAnak()*1000000;
        }else{
            this.tunjanganAnak =0;
        }
    }
    public void setTotalGaji(){
        if(gajiPokok != 0){
            this.totalGaji = gajiPokok + tunjanganAnak + tunjanganIstri;
        }else{
            this.totalGaji =0;
        }
    }
    
    
}