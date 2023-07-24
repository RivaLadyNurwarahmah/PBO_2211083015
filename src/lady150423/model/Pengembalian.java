/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady150423.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class Pengembalian {
    private String tgldikembalikan;
    private int terlambat;
    private double denda;
    private String strterlambat;
    private String strdenda;
    
    public Pengembalian(){}
    
    public Pengembalian(String tglKembali,String tgldikembalikan){
        try{
            this.tgldikembalikan = tgldikembalikan;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate deadline = LocalDate.parse(tglKembali, formatter);
            LocalDate tanggalKembali = LocalDate.parse(this.tgldikembalikan, formatter);

            //mencari keterlambatan
            terlambat = 0;
            if (tanggalKembali.isAfter(deadline)) {
                terlambat = tanggalKembali.compareTo(deadline);
            }
            strterlambat = ""+terlambat;

            //mencari denda
            denda = (double)terlambat*500;
            strdenda = ""+ denda;
        }catch(Exception e){
            this.tgldikembalikan = "Belum Dikembalikan";
            strterlambat = "";
            terlambat = -1;
            strdenda = "";
            denda = -1;
        }
    }

    public String getTgldikembalikan() {
        return tgldikembalikan;
    }

    public String getTerlambat() {
        return strterlambat;
    }

    public String getDenda() {
        return strdenda;
    }
    ////////////////////////////////////////////////////////

    public void setTgldikembalikan(String tgldikembalikan) {
        this.tgldikembalikan = tgldikembalikan;
    }

    public void setTerlambat(String tglkembali) {
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate deadline = LocalDate.parse(tglkembali, formatter);
            LocalDate tanggalKembali = LocalDate.parse(this.tgldikembalikan, formatter);

            terlambat = 0;
            if (tanggalKembali.isAfter(deadline)) {
                terlambat = tanggalKembali.compareTo(deadline);
            }
            strterlambat = String.valueOf(terlambat);
        }catch(Exception e){
            terlambat = -1;
            strterlambat = "";
        }    
    }

    public void setDenda() {
        if(terlambat != -1){
            denda = (double)terlambat*500;
            strdenda = "" + denda;
        }else{
            denda = -1;
            strdenda = "";
        }
    }
}